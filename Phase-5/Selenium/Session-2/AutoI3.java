package com.selenium.session2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutoI3 {

	public static void main(String[] args) throws IOException,InterruptedException{
			
		System.setProperty("webdriver.chrome.driver", "M:\\Sairam\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.shine.com/registration/parser/");
		WebElement email= driver.findElement(By.id("id_name"));
		email.sendKeys("sairam@gmail.com");
		
		WebElement upload= driver.findElement(By.id("id_file"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;
	
		executor.executeScript("arguments[0].click()", upload);
		
		Thread.sleep(5000);
		
		Runtime.getRuntime().exec("M:sairam\\selenium\\fileupload.exe");
	}
}
