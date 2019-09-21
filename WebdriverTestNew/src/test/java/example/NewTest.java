package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  System. setProperty("webdriver.chrome.driver", "C:\\SeleniumProject\\WebdriverTestNew\\src\\main\\resources\\Drivers\\chromedriver.exe");
	  System.out.println("Automation Testing");
	  WebDriver d=new ChromeDriver();
	  d.get("https://www.google.com/");
	  d.close();
  }
}
