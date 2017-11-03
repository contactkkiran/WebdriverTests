package com.amazon;

import java.util.concurrent.TimeUnit;
//--
import org.openqa.selenium.By;
//--
import org.openqa.selenium.WebDriver;
//--
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//--
import org.openqa.selenium.firefox.FirefoxDriver;
//--
import org.testng.Assert;
//--
import org.testng.annotations.AfterClass;
//--
import org.testng.annotations.BeforeClass;
//--
import org.testng.annotations.Test;

import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

public class AmazonSearch {
	private WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();

		// driver = new FirefoxDriver();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
		driver.quit();

	}

	@Test
	public void verifySearchButton() throws InterruptedException {
		// driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.amazon.com");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("cheapest Samsung Galaxy S8");
		Thread.sleep(5000);

		driver.findElement(
				By.xpath("//span[@id='nav-search-submit-text']/ following-sibling::input[@class='nav-input']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h2[contains(text(),'Samsung Galaxy S8 64GB GSM Unlocked Phone')]")).click();

		String price = driver.findElement(By.xpath("//span[@id='priceblock_ourprice']")).getText();
		// Add to cart

		Thread.sleep(5000);

		driver.findElement(By.id("add-to-cart-button")).click();

		// Click on Add button
		Thread.sleep(5000);

		driver.findElement(By.id("siAddCoverage-announce")).click();

		System.out.println(price);

	}
}