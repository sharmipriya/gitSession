package CommonBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppDriver {
	
	public static WebDriver driver;
	public static Properties ObjectXpath;
	
	public AppDriver() throws Throwable{
		ObjectXpath = new Properties ();
		//FileInputStream fs = new FileInputStream (new File ("C:\\Users\\Madhavi\\Documents\\workspace_RS2\\amazon\\src\\test\\java\\ConfigData\\ObjectRepo.properties"));
		
		FileInputStream fs = new FileInputStream (new File ("C:\\Users\\Madhavi\\Documents\\workspace_RS2\\amazon\\src\\test\\java\\ConfigData\\ObjectRepo.properties"));
		ObjectXpath.load(fs);
	}

	public static void openBrowser(String browser){
		try{
			if (browser.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.ie.driver", "C:\\Users\\Madhavi\\Documents\\workspace_RS2\\Automatio\\chromedriver.exe");
				driver = new ChromeDriver();			
			}
			else if (browser.equalsIgnoreCase("IE")){
				System.setProperty("webdriver.ie.driver", "C:\\Users\\Madhavi\\Documents\\workspace_RS2\\Automatio\\chromedriver.exe");
				driver = new ChromeDriver();				
			}
			else if (browser.equalsIgnoreCase("GeckoDriver")){
				System.setProperty("webdriver.ie.driver", "C:\\Users\\Madhavi\\Documents\\workspace_RS2\\Automatio\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			driver.manage().window().maximize();
			System.out.println("User is able to open " + browser + " browser");
		}catch (Exception e){
			e.printStackTrace();
			System.out.println("User is not able to open a browser");		
		}
	}

	public static void navigateURL(String URL){
		try{
			driver.get(URL);
			System.out.println("User is able to launch the appllcation");
		}catch (Exception e){
			e.printStackTrace();
			System.out.println("User is not able to launch the appllcation");
		}
	}

	public static void enterText(String xpath, String enterValue){
		try{
			driver.findElement(By.xpath(ObjectXpath.getProperty(xpath))).sendKeys(enterValue);
			System.out.println("User is able to send the values to the text box");
		}catch (Exception e){
			e.printStackTrace();
			System.out.println("User is not able to send the values to the text box");
		}
	}

	public static void clickButton (String xpath){
		try{
			driver.findElement(By.xpath(ObjectXpath.getProperty(xpath))).click();
			System.out.println("User is able to click the button");
		}catch (Exception e){
			e.printStackTrace();
			System.out.println("User is not able to click the button");
		}
	}
	
	
	
	
}
