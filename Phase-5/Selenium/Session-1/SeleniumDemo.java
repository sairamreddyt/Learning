package com.selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
	public static void main(String[] args) {
		//set property for web driver
		System.setProperty("webdriver.chrome.driver", "M:\\Sairam\\selenium\\chromedriver.exe");
		
		  WebDriver driver= new ChromeDriver();
	        String baseUrl="https://www.google.co.in/";
	        String expected="Google";
	        //launch googlechrome and direct it to baseURL
	        driver.get(baseUrl);
	        //get Actual Title
	        String actual= driver.getTitle();
	        
	        if(expected.equals(actual))
	            System.out.println("Test Passed..!!");
	        else
	            System.out.println("Test Failed");
	        //Diver Close
	        driver.close();
	}

}
