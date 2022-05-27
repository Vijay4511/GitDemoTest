package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class init {

	public WebDriver driver;
	
	public Properties prop;
	
	public WebDriver BrowserInitialization() throws IOException
	{

		prop = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\vjred\\Desktop\\Automation Testing\\SeleniumTraining\\SampMaven\\resources\\config.properties");
		prop.load(fis);
		
		String Browsername =prop.getProperty("browser");
	
		if(Browsername.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}else if(Browsername.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
			
		}else if(Browsername.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		return driver;
		
	}
	
	public String GetScreenshot(String Tcname, WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		String destfile = System.getProperty("user.dir")+"\\reports\\"+Tcname+".png";
		
		FileUtils.copyFile(src, new File(destfile));
		return destfile;
	}

}
