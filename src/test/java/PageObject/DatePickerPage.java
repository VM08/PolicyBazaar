package PageObject;

import java.time.LocalDate;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BaseClass;

public class DatePickerPage extends BasePage{
	
	public WebDriver driver;
	public DatePickerPage(WebDriver driver) {
		super(driver);
		
	}

	//locators
	@FindBy(xpath="//div[@class='MuiPickersDateRangePickerInput-root']//div[1]//div[1]//div[1]//input[1]") WebElement  clickDatePicker;
	@FindBy(xpath="//*[@id=\"prequote-wrapper\"]/div[2]/div/div[1]/div/div[1]/div/div/input") WebElement startDate;
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiIconButton-root MuiPickersArrowSwitcher-iconButton MuiIconButton-sizeSmall']//span[@class='MuiIconButton-label']//*[name()='svg']")WebElement nextSlide;
	@FindBy(xpath="//*[@id=\"prequote-wrapper\"]/div[2]/div/div[1]/div/div[2]/div/div/input") WebElement endDate;
	@FindBy(css=".travel_main_cta") WebElement nextButton;


	//Actions
	//selecting date randomly 
	public void setDate() throws InterruptedException {
		Thread.sleep(10000);
		clickDatePicker.click(); // clicking start date check box
		LocalDate stdate=start_date();
		nextSlide.click();  // clicking end date check box
		end_date(stdate);
	}
	
	//next button for date
	public void clickNext() {
		nextButton.click();
	}
	
	//selecting the start date
	public LocalDate start_date()
	{
		LocalDate currentDate=LocalDate.now();
		LocalDate currentDate_Start =BaseClass.Start_date_modified(currentDate);  //selecting the start date in the form of LocalDate
		String senddate=BaseClass.Dates(currentDate_Start);   //changing the datatype to string
		startDate.sendKeys(senddate);
		return currentDate_Start;
	}
	
	//selecting the end date
	public void end_date(LocalDate stdate)
	{
		LocalDate currentDate_End =BaseClass.Start_date_modified(stdate);  //selecting the end date in the form of LocalDate
		String senddate_End=BaseClass.Dates(currentDate_End);  //changing the datatype to string
		endDate.sendKeys(senddate_End);
	}
	

	
}
