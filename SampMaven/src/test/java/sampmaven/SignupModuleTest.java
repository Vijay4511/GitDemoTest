package sampmaven;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.init;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SignupModuleTest extends init{
	
	
	public WebDriver driver;
	CommonMethods cm = new CommonMethods();
	
	
	@Test
	public void WebLogin() throws IOException
	{
		System.out.println("WebLogin");
		driver = BrowserInitialization();
		driver.get("https://www.apsrtconline.in/oprs-web/login/show.do");
		driver.findElement(By.id("userName")).sendKeys("Username");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.id("submitBtn")).click();
		

	}
	
	
	@Test(groups= {"smoke"})//smoke
	public void Forgetpassword()
	{
		System.out.println("ForgetpasswordTC");
	
	}
	
	@Test
	public void LoginNameValidation() throws IOException
	{
		ArrayList<String> TcData =cm.getdatafrmExcel("FieldValidation");
		driver = BrowserInitialization();

		driver.get("https://www.apsrtconline.in/oprs-web/user/add.do");
		
		driver.findElement(By.cssSelector("input#loginName")).sendKeys(TcData.get(1));
		driver.findElement(By.cssSelector("input[name='fullName']")).sendKeys(TcData.get(2));
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(TcData.get(4));
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys(TcData.get(3));
		
		driver.findElement(By.xpath("//input[@type='button']")).click();
		
	}

}
