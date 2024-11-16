package democlass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Practiceclass {

	public static void main(String[] args) throws InterruptedException {

		System.getProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.id("blogsmenu"))).perform();
		
		driver.findElement(By.linkText("Selenium143")).click();
		
		//driver.findElement(By.xpath("//button[normalize-space()='Double click Here']")).click();
		//driver.findElement(By.xpath("//button[normalize-space()='Double click Here']")).click();		
		
	}

}
