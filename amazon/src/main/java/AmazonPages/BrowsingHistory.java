package AmazonPages;

import java.util.Hashtable;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CommonBase.AppDriver;

public class BrowsingHistory extends AppDriver{

	public BrowsingHistory() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}

	@FindBy (xpath="//a[text()='Amazon Pay']")public WebElement Amazon_Pay;
	
	public static WebElement ele;
	
	public void listOfElements (){
		try{
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		//	Amazon_Pay.sendKeys("xxx");
			
			List<WebElement> eleLists = driver.findElements(By.xpath("//div[@class='a-column a-span2 dashboard-nav-6-col']"));
			for (WebElement we : eleLists){
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", we);
				//js.executeScript("document.getElementById('nav-xshop-container');");
			}
			
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public static WebElement getIDCick(String label){
		try{
			ele = driver.findElement(By.xpath("//*[text()='" + label + "']"));
			return ele;
		}catch (Exception e){
			e.printStackTrace();
			return ele;
		}
		
	}
	
	public Hashtable<String, String> Login() throws Throwable{
	Hashtable<String, String> data = new Hashtable<String, String>();
	
	return data;
	}
	
	
	
	
	
	
	
	
	
}
