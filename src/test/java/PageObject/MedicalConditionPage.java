package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MedicalConditionPage extends BasePage {
	
	public WebDriver driver;
	
	public MedicalConditionPage(WebDriver driver) {
		super(driver);
		
	}
	
	//locators 
	
	@FindBy(xpath="//input[@value='no']/following::label")
	WebElement medical;
	
	@FindBy(css=".travel_main_cta") WebElement nextbtn;
	
	//Actions 
	
	public void medi() throws InterruptedException
	{
		if(!medical.isSelected())
		{
			medical.click();
		}
		
		Thread.sleep(3000);
	}
	
	public void clickNext() {
		nextbtn.click();
	}
	

}
