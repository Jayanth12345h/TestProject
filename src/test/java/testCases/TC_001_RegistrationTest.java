package testCases;

import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.RegistrationPage;

public class TC_001_RegistrationTest extends BaseClass {


	@Test
	public void test_001() {
		
		logger.info("*** TC_001_RegistrationTest ***");
		
		HomePage hp = new HomePage(driver);
		hp.clickRegister();
		logger.info("Clicked on registartion");
		
		
		RegistrationPage RP = new RegistrationPage(driver);
		logger.info("Enetering the user details");
		
		
		RP.enterfirstname("jay");
		RP.enterlastname("ram");
		RP.enterphone("9876543210");
		RP.enterusername("jay123@gmail.com");
		RP.enteraddress("5-165/1, Dandepally");
		RP.entercity("Hanumakonda");
		RP.enterstate("Telangana");
		RP.enterpostalcode("505101");
		RP.selectcountry("INDIA");
		RP.enterpassword("jay@12345");
		RP.enterconfirmpassword("jay@12345");
		RP.clickonsubmit();
		logger.debug("debug logs..");
	}
	 
	
	


}
