package com.orange;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange {
	public static void main(String[] args) {
		
		//configure browser and web page
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		
		//title of the page
		String title = driver.getTitle();
		System.out.println(title);
		
		//URL
		String url = driver.getCurrentUrl();
		System.out.println(url);
	//	url.click();
	}

}
