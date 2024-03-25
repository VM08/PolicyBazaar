package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	public WebDriver driver ;
	
	//constructor
	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	
	//locator
	
	@FindBy(xpath="//div[7]//a[1]//div[1]//div[1]") WebElement travelInsurance;
	@FindBy(xpath="/html/body/main/div[2]/section/div[4]/a/div[1]/div/i") WebElement carInsurance;
	//@FindBy(xpath="/html/body/main/div[2]/section/div[2]/a/div[1]/div") WebElement healthInsurance;
	@FindBy(xpath="/html/body/div[5]/div[2]/div/ul/li[2]/a") WebElement insuranceProd ;
	
	//actions
	//Travel insurance icon 
	public void selectTravelInsurance() {
		travelInsurance.click();
	}
	
	//Car Insuracne icon
	public void selectCarInsurance() {
		carInsurance.click();
	}
	
	//Health Insurance 
	public void insuranceprod() {
		insuranceProd.click();
	}
}