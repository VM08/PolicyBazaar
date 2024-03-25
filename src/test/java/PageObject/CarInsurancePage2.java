package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarInsurancePage2 extends BasePage {

	public WebDriver driver;

	public CarInsurancePage2(WebDriver driver) {
		super(driver);

	}

	// locators
	

	@FindBy(css = ".CarRegDetails_blueTextButton__P1blP.blueTextButton.fontMedium")
	WebElement buyingANewCar;

//	@FindBy(css = "body > section:nth-child(15) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(2) > li:nth-child(9) > span:nth-child(1)")
//	WebElement chennai;
	
	@FindBy(xpath="//span[contains(text(),\"Chennai\")]")
	WebElement chennai;

	@FindBy(css = "li[class='CityRTO_rtoDropdown__aLMCw'] li:nth-child(1)")
	WebElement rto;

	@FindBy(css = "li[class='renault '] span[class='brandName']")
	WebElement renault;

//	@FindBy(css = "body > section:nth-child(15) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(3) > ul:nth-child(1) > li:nth-child(5)")
//	WebElement kwid;
	
	@FindBy(xpath="//ul[@class=\"gridList    slideToLeft mb-16\"]/li[5]")
	WebElement kwid;
	
	@FindBy(xpath="//li[normalize-space()='Petrol']")
	WebElement petrol;
	
//	@FindBy(css = "body > section:nth-child(15) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(4) > ul:nth-child(1) > li:nth-child(2)")
//	WebElement variant;
	
	@FindBy(xpath="//ul[@class=\"gridList slideToLeft mb-24\"]/li[10]")
	WebElement variant;

	@FindBy(css = "input[placeholder='Full name']")
	WebElement fullName;

	@FindBy(css = "input[placeholder='Your email']")
	WebElement yourEmail;

	@FindBy(css = "input[placeholder='Mobile number']")
	WebElement mobileNumber;

	@FindBy(css = "button[type='button']")
	WebElement viewPrices;

	@FindBy(css = ".errorMsg")
	WebElement errorMessage;
	
	// Actions
	//buying a new car -click here
	public void carNumber() {
		buyingANewCar.click();
	}
	
	//city and rto
	public void rtoNumber() {
		chennai.click();
		rto.click();
	}
	
	//car Brand
	public void carBrand() {
		renault.click();
	}
	
	//car Model
	public void carName() {
		kwid.click();
	}
	
	//fuel type
	public void fuel()
	{
		petrol.click();
	}
	
	//variant
	public void carVariant() {
		variant.click();
	}
	
	//name for car Insurance
	public void custName(String name) {
		fullName.sendKeys(name);
	}
	
	//email fro car Insurance
	public void emailId(String id) {
		yourEmail.sendKeys(id);
	}
	
	//mobile no. for car Insurance
	public void mobileNumber(String num) {
		mobileNumber.sendKeys(num);
	}

	//viewprice for car Insurance
	public void clickViewprice(){
		viewPrices.click();
	}

	//error message for invalid input in car insurane
	public void errorMsg() {
		System.out.println(errorMessage.getText());
	}

}
