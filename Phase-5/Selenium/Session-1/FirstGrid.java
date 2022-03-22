package com.selenium.demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*1. load the driver of the browser
 *2. set the build path with all the jar files,create an object for the webdriver
 *3.maximise the web browser screen
 *4.specify the webpage what u want to test
 *5.access the web components over the webpage
 * */
public class FirstGrid {
	public static void main(String[] args) {
	//load the driver
		System.setProperty("webdriver.chrome.driver","M:\\Sairam\\selenium\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
	//maximise the web browser screen
		wd.manage().window().maximize();
	//load the webpage
		wd.get("https://www.amazon.in/");
//title of webpage what loaded
		System.out.println(wd.getTitle());
//load the url
		System.out.println(wd.getCurrentUrl());
		//close the browser
        //wd.close();
		
		
	}
}