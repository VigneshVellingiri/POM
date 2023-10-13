package Test;

import org.testng.annotations.Test;

import Utilitis.TestSetup;
import pages.Guru99LoginPage;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class Guru99Login {
	
	public static WebDriver driver;
	public static Properties prop;
	TestSetup obj = new TestSetup();
	
	
  @Test
  public void Login() {
	  Guru99LoginPage login = new Guru99LoginPage(driver);
	  
	  String GuruURL = prop.getProperty("URL");
	  String UserID = prop.getProperty("UserName");
	  String PassCode = prop.getProperty("Password");
	  
	 driver.get(GuruURL); 
	 login.UserName.sendKeys(UserID);
	 login.PassWord.sendKeys(PassCode);
	 login.Submit.submit();  
	  
  }
  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
	  
	  this.driver = obj.driver;
	  this.prop = obj.prop;
  }

}
