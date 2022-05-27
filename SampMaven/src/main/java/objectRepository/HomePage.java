package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	
	WebDriver driver;

	By eticketLogin = By.linkText("eTicket Login");
	
	By atboprLogin = By.linkText("ATB/OPR Login");
	
	public HomePage(WebDriver driver) {
		this.driver =driver;
	}

	public WebElement EticketLogin()
	{
		return driver.findElement(eticketLogin);
	}
	
	public WebElement AtboprLogin()
	{
		return driver.findElement(atboprLogin);
	}

}
