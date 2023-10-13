package Utilitis;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSetup {
	public static WebDriver driver;
	public static Properties prop;
	
	static {
		try {
			
			File f = new File("C:\\Users\\vigne\\eclipse-workspace\\POM\\Input.properties");
			FileInputStream obj = new FileInputStream(f);
			
			prop = new Properties();
			prop.load(obj);
			
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			options.addArguments("start-maximized");
			driver = new ChromeDriver(options);
			
		}catch(Exception e ){
			
		}
	}
}
