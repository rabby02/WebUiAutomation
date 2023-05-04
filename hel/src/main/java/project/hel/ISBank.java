package project.hel;

import cn.hyperchain.contract.BaseContractInterface;

/**
 * Author: hyperchain
 * Package: project.hel
 * Description: an alternative interface used to be delivered to application
 */
public interface ISBank extends BaseContractInterface {
    boolean transfer(String from, String to, int val);
    boolean deposit(String from, int val);
}
