package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import base.Base;

public class PopUpWindow_AppDetailsAndBrandingPage extends Base {
	
	 By appName = By.xpath("//label[text()='App Name']/parent::div/div/input");
	 By developer_Name = By.xpath("//label[text()='Developer Name']/parent::div/div/input");
	 By description = By.xpath("//label[text()='Description']/parent::lightning-textarea/div/textarea");	
	 By uploadImage = By.xpath("//span[text()='Upload']");
	 By nextButton = By.cssSelector("button.slds-button.slds-button_brand.nextButton");
     By saveAndfinishButton = By.xpath("//button[text()='Save & Finish']");
	 By seveButton = By.xpath("//button[text()='Save']");
	
	
	public void enterAppName(String AppName) {
		sendkeys(appName, AppName);
	}

	public void enterDeveloperName(String DevoloperName) {
		sendkeys(developer_Name, DevoloperName);
	}

	public void enterDescription(String descriptionName) {
		sendkeys(description, descriptionName);
	}

	public void clickOnUploadImage() {
		click(uploadImage);
		
//		String filePath = "C:\\Users\\Microtecj NA\\Pictures\\tree-736885__480.jpg";
//		StringSelection stringSelection = new StringSelection(filePath);
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents( null,stringSelection);

		StringSelection stringSelection = new StringSelection("C:\\Users\\Microtecj NA\\Pictures\\tree-736885__480.jpg");
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        robot.delay(250);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(150);
        robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

	public void clickOnNext() {
		click(nextButton);
	}
	
	public void clickSaveAndFinishButton() {
		click(saveAndfinishButton);
	}
	public void clickSaveButton() {
		click(seveButton);
	}
    public void clearDeveloperName() {
    	clear(developer_Name);
    }
    
    public void clickDeveloperName() {
    	click(developer_Name);
    }
    
    public void clearDescription() {
    	clear(description);
    }
    
    
    
    
    
    
}