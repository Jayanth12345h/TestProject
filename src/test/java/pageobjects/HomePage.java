package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//a[normalize-space()='REGISTER']")
	WebElement Registerlnk;

	public void clickRegister() {
		Registerlnk.click();
	}

}
