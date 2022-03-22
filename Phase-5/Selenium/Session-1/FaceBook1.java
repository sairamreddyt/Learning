package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "M:\\Sairam\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement email= driver.findElement(By.id("email"));
		String hint=email.getAttribute("placeholder");
		System.out.println(hint);
		
		WebElement element = driver.findElement(By.className("_8eso"));
		System.out.println(element.getText());
		
		//Link Text
		WebElement link = driver.findElement(By.linkText("Forgotten password?"));
		link.click();
		//driver.close();
	}
}