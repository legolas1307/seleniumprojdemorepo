package newpack;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Calendars {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//driver.get("http://omayo.blogspot.com/");
		Thread.sleep(5000);
		
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//input[@placeholder='Date of travel']")).click();
		
		Actions actions = new Actions(driver);

		actions.moveToElement(driver.findElement(By.xpath("//input[@placeholder='Date of travel']"))).click().perform();
		
		Thread.sleep(5000);
		
		System.out.println(driver.findElement(By.xpath("//span[@class='cur-month']")).getText());
		
		while(!driver.findElement(By.xpath("//span[@class='cur-month']")).getText().contains("Dece")){
			
			driver.findElement(By.className("flatpickr-next-month")).click();
			
		}
		
		List<WebElement> days = driver.findElements(By.className("day"));
		
		for(int i=0;i<days.size();i++) {
			
			if(days.get(i).getTagName().equalsIgnoreCase("15")) {
				
				days.get(i).click();
				break;
			}
		}
		
	}

}
