package StepDefinition;

import org.openqa.selenium.support.PageFactory;

import AmazonPages.BrowsingHistory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BrowsingHistorySteps extends BrowsingHistory{

	public BrowsingHistorySteps() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}

	@Given ("^I want to open a \"(.*)\" browser$")
	public void want_to_open_browser(String browser) throws Throwable{
		openBrowser(browser);
	}
	
	@And ("^I want to launch the application$")
	public void want_to_launch () throws Throwable{
		navigateURL(ObjectXpath.getProperty("URL"));
	}
	
	@And ("^I want to enter a value to \"(.*)\" as \"(.*)\"$")
	public void want_enter_textvalue (String xpath, String textValue) throws Throwable{
		enterText(xpath, textValue);
	}
	
	@And ("^I want to click \"(.*)\"$")
	public void want_click (String label) throws Throwable{
		//getIDCick(label);
		//clickButton(label);
		BrowsingHistory bH = PageFactory.initElements(driver, BrowsingHistory.class);
		bH.Amazon_Pay.click();
		
	}
	
	@Then ("^I want to highlight elements$")
	public void want_highlight_element () throws Throwable{
		listOfElements();
	}
}
