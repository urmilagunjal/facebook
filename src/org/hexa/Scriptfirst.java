package org.hexa;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Scriptfirst {
	public static void main(String[] args) throws InterruptedException {
		//System is a static class and setProperty is static method argument is (key ,value)
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\Downloads\\chromedriver_win3\\chromedriver.exe");
		//Load the driver ^
		ChromeOptions options=new ChromeOptions();
		//addAgrument is method belongs to ChromOptions
		options.addArguments("--remote-allow-origins=*");
		//Give me the remote access take a permission through browser
		//creating object for chrome driver
		WebDriver driver =new ChromeDriver(options);
		//To open and maximize the window
		driver.manage().window().maximize();
		//To open a url
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		//driver.close();
	}
}
