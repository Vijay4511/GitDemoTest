package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	WebDriver driver;
	
	@FindBy(id="userName")
	WebElement usrname;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(name="submitBtn")
	WebElement login;
	
	@FindBy(linkText="Forgot Password")
	WebElement forgetpasword;
	
	@FindBy(id="errorMsg")
	WebElement errorMessage;
	
	
	public LoginPage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement Username()
	{
		return usrname;
	}
	
	public WebElement Password()
	{
		return password;
	}
	
	public WebElement Login()
	{
		return login;
	}
	public WebElement ForgetPassword()
	{
		return forgetpasword;
	}
	
	
	public WebElement ErrorMessage()
	{
		return errorMessage;
	}
	

	

}
