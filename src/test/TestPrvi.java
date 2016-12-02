package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class TestPrvi {
	WebDriver driver;
	String url;
  
  @BeforeClass
  public void beforeClass() {
	  url = "http://demoqa.com/";
	  driver = new FirefoxDriver();
	  
	  driver.get(url);
  }
  
  @Test
  public void f() {
	  WebElement aboutusLink = driver.findElement(By.id("menu-item-158"));
	  aboutusLink.click();
	  
	  WebElement header = driver.findElement(By.xpath("id('post-156')//h1"));
	  String textHeader = header.getText();
	 
	  assert textHeader.equals("About us"): "Tekst se ne poklapa!";
	  Assert.assertEquals(textHeader, "About us", "Check text ...");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
