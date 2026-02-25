package eCommerce;

import java.time.Duration;
import java.util.Arrays;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class AddingItemsToCart {

	/**
	 * 
	 * @param args
	 * 
	 * @throws InterruptedException
	 * 
	 */

	public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		String[] items = { "Cucumber", "Brocolli" };

		int j = 0;

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		Thread.sleep(2000);

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {

			String[] name = products.get(i).getText().split("-");

			String formattedName = name[0].trim();

			List li = Arrays.asList(items);

			if (li.contains(formattedName)) {

				j++;

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

//Thread.sleep(5000);

				if (j == items.length) {

					break;

				}

			}

		}

		System.out.println("Success!");

	}

}