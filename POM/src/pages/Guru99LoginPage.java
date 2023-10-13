package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99LoginPage {
	public static WebDriver driver;
	
	@FindBy(xpath = "//input[@name='userName']")
	public WebElement UserName;
	
	@FindBy(xpath = "//input[@name='password']")
	public WebElement  PassWord;
	
	@FindBy(xpath = "//input[@name='submit']")
	public WebElement Submit;
	
	public Guru99LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

}