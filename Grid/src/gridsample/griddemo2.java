package gridsample;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class griddemo2 
{
	     WebDriver driver;
	     String baseURL, nodeURL;

	    // @Parameters("browser1")
	     @BeforeTest
	     public void setUp() throws MalformedURLException {
	         baseURL = "https://www.facebook.com/";
	         nodeURL = "http://192.168.1.9:5566/wd/hub";
	        // System.setProperty("webdriver.gecko.driver", "E:\\selenium  softwares\\geckodriver-v0.19.1-win32\\geckodriver.exe");
	         
	         
	         DesiredCapabilities capability = new DesiredCapabilities();
	         capability.setCapability("marionette", false);
	         capability.setBrowserName("firefox");
	         capability.setPlatform(Platform.ANY);
	        // FirefoxOptions options = new FirefoxOptions()
	         
	         driver = new RemoteWebDriver(new URL(nodeURL), capability);
	     }

	     @AfterTest
	     public void afterTest() {
	         driver.quit();
	     }
	     @Test
	     public void sampleTest() {
	         driver.get("https://www.facebook.com/");
	         //driver.get(baseURL);

	         /*if (driver.getPageSource().contains("MOBILE TESTING")) {
	             Assert.assertTrue(true, "Mobile Testing Link Found");
	         } else {
	             Assert.assertTrue(false, "Failed: Link not found");
	         }*/

	     }

	 }
	
	

