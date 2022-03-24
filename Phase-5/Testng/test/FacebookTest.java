package com.selenium.Testng;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class FacebookTest {

	private WebDriver driver;

	//test1
	@Test(groups = "Chrome")
	public void launchFacebook() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
	}

	//test2
	@Test(groups="Chrome", dependsOnMethods = "launchFacebook")
	public void login() {
		WebElement email = driver.findElement(By.cssSelector("#email"));
		email.sendKeys("sonam@gmail.com");
		WebElement password = driver.findElement(By.cssSelector("#pass"));
		password.sendKeys("Sonam@123");

		WebElement button = driver.findElement(By.name("login"));
		button.click();
	}
	
	//test 3
	@Test(groups = "Firefox", dependsOnGroups = "Chrome")
	public void launchFirefox() {
		System.setProperty("webdriver.gecko.driver",
				"M:\\Sairam\\selenium\\chromedriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
	}

	//test 4
	@Test(groups="Firefox", dependsOnMethods = "launchFirefox")
	public void loginWithFirefox() {
		WebElement email = driver.findElement(By.cssSelector("#email"));
		email.sendKeys("sairam@gmail.com");
		WebElement password = driver.findElement(By.cssSelector("#pass"));
		password.sendKeys("Sairam@123");

		WebElement button = driver.findElement(By.name("login"));
		button.click();
	}

	
}
