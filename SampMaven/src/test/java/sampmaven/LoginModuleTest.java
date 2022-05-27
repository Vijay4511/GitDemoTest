package sampmaven;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.init;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.ForgetPasswordPage;
import objectRepository.HomePage;
import objectRepository.LoginPage;

public class LoginModuleTest extends init{
	
	public WebDriver driver;
	
	public String str;
	
	public static Logger log = LogManager.getLogger(init.class.getName());
	
	
	@BeforeTest
	public void Initialization() throws IOException
	{
		driver = BrowserInitialization();
		String url =  prop.getProperty("url");
		
		driver.get(url);
		log.info("Navigated to Apsrtc page successfully");
	
		
	}
	
	@Test
	public void SuccessfullLogin() throws IOException 
	{
		
		
		HomePage hp = new HomePage(driver);
		hp.EticketLogin().click();
		log.debug("Clicked on eticketlogin button");
		LoginPage lp = new LoginPage(driver);
		lp.Username().sendKeys("vijay");
		log.debug("Entered username");
		lp.Password().sendKeys("password");
		log.debug("Entered password");
		lp.Login().click();
		log.debug("Clicked on login button");
		String experrormsg = "Login incorrect. Please try ";
				
		Assert.assertEquals(lp.ErrorMessage().getText(), experrormsg);
		log.info("Validation was successfull");
		
	}
	
	@Test
	public void ForgetPassword() throws IOException
	{
		
		HomePage hp = new HomePage(driver);
		hp.EticketLogin().click();
		log.info("Successfully navigated to login page");
		LoginPage lp = new LoginPage(driver);
		lp.ForgetPassword().click();
		log.debug("Clicked on forgetpassword link");
		ForgetPasswordPage fp = new ForgetPasswordPage(driver);
		fp.Emailid().sendKeys("skdfjh@gmail.com");
		fp.ForgetLogin().click();
		log.debug("Clicked on forgetpassword button");
		String experrormsg = "Login Name not found in the .";
		
		Assert.assertEquals(fp.Errormsg().getText(), experrormsg);
		
	}
	
	@AfterTest
	public void InstanceKill()
	{
		driver.close();
		
	}

}
