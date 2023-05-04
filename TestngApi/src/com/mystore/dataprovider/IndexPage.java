package com.mystore.dataprovider;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.base.BaseClass;

public class IndexPage  extends BaseClass{
	
	@FindBy(xpath="//*[@id=\'ap_email']")
	WebElement SignInbtn;
	@FindBy(xpath="//*[@id='nav-logo-sprites']")
	WebElement myStoreLogo;
	@FindBy(id="//*[@id=\'twotabsearchtextbox']")
	WebElement SearchProductBox;
	@FindBy(xpath="//*[@id=\'nav-search-submit-button']")
	WebElement submitSearch;
	public void IndexPage()
	{
		
		PageFactory.initElements(myStoreLogo, this);
		
	}
	
	
	
	

}
