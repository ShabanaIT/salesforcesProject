package pages;


import org.openqa.selenium.WebElement;

import base.Base;


public class LandingPage extends Base{
	//public static By menuLogin = By.xpath("");
	
	public  void navigateurl() {
		navigateURL(host);		
	}
	
	
	public void hoverOnLogin() {
		 WebElement login = (WebElement)js.executeScript("return document.querySelector('hgf-c360nav').shadowRoot.querySelector('li.utility-icons-items.login>hgf-c360login').shadowRoot.querySelector('span:nth-child(2)')");
		 mousehover(login);		
	}
	public void clickOnSalesforce() {
		 WebElement salesforce = (WebElement)js.executeScript("return document.querySelector('hgf-c360nav').shadowRoot.querySelector('li[class=\"utility-icons-items login\"]>hgf-c360login').shadowRoot.querySelector('h4')");
		 click(salesforce);		
	}
	
	
}
