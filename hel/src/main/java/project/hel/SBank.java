import cn.hyperchain.annotations.StoreField;
import cn.hyperchain.contract.BaseContract;
import cn.hyperchain.core.HyperMap;
import cn.hyperchain.core.Logger;

        package project.hel;

/**
 * Author: hyperchain
 * Package: project.example
 * Description: a smart contract example named SimulateBank
 */

public class SBank extends BaseContract implements ISBank, ISBank2 {
    @StoreField
    public String name = "SBANK";

    @StoreField
    public HyperMap<String, Integer> accounts = new HyperMap<String, Integer>();

    public int version = 1;

    private Logger logger = Logger.getLogger(SBank.class);

    public SBank() {
    }

    @Override
    public void onInit() {
        this.accounts.put("AAA", 1000);
        this.accounts.put("BBB", 1000);
        this.accounts.put("CCC", 1000);
        this.accounts.put("DDD", 1000);
    }

    public boolean transfer(String from, String to, int value) {
        logger.notice("transfer " + "from: " + from + " to: " + to + " value: " + value);
        // account not exist or balance not enough
        if (!this.accounts.containsKey(from) || this.accounts.get(from) < value) {
            return false;
        }
        // if to account not exist, create
        if (!this.accounts.containsKey(to)) {
            this.accounts.put(to, 0);
        }

        // do transaction
        this.accounts.put(from, this.accounts.get(from) - value);
        this.accounts.put(to, this.accounts.get(to) + value);
        logger.notice("account: " + from + " balance: " + this.accounts.get(from));
        logger.notice("account: " + to + " balance: " + this.accounts.get(to));
        return true;
    }

    @Override
    public boolean withdraw(String from, int value) {
        logger.notice("withdraw " + " from: " + from + " value: " + value);
        if (!this.accounts.containsKey(from) || this.accounts.get(from) < value) {
            return false;
        }
        this.accounts.put(from, this.accounts.get(from) - value);
        return true;
    }

    @Override
    public boolean deposit(String from, int value) {
        logger.notice("deposit " + " from: " + from + " value: " + value);
        // if to account not exist, create
        if (!this.accounts.containsKey(from)) {
            this.accounts.put(from, 0);
        }
        this.accounts.put(from, this.accounts.get(from) + value);
        return true;
    }


    @Override
    public void onCreated() {
        logger.notice("SBank contract created");
    }

    @Override
    public void onPreCommit() {
        logger.notice("SBank contract precommit");
    }

    @Override
    public void onCommitted() {
        logger.notice("SBank contract committed");
    }
}
