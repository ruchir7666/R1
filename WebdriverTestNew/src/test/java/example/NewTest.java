package example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class NewTest {
  @Test
  public void f() {
	  System. setProperty("webdriver.chrome.driver", "C:\\Users\\ruagarwal\\git\\repository\\WebdriverTestNew\\src\\main\\resources\\Drivers\\chromedriver.exe");
	  System.out.println("Automation Testing");
	  WebDriver d=new ChromeDriver();
	  d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  String eTitle = "Demo Guru99 Page";
		String aTitle = "" ;
		// launch Chrome and redirect it to the Base URL
		d.get("http://demo.guru99.com/test/guru99home/" );
		//Maximizes the browser window
		d.manage().window().maximize() ;
		//get the actual value of the title
		aTitle = d.getTitle();
		//compare the actual title with the expected title
		Assert.assertEquals("Test Passed:"+aTitle, eTitle, aTitle);
		//close browser
		d.close();
	}
  
}
