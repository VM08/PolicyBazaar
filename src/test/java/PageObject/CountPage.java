package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CountPage extends BasePage{

	public WebDriver driver;
	
	public CountPage(WebDriver driver) {
		super(driver);
		
	}

	
	// Locators 
	
	@FindBy(css="label[for='traveller_2']") WebElement count; 
	
	@FindBy(css="[id=\"0\"]") WebElement ageOfTraveller1;
	
	@FindBy(css="[id=\"1\"]") WebElement ageOfTraveller2;
	
	@FindBy(css="label[for='21 years_undefined']") WebElement age1;
	
	@FindBy(css="label[for='22 years_undefined']") WebElement age2;
	
	@FindBy(css=".travel_main_cta") WebElement nextbtn;
	
	//actions 
	
	//selecting the count. of person
	public void setCount() {
		count.click();
	}
	
	//selecting the age of the persons
	public void selectAge() {
		
		ageOfTraveller1.click();
		age1.click();
		
		ageOfTraveller2.click();
		age2.click();
		
	}
	
	//next btn
	public void clickNext() {
		nextbtn.click();
	}
	
	
}
