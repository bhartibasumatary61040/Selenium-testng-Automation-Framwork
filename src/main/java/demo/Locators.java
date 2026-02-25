package demo;

	import java.time.Duration;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;


	public class Locators {

	public static void main(String[] args) throws InterruptedException {

	WebDriver driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	driver.get("https://rahulshettyacademy.com/locatorspractice/");

	driver.findElement(By.id("inputUsername")).sendKeys("jojo bharti");

	driver.findElement(By.name("inputPassword")).sendKeys("jojobharti989");

	driver.findElement(By.cssSelector("button[type='submit']")).click();

	//driver.findElement(By.xpath("//button[text()='Sign In']")).click();

	driver.findElement(By.cssSelector("p.error")).getText();

	driver.findElement(By.linkText("Forgot your password?")).click();

	driver.findElement(By.cssSelector("input[placeholder=\"Name\"]")).sendKeys("jojo");

	driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).sendKeys("jojo@gmail.com");

	driver.findElement(By.cssSelector("input[placeholder=\"Phone Number\"]")).sendKeys("9803973012563");

	driver.findElement(By.className("reset-pwd-btn")).click();

	System.out.println(driver.findElement(By.xpath("//p[text()=\"Please use temporary password 'rahulshettyacademy' to Login.\"]")).getText());

	String s= driver.findElement(By.xpath("//p[text()=\"Please use temporary password 'rahulshettyacademy' to Login.\"]")).getText();

	String[] spt= s.split("'");

	String pass=spt[1];

	driver.findElement(By.className("go-to-login-btn")).click();

	driver.findElement(By.name("inputPassword")).sendKeys(pass);

	driver.findElement(By.cssSelector("button[type='submit']")).click();

	Thread.sleep(3000);

	System.out.println("SUCCESS");

	}

	}



