package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MobileNumberPage extends BasePage {
	
	public WebDriver driver;
	
	public MobileNumberPage(WebDriver driver) {
		super(driver);
		
	}
	
	//Locators 
	
	@FindBy(css="#mobileNumber") WebElement mobileNo ;
	
	@FindBy(css=".travel_main_cta") WebElement viewPlans;
	
	//Actions 
	//for mobile number - Travel insurance
	public void mobileNumber(String num) {
		mobileNo.sendKeys(num);
	}
	
	//for next - view plan 
	public void viewplans() {
		viewPlans.click();
	}

}
