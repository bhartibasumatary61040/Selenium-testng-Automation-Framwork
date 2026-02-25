package dropdowns;
	import java.time.Duration;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class CheckBox {

	public static void main(String[] args) throws InterruptedException {

	WebDriver driver = new ChromeDriver();

	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

	System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

	driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

	System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());


	//Count the Number of Check boxes

	System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

	driver.findElement(By.id("divpaxinfo")).click();

	Thread.sleep(2000L);

	}


	}



