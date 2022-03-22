package com.selenium.session2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "M:\\Sairam\\selenium\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.co.in/");
        
        TakesScreenshot screenshot= (TakesScreenshot)driver;
        
        File src= screenshot.getScreenshotAs(OutputType.FILE);
        
        try {
            FileHandler.copy(src, new File("M:\\Sairam\\selenium\\test2.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
