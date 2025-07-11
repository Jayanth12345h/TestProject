package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends BasePage{
	public RegistrationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//input[@name='firstName']")
	WebElement txtfirstname;

	@FindBy(xpath="//input[@name='lastName']")
	WebElement txtlastname;

	@FindBy(xpath="//input[@name='phone']")
	WebElement txtphone;

	@FindBy(id="userName")
	WebElement txtemail;

    @FindBy(xpath="//input[@name='address1']")
    WebElement txtaddress;
    
    @FindBy(xpath="//input[@name='city']")
    WebElement txtcity;
    
    @FindBy(xpath="//input[@name='state']")
    WebElement txtstate;
    
    @FindBy(xpath="//input[@name='postalCode']")
    WebElement txtpostalcode;
    
    @FindBy(xpath="//select[@name='country']")
    WebElement selectcountry;
    
    @FindBy(id="email")
    WebElement txtusername;
    
    @FindBy(xpath="//input[@name='password']")
    WebElement txtpassword;
    
    @FindBy(xpath="//input[@name='confirmPassword']")
    WebElement confirmpassword;
    
    @FindBy(xpath="//input[@name='submit']")
    WebElement submitbutton;
    
    public void enterfirstname(String fname) {
    	txtfirstname.sendKeys(fname);
    }
    
    public void enterlastname(String lname) {
    	txtlastname.sendKeys(lname);
    }
    
    public void enterphone(String phone) {
    	txtphone.sendKeys(phone);
    }
    
    public void enteremail(String email) {
    	txtemail.sendKeys(email);
    }
    
    public void enteraddress(String address) {
    	txtaddress.sendKeys(address);
    }
    
    public void entercity(String city) {
    	txtcity.sendKeys(city);
    }
    
    public void enterstate(String state) {
    	txtstate.sendKeys(state);
    }
    
    public void enterpostalcode(String postalcode) {
    	txtpostalcode.sendKeys(postalcode);
    }
    
    public Select getdropdown() {
    	return new
        Select(selectcountry);
    	
    }
    public void selectcountry(String countryname) {
    	Select countrydropdown = getdropdown();
    	countrydropdown.selectByVisibleText(countryname);
    }
    
    public void enterusername(String username) {
    	txtusername.sendKeys(username);
    }
    
    public void enterpassword(String pass) {
    	txtpassword.sendKeys(pass);
    }
    
    public void enterconfirmpassword(String confirmpass) {
    	confirmpassword.sendKeys(confirmpass);
    }
    
    public void clickonsubmit() {
    	submitbutton.click();
    }
    
    
    
    
    
    

}
