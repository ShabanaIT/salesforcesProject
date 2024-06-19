package pages;

import org.openqa.selenium.By;

import base.Base;
import step_definitions.Hooks;

public class LogInPage extends Base{
   By username=By.id("username");
   By password=By.id("password");
   By login=By.id("Login");
   
   public void enterUsername(String UserName) {
	   sendkeys(username,UserName);
   }
   public void enterPassword(String Pass) {
	   sendkeys(password,Pass);
   }
   public void clickLogIn() {
	   click(login);
   }
   
   
}
