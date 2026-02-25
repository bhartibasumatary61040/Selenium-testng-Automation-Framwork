package endToendProgram;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {
	public static void main(String[] args) throws InterruptedException {
		
		//Give me the  count of links on the page 
		
		//2 count of footer section 
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//Count of only first section from the footer section 
		
		WebElement section = driver.findElement(By.xpath("//div[@id=\"gf-BIG\"]/table/tbody/tr/td/ul"));
		System.out.println(section.findElements(By.tagName("a")).size());
		
		// click on each link in the coloum and check if  the pages are opening 
		
		
		for(int i =1; i<section.findElements(By.tagName("a")).size(); i++) {
			
			String clickonLinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			section.findElements(By.tagName("a")).get(i).sendKeys(clickonLinkTab);
			
			Thread.sleep(5000L);
		}
			Set<String> abc = driver.getWindowHandles();
			
			Iterator<String> it = abc.iterator();
			
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
				
				
			}
			
			
			
		}
		
		
		
		

}
