package TestCase;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObject.CountPage;
import PageObject.DatePickerPage;
import PageObject.HomePage;
import PageObject.MedicalConditionPage;
import PageObject.MobileNumberPage;
import PageObject.PlansPage;
import PageObject.TravelInsurancepage;
import testBase.BaseClass;

@Listeners(utilities.ExtentReportManager.class)
public class Tc_1TravelInsuranceRunner extends BaseClass{
	
	@Test(priority=1, groups = { "sanity", "master" })
	public void travelInsurance() {
		
		logger.info("******Starting Homepage*******");
		try {
		HomePage hp = new HomePage(driver);
		hp.selectTravelInsurance(); 
		
		logger.info("******Starting Travel Insurance Page*******");
		
		//Travel Insurance Country - method calling
		TravelInsurancepage  travelInsurance = new TravelInsurancepage(driver); 
		travelInsurance.setGermany();
		travelInsurance.setUSA(); 
		travelInsurance.clickNext();
		
		//Travel Insurance Date - method calling`
		DatePickerPage date = new DatePickerPage(driver); 
		date.setDate();
		date.clickNext();
		
		//Travel Insuracne member count - method calling
		CountPage count = new CountPage(driver); 
		count.setCount();// 
		count .selectAge(); 
		count.clickNext();
		
		//Travel Insurance medical - method calling
		MedicalConditionPage status = new MedicalConditionPage(driver) ;
		status.medi();
//		status.clickNext();
		
		//Travel Insurance mobile no. - method calling
		MobileNumberPage num = new MobileNumberPage(driver);
		num.mobileNumber("9"+randomeNumber());
		num.viewplans();
		
		//Filtering and printing the insurance plan according to student plan in ascending order - method calling
		PlansPage plan= new PlansPage(driver);
		plan.filterData(); 
//		try {
//			//BaseClass bc=new BaseClass();
//			screenshot("Travel_Insurance");
//			System.out.println("Screenshot taken.........");
//			logger.info("              ");
//			logger.info("Screenshot Taken for Travel Insurance.......");
//		}
//		catch(Exception e)
//		{
//			logger.info("Screenshot not taken for Travel Insurance.......");
//		}
		plan.printData();
		
		System.out.println();
		System.out.println("               =================                ");
		System.out.println();
		logger.info("****** Travel Insurance validation Completed*******");
		logger.info("         ===========================             ");
		logger.info("                                 ");
		}catch(Exception e) {
			logger.info("****** Travel Insurance validation failed*******");
			logger.info("         ===========================             ");
			logger.info("                                 ");
			System.out.println();
			System.out.println("               =================                ");
			System.out.println();
			Assert.fail();
		}
	}
}
