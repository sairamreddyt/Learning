package com.selenium.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "M:\\Sairam\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		WebElement email=driver.findElement(By.name("sView1:r1:0:email"));
		WebElement Password=driver.findElement(By.name("sView1:r1:0:password"));
		WebElement RePassword=driver.findElement(By.name("sView1:r1:0:retypePassword"));
		WebElement country=driver.findElement(By.id("sView1:r1:0:country::content"));
		WebElement fname=driver.findElement(By.id("sView1:r1:0:firstName::content"));
		WebElement lname=driver.findElement(By.id("sView1:r1:0:lastName::content"));
		WebElement jobtitle=driver.findElement(By.id("sView1:r1:0:jobTitle::content"));
		WebElement phone=driver.findElement(By.id("sView1:r1:0:workPhone::content"));
		WebElement cname=driver.findElement(By.id("sView1:r1:0:companyName::content"));
		WebElement address=driver.findElement(By.id("sView1:r1:0:address1::content"));
		WebElement city=driver.findElement(By.id("sView1:r1:0:city::content"));
		WebElement state=driver.findElement(By.id("sView1:r1:0:state::content"));
		WebElement postalcode=driver.findElement(By.id("sView1:r1:0:postalCode::content"));
		
		email.sendKeys("abc@gmail.com");//enter your mail id
		Password.sendKeys("Sairam@1234");
		RePassword.sendKeys("Sairam@1234");
		country.sendKeys("India");
		fname.sendKeys("sai");
		lname.sendKeys("reddy");
		jobtitle.sendKeys("Developer");
		phone.sendKeys("8123456708");
		cname.sendKeys("wipr");
		address.sendKeys("kothapaeta");
		city.sendKeys("Rayachoty");
		state.sendKeys("Andhra Pradesh");
		postalcode.sendKeys("516269");
		
	   WebElement Register= driver.findElement(By.linkText("Create Account"));
       Register.click();
		
		
	}
}