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

public class Tables {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String givenname = "Praveen";
		
		 List<WebElement> names = driver.findElements(By.xpath("//table[@id='table1']//td[1]"));
		
		int row=0;
		
		for(int i=0;i<names.size();i++) {
			
			if(names.get(i).getText().equals(givenname)) {
				
				row = i;
			}
		}
		
		String path = "//table[@id='table1']//tr["+row+"]//td[3]";
		
		System.out.println(path);
		
		driver.quit();
	}
	
}