package org.hexa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dropdowen {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.ex");
		ChromeOptions options=new ChromeOptions();

		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(options);
		driver.get("http://ironspider.ca/forms/dropdowns.htm");
		driver.manage().window().maximize();
		WebElement w=driver.findElement(By.name("coffee2"));
		Select s=new Select(w);
		s.selectByValue("cream");
		s.selectByValue("whipped");
		s.selectByValue("skim");
		List<WebElement> w1=s.getAllSelectedOptions();
		for(int i =0;i<w1.size();i++)
		{
			System.out.println(w1.get(i).getText());
		}
		boolean  b=s.isMultiple();
		System.out.println(b);
		s.deselectByValue("cream");
		//s.selectByIndex(3);
	}
}
