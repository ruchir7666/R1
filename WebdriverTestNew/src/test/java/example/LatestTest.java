package example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class LatestTest {
  @Test
  public void f() {
	  
	  System. setProperty("webdriver.chrome.driver", "C:\\Users\\ruagarwal\\git\\repository\\WebdriverTestNew\\src\\main\\resources\\Drivers\\chromedriver.exe");
	  WebDriver d=new ChromeDriver();
	  d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  String eTitle = "Demo Guru99 Page";
		String aTitle = "" ;
		// launch Chrome and redirect it to the Base URL
		d.get("http://demo.guru99.com/test/guru99home/" );
		Reporter.log("Guru99 website is opened");
		//Maximizes the browser window
		d.manage().window().maximize() ;
		//get the actual value of the title
		aTitle = d.getTitle();
		//compare the actual title with the expected title
		Assert.assertEquals("Test Passed:"+aTitle, eTitle, aTitle);
		Reporter.log("Verification of Guru99 title");
		//close browser
		d.close();
  }
}
