package gridsample;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class griddemo 
{
	     WebDriver driver;
	     String baseURL, nodeURL;
        
	     @Parameters("browser")
	     @BeforeTest
	     public void setUp(String browser) throws MalformedURLException {
	         baseURL = "http://demo.guru99.com/test/guru99home/";
	         nodeURL = "http://192.168.1.9:5566/wd/hub";	         
	         DesiredCapabilities capability =new DesiredCapabilities();
	         capability.setBrowserName(browser);
	         capability.setPlatform(Platform.ANY);
	         driver = new RemoteWebDriver(new URL(nodeURL), capability);
	     }

	     @AfterTest
	     public void afterTest() {
	         driver.quit();
	     }
	     
	     @Test
	     public void sampleTest() {
	         //driver.get(baseURL);
	         driver.get(baseURL);

	         if (driver.getPageSource().contains("MOBILE TESTING")) {
	             Assert.assertTrue(true, "Mobile Testing Link Found");
	         } else {
	             Assert.assertTrue(false, "Failed: Link not found");
	         }

	     }

	 }
	
	

