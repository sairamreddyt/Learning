package com.selenium.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "M:\\Sairam\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://login.oracle.com/mysso/signon.jsp?request_id=-4782010454026398257");
		
		WebElement email= driver.findElement(By.name("ssousername"));
		WebElement pass=driver.findElement(By.name("password"));
		
		email.sendKeys("abc6@gmail.com");//enter your mail id
		pass.sendKeys("Sairam@123");
		
		WebElement signin=driver.findElement(By.id("signin_button"));
		signin.submit();
	}
}
