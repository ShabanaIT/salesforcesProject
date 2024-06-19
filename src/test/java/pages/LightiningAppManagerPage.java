package pages;

import org.openqa.selenium.By;

import base.Base;

public class LightiningAppManagerPage extends Base {
	String devoloperName;
	By nurseryButton ;
	By xpathDevName ;
	String appname ;
	public void xpathText(String devName){
		
		devoloperName = devName;
		nurseryButton =	By.xpath("//span[text()='"+devoloperName+"']/parent::span/parent::td/following-sibling::td[last()]/span/div/a/span/span[1]");			
		//span[text()='Testpilot11JAAJ']
		xpathDevName = By.xpath("//span[text()='"+devoloperName+"']");
		
	}		 
	By editButton = By.xpath("//body/div[last()]/div/ul/li[1]/a");
	By deleteButton = By.xpath("//body/div[last()]/div/ul/li[2]/a");
	By delete = By.xpath("//span[text()='Delete']");
	By appMenu = By.xpath("//a[text()='Apps']");
	By appManagerButton = By.xpath("//a[text()='App Manager']");
	By newLightningButton = By.xpath("//span[text()='New Lightning App']");
    By profileMenu = By.xpath("//span[text()='View profile']/parent::div/span/div");
	By logOutButton = By.xpath("//a[text()='Log Out']");
    By deleteMobileAppPopUp  = By.cssSelector(".title.slds-text-heading--medium.slds-hyphenate");
    
	public void clickOnApp() {
		click(appMenu);
	}
	public void clickOnAppManager() {
		click(appManagerButton);
	}
	public void clickOnNewLightningApp() {
		click(newLightningButton);
	}
	public void clickOnnursery() {
		click(nurseryButton);
	}
	public void clickEditButton() {
		click(editButton);
	}
	public void clickDeleteButton() {
		click(deleteButton);
		
	}
	
	public void clickDelete() {		
		click(delete);
	}
	
	public void clickViewProfile() {
		click(profileMenu);
	}
	public void clickLogOutButton() {
		click(logOutButton);
	}
	public String getDeveloperName() {
		System.out.println("devoloperName :"+devoloperName);
		
		String actualText = getElementText(xpathDevName);
		
		return actualText;
	}
	
	public String getDeleteText() {		
		String actualText = getElementText(deleteMobileAppPopUp);	    
		return actualText;
	
	}
	
	
	
	
	
	
	
}