package step_definitions;

import org.junit.Assert;

import base.Base;
import io.cucumber.java.en.Then;
import pages.LightiningAppManagerPage;
import pages.PopUpWindow_AppDetailsAndBrandingPage;

public class Verify_Delete_MobileApp_Popup_window_functionalities extends Base{

	PopUpWindow_AppDetailsAndBrandingPage popUpWindow_AppDetailsAndBrandingPage = new PopUpWindow_AppDetailsAndBrandingPage();
	LightiningAppManagerPage lightiningAppManagerPage =new LightiningAppManagerPage();

	String appname ;
	@Then("I click on saveAndfinish")
	public void i_click_on_saveAndfinish() {
		popUpWindow_AppDetailsAndBrandingPage.clickSaveAndFinishButton();
		
	}

	
	@Then("Verify developerName {string}")
	
	public void verify_developerName(String developerName) throws InterruptedException {
	
	Thread.sleep(5000);
	System.out.println("Actual Name : "+lightiningAppManagerPage.getDeveloperName());
	System.out.println("Expected Name :"+developerName);
	Assert.assertEquals(developerName,lightiningAppManagerPage.getDeveloperName());

	
	}
	
	@Then("Verify delete MobileApp Pop-up window")
	public void verify_delete_MobileApp_Pop_up_window() throws InterruptedException {
		
	
	String expected = "Delete MobileApp";

	switchToNewWindow(2);
	String actualText =	lightiningAppManagerPage.getDeleteText();		
	Assert.assertEquals(expected , actualText);
		
	
	}

}
