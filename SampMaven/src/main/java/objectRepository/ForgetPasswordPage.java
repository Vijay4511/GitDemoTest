package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgetPasswordPage {

	
	WebDriver driver;

	By email = By.id("userName");
	
	By forgetLogin = By.id("submitBtn");
	
	By errormsg = By.id("errorMsg");
	
	public ForgetPasswordPage(WebDriver driver) {
		this.driver =driver;
	}
	
	public WebElement Emailid()
	{
		return driver.findElement(email);
	}
	

	public WebElement ForgetLogin()
	{
		return driver.findElement(forgetLogin);
	}
	

	public WebElement Errormsg()
	{
		return driver.findElement(errormsg);
	}
}

