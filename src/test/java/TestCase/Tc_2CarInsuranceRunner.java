//package TestCase;
//
//import org.testng.Assert;
//import org.testng.annotations.Listeners;
//import org.testng.annotations.Test;
//
//import PageObject.CarInsurancePage;
//import PageObject.HomePage;
//import testBase.BaseClass;
//
//@Listeners(utilities.ExtentReportManager.class)
//public class Tc_2CarInsuranceRunner extends BaseClass{
//	
//	
//	
//	@Test(priority=2)
//	public void carInsurance() {
//		
//		logger.info("******Starting Homepage*******");
//		try {
//		HomePage hp = new HomePage(driver);
//		hp.selectCarInsurance(); 
//		
//		logger.info("******Starting Car Insurance Page*******");
//		CarInsurancePage carIns = new CarInsurancePage(driver);
//		
//		carIns.carNumber();
//		carIns.rtoNumber();
//		carIns.carBrand();
//		carIns.carName();
//		carIns.carVariant();
//		carIns.custName(randomeString());
//		carIns.emailId(randomeString());
//		carIns.mobileNumber("98"+randomeNumber());
//		carIns.clickViewprice();
////		try {
////			BaseClass bc=new BaseClass();
////			bc.screenshot("Car_Insurance");
////			logger.info("              ");
////			logger.info("Screenshot Taken for Travel Insurance.......");
////		}
////		catch(Exception e)
////		{
////			logger.info("Screenshot not taken for Travel Insurance.......");
////		}
//		carIns.errorMessage();
//		
//		logger.info("****** Car Insurance validation Completed*******");
//		logger.info("         ===========================             ");
//		logger.info("                                 ");
//		}catch(Exception e) {
//			logger.info("****** Car Insurance validation failed*******");
//			logger.info("         ===========================             ");
//			logger.info("                                 ");
//			Assert.fail();
//		}
//	}
//
//}

package TestCase;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import PageObject.CarInsurancePage;
import PageObject.CarInsurancePage2;
import PageObject.HomePage;
import testBase.BaseClass;


public class Tc_2CarInsuranceRunner extends BaseClass {

	public static String path;

	@Test(priority = 2, groups = { "regression", "master" })
	public void carInsurance() throws  InterruptedException, IOException {

		logger.info("******Starting Homepage*******");
		//try {

			HomePage hp = new HomePage(driver);
			hp.selectCarInsurance();
			Thread.sleep(5000);

			logger.info("******Starting Car Insurance Page*******");
			try {
				if (driver.findElement(By.xpath("//span[normalize-space()='or']")).isDisplayed()) {
					logger.info("******method 1*******");

					CarInsurancePage carIns = new CarInsurancePage(driver);

					carIns.carNumber();
					carIns.rtoNumber();
					carIns.carBrand();
					carIns.carName();
					carIns.carVariant();
					carIns.custName(randomeString());
					carIns.emailId(randomeString());
					carIns.mobileNumber("9" + randomeNumber());
					carIns.clickViewprice();
					carIns.errorMessage();
					System.out.println();
					System.out.println("               =================                ");
					System.out.println();
					logger.info("****** Car Insurance validation Completed*******");
					logger.info("         ===========================             ");
					logger.info("                                 ");
				}
			} catch (Exception e) {

				logger.info("******method  2*******");

				CarInsurancePage2 carIns = new CarInsurancePage2(driver);
				
				carIns.carNumber();
				carIns.rtoNumber();
				carIns.carBrand();
				carIns.carName();
				carIns.fuel();
				carIns.carVariant();
				carIns.custName(randomeString());
				carIns.emailId(randomeString());
				carIns.mobileNumber("9" + randomeNumber());
//				carIns.clickViewprice();
				carIns.errorMsg();
				System.out.println();
				System.out.println("               =================                ");
				System.out.println();
				logger.info("****** Car Insurance validation Completed*******");
				logger.info("         ===========================             ");
				logger.info("                                 ");
			}
	}

}

