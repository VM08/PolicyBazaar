package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TravelInsurancepage extends BasePage {
	

	public WebDriver driver;

	public TravelInsurancepage(WebDriver driver) {
		super(driver);
	
	}
	
	//Locators 
	
	@FindBy(css="img[src='https://static.pbcdn.in/travel-cdn/images/country/Germany.jpg']") WebElement germany;
	
	@FindBy(css="img[src='https://static.pbcdn.in/travel-cdn/images/country/USA.jpg']") WebElement uSA;
	
	@FindBy(css=".travel_main_cta") WebElement nextBtn;
	
	//actions 
	
	//selecting germany for travel insurance - method called
	public void setGermany() {
		germany.click();
	}
	
	//selecting USA for travel insurance - method called
	public void setUSA() {
		uSA.click();
	}
	
	//next button
	public void clickNext() {
		nextBtn.click();
	}
}
