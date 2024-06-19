package base;


import java.io.FileInputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import utils.ExcelReader;



public class Base {
	public static WebDriver driver; //default
	public static FileInputStream fis;
	public static Properties config;
	public static String host;
	public static ExcelReader excelReader;
	public static List<Map<String,String>> testData;
    public  JavascriptExecutor js = (JavascriptExecutor) driver;   
	
		
	//public static WebDriver firefoxDriver; //default
	
	
	public static void navigateURL(String url) {
		driver.get(url);
	}
	
	public static void click(By locator) {
		driver.findElement( locator ).click();
	}
	public static void click(WebElement webElement) {
		WebElement element = webElement;
		element.click();
	}
	
	public static void clear(By locator) {
		driver.findElement( locator ).clear();
	}
	
	
	public static void sendkeys(By locator, String value) {
		driver.findElement( locator ).sendKeys( value  );
	}
	
	public static String getElementText(By locator) {
		//Get the Text of that Element (H3) Online Access
		WebElement element =  driver.findElement( locator );
		//get the text of that element
		String s = element.getText();	
		return s;
	}
	
	public static int getTotalElementsCount(By locator) {
	    List<WebElement> webElements = driver.findElements( locator );
	    int totalCount = webElements.size();		
		return totalCount;
	}
	
	public static void selectDropDownMenu(By locator, String textToSelect) {
		Select dropDownWebElement;
		dropDownWebElement = new Select( driver.findElement( locator ) );
		dropDownWebElement.selectByVisibleText(textToSelect);
	}
	public static void mousehover(WebElement webElement) {
		WebElement element = webElement;
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
	}
	public static void mousehover(By locator) {
		WebElement element = driver.findElement(locator);
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
	}
	public void switchToNewWindow(int windowNumber) {
		try {
			Set<String> s = driver.getWindowHandles();
			Iterator<String> iterator = s.iterator();
			int i = 1;
			while (iterator.hasNext() && i < 10) {
				String popupHandle = iterator.next().toString();
				driver.switchTo().window(popupHandle);
				if (i == windowNumber)
					i++;
			}
		}

		catch(Exception e) {
			e.getLocalizedMessage();
	
	}
	}
      public String generateRendomValue(int n) {
		Random rand = new Random();
	    String c = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    StringBuilder string = new StringBuilder();
	    for (int i = 0; i < n; i++) {
	        int index = rand.nextInt(c.length());
	        string.append(c.charAt(index));
	    }
	    return string.toString();
	}
      public int generateRandomNumber(int n) {
  		Random rand = new Random();
  		return rand.nextInt(n);
  	}
		
}