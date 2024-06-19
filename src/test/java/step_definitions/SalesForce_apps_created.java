package step_definitions;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.LandingPage;
import pages.LogInPage;
import pages.PopUpWindow_AppDetailsAndBrandingPage;

import pages.LightiningAppManagerPage;


public class SalesForce_apps_created extends Base {

	
	LandingPage landingPage = new LandingPage();
	LogInPage logInPage = new LogInPage();
	LightiningAppManagerPage lightiningAppManagerPage = new LightiningAppManagerPage();
	PopUpWindow_AppDetailsAndBrandingPage popUpWindow_AppDetailsAndBrandingPage = new PopUpWindow_AppDetailsAndBrandingPage();
			
	String userName;
	String password;
	String appName;
	String devolopername;
	String description;
	String updateDescriptionpName;	
	String sheetName;
	int rowNumber;
	public String devoloperName;
	
	@Given("I am in salesforce Landing page")
	public void i_am_in_salesforce_Landing_page() {
		landingPage.navigateurl();
	
	}

	@When("I hover on login menu")
	public void i_hover_on_login_menu() {
		landingPage.hoverOnLogin();
	}

	@Then("I click on salesforce")
	public void i_click_on_salesforce() {
		
		landingPage.clickOnSalesforce();
	}
	@Then("I am taking data from Excel {int}")
	public void i_am_taking_data_from_Excel(int rowNumber) throws InterruptedException {
	
	     userName = testData.get(rowNumber).get("username"); 
	     password = testData.get(rowNumber).get("password"); 
	     appName = testData.get(rowNumber).get("appname"); 	
	     devoloperName = testData.get(rowNumber).get("devolopername");
	     description = testData.get(rowNumber).get("description");		
		 updateDescriptionpName = testData.get(rowNumber).get("updatedescriptionpdame");
	
	  
		  System.out.println(rowNumber);
		  System.out.println(userName);
		  System.out.println(password);
		  System.out.println(appName);
		  System.out.println(devoloperName);
		  System.out.println(description);
		  System.out.println(updateDescriptionpName);
		 

	}

	@Then("Enter User Id as")
	public void enter_User_Id_as() {
	 
		 
		  logInPage.enterUsername(userName);

	}

	@Then("I Enter Password as")
	public void i_Enter_Password_as() {
		
			
		logInPage.enterPassword(password);
	
	}

	@Then("I click on login button")
	public void i_click_on_login_button() {
		logInPage.clickLogIn();
	}

	@Then("I click on Apps")
	public void i_click_on_Apps() throws InterruptedException {
		Thread.sleep(3000);
		lightiningAppManagerPage.clickOnApp();
		
	}

	@Then("I click on AppManager")
	public void i_click_on_AppManager() {
		lightiningAppManagerPage.clickOnAppManager();
	}

	@Then("I click on New Lightening App")
	public void i_click_on_New_Lightening_App() throws InterruptedException {
		Thread.sleep(5000);
		lightiningAppManagerPage.clickOnNewLightningApp();
		
	}

	@Then("I enter AppName")
	public void i_enter_AppName() throws InterruptedException {
		
		
		Thread.sleep(2000);
		
		appName = (appName + generateRandomNumber(10000));
		Thread.sleep(2000);
		
		
		Thread.sleep(2000);
		switchToNewWindow(2);
		Thread.sleep(2000);
		popUpWindow_AppDetailsAndBrandingPage.enterAppName(appName);
		
	}

	@Then("I enter DevoloperName")
	public void i_enter_DevoloperName() throws InterruptedException {
		
		
		devoloperName = (devoloperName+generateRendomValue(4));
		
		lightiningAppManagerPage.xpathText(devoloperName);
		Thread.sleep(3000);
		System.out.println(devoloperName);
		
		//click(popUpWindow_AppDetailsAndBrandingPage.developer_Name);
		popUpWindow_AppDetailsAndBrandingPage.clickDeveloperName();
		
		//clear(popUpWindow_AppDetailsAndBrandingPage.developer_Name);
		popUpWindow_AppDetailsAndBrandingPage.clearDeveloperName();
		
		Thread.sleep(5000);
		popUpWindow_AppDetailsAndBrandingPage.enterDeveloperName(devoloperName);
	
		
	}

	@Then("I enter Description")
	public void i_enter_Description() {
		
		
		description =	(description + generateRandomNumber(10000));
			
		popUpWindow_AppDetailsAndBrandingPage.enterDescription(description);
	}


	@Then("I upload image")
	public void i_upload_image() throws InterruptedException {
		
		popUpWindow_AppDetailsAndBrandingPage.clickOnUploadImage();		
		Thread.sleep(5000);
	}

	@Then("I click next")
	public void i_click_next() {
		popUpWindow_AppDetailsAndBrandingPage.clickOnNext();
	}

	@Then("I click on save&finish")
	public void i_click_on_save_finish() {
		popUpWindow_AppDetailsAndBrandingPage.clickSaveAndFinishButton();
		
	}

	@Then("I click on AppName nursery world dropdown")
	public void i_click_on_AppName_nursery_world_dropdown() throws InterruptedException {
	Thread.sleep(3000);
		lightiningAppManagerPage.clickOnnursery();
		
	}

	@Then("I click on edit")
	public void i_click_on_edit() {
		lightiningAppManagerPage.clickEditButton();
	}

	@Then("I updated description")
	public void i_updated_description() throws InterruptedException {
	   
		
		
		//click(popUpWindow_AppDetailsAndBrandingPage.description);
		//Thread.sleep(3000);
		popUpWindow_AppDetailsAndBrandingPage.clearDescription();
		
		Thread.sleep(3000);
		popUpWindow_AppDetailsAndBrandingPage.enterDescription(updateDescriptionpName);
		

	}

	@Then("I click on save button")
	public void i_click_on_save_button() {		
		popUpWindow_AppDetailsAndBrandingPage.clickSaveButton();;
	    
	}

	@Then("I click to go back")
	public void i_click_to_go_back() throws InterruptedException {
	    Thread.sleep(3000);
		driver.navigate().back();
	}
	
	@Then("I click on delete button")
	public void i_click_on_delete_button() {
		lightiningAppManagerPage.clickDeleteButton();
		
		
	}
	
	@Then("I click on delete")
	public void i_click_on_delete() {
		
		lightiningAppManagerPage.clickDelete();
	}


	@Then("I click on view profile")
	public void i_click_on_view_profile() {
	   lightiningAppManagerPage.clickViewProfile();
		
	}

	@Then("I click on log out button")
	public void i_click_on_log_out_button() {
	   
		lightiningAppManagerPage.clickLogOutButton();
		
	}

	

}
