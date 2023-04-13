package org.hexa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(options);
		//here we can asking to code for wait 20sec. without any condition
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://adactin.com/HotelApp/index.php");
		driver.findElement(By.id("username")).sendKeys("MAnasi");
		driver.findElement(By.id("password")).sendKeys("manasi@12");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("login"))));
		driver.findElement(By.id("login")).click();

}
}
