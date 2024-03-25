package PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class PlansPage  extends BasePage{

	public WebDriver driver;
	
	public PlansPage(WebDriver driver) {
		super(driver);
		
	}
	//WebDriverWait myWait = new WebDriverWait(driver,Duration.ofSeconds(15));
	
	//locators 
	
	@FindBy(xpath="//input[@id='studentTrip']") WebElement studentRadio;
//	@FindBy(xpath="/html/body/section[1]/div/div[3]/div/div[2]/div/div/div[1]/label") WebElement trvl1ChkBox;
	@FindBy(xpath="//input[@id='Traveller_1']") WebElement trvl1ChkBox;
	@FindBy(xpath="//input[@id='Traveller_2']") WebElement trvl2ChkBox;
//	@FindBy(xpath="/html/body/section[1]/div/div[3]/div/div[2]/div/div/div[2]/label") WebElement trvl2ChkBox;
	@FindBy(xpath="//select[@id='feet']") WebElement durationSelect;
	@FindBy(xpath="//div[@class='pqCtaWrapper']/button") WebElement btnViewPlan;
	@FindBy(css="section[class='newFilterSection sort'] details summary") WebElement btnSort;
	@FindBy(xpath="//input[@id='17_sort']") WebElement lowToHigh;
	@FindBy(xpath="//section/article/div/div/div/div/div/p[1]") List<WebElement> insuranceProvider;
	@FindBy(xpath="//section/article/div/div/div/div/div/p[2]") List<WebElement> insurancePlan;
	@FindBy(xpath="//section/article/div/div/div/div[2]/p[1]") List<WebElement> insuranceAmount;
	@FindBy(xpath="//section/article/div/div/div/div[3]/p/span") List<WebElement> insurancePremium;
	

	
	//Actions
	//filtering the data according to student plan
	public void filterData()
	{
		try {
		Thread.sleep(20000);
		studentRadio.click();
		trvl1_ChkBox();
		trvl2_ChkBox();
		Select select=new Select(durationSelect);
		select.selectByValue("1");
		btnViewPlan.click();
		Thread.sleep(20000);
		
		//sorting the insurance plan from low to high
		btnSort.click();
		lowToHigh.click();
		System.out.println("Filter Passed");
		}
		catch(Exception e) {
			System.out.println("Filter fail");
		}
	}
	
	//printing the first 3 lowest insurance plan
	public void printData() throws InterruptedException{
			for(int i=0;i<3;i++) {
				System.out.println("*****INSURANCE PLAN "+(i+1)+" *****");
				System.out.println("Plan: "+insurancePlan.get(i).getText());
				Thread.sleep(1000);
				System.out.println("Amount: "+insurancePremium.get(i).getText());
				Thread.sleep(1000);
				System.out.println("Company: "+insuranceProvider.get(i).getText());
				}
	}
	
	public void trvl1_ChkBox() throws InterruptedException
	{
		if(!trvl1ChkBox.isSelected())
		{
			trvl1ChkBox.click();
		}
	}
	
	public void trvl2_ChkBox() throws InterruptedException
	{
		if(!trvl2ChkBox.isSelected())
		{
			trvl2ChkBox.click();
		}
	}
	
}