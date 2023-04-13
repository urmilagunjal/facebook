package org.hexa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.*;

public class Windowhandaler {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();

		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		String parentWindowID=driver.getWindowHandle();
		System.out.println("Parent Window ID: "+parentWindowID);
		driver.findElement(By.xpath("//button[@id='button1']")).click();
		String childWindowID=driver.getWindowHandle();
		System.out.println("Child Window ID: "+childWindowID);
		Set<String> allWindowID=driver.getWindowHandles();
		for(String x: allWindowID)
		{
			System.out.println(x);
	
		if(!parentWindowID.equals(x))
		{
			System.out.println("Child Window ID:"+x);
			driver.switchTo().window(x);
			driver.findElement(By.xpath("//span[text()='Download Course Brochure']")).click();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.switchTo().defaultContent();
		}
		}
}
}
