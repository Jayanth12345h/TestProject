package testCases;



import java.time.Duration;

import org.apache.logging.log4j.LogManager; //log4j
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public WebDriver driver;
	public Logger logger;

	@BeforeClass
	public void setup() {

		logger = LogManager.getLogger(this.getClass());



		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/newtours/");

	}

	@AfterClass
	public void teardown() {
		if (driver != null)
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		driver.quit();

	}
}
