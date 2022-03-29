package com.seleniumgrid.com;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrid {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		URL url= new URL("http://192.168.48.142:4444/wd/hub");
		WebDriver driver = new RemoteWebDriver(url,cap);
		
		driver.get("https://google.com");
		System.out.println("Title: "+driver.getTitle());
		
		driver.close();
	}
}