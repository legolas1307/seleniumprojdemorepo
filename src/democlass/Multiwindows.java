package democlass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Multiwindows {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Blogger")).click();
		
		//driver.findElement(By.xpath("//a[@class='cta ga-hero-cta']")).click();
		
		//driver.findElement(By.xpath("//a[normalize-space()='Help']")).click();
		
		Set<String> windowids = driver.getWindowHandles();
		
		Iterator<String> itr = windowids.iterator();
		
		while(itr.hasNext()) {
			
			String windowid = itr.next();
			
			driver.switchTo().window(windowid);
						
			if(driver.getTitle().equals("Create a unique and beautiful blog easily")) {
				
				driver.findElement(By.xpath("//a[@class='cta ga-hero-cta']")).click();
			}
			
			if(driver.getTitle().equals("Google Account Help")) {
			
			driver.findElement(By.xpath("//a[normalize-space()='Help']")).click();
			
			}
			
		}
						
		driver.quit();
	}

}
