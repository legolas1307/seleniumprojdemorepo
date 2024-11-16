package democlass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DemoClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("selenium143")).click();

		driver.findElement(By.cssSelector(
				"img[src='https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjOmJyIWpTrRy4dSNl43Xmkyv8NFZRG1GMvL09NS8TLXx9OFnLEWLAuvMADA4b3Uc4Rmzg4YV_-dZ6QDpTYsNoedm0k2W2rGVM5YpLo7VRsuX0RDfczqRuFzMzp4EcliGY9GCHTUtcKWCxdpxn3rVi_QxhBAKSWEqwEvmvnrFYWO1_T0_PxmrUoJdMJ3K7H/s302/2024-02-17_133340.png']"))
				.click();

		driver.findElement(By.className("title style-scope ytd-guide-entry-renderer")).click();

		Set<String> windowids = driver.getWindowHandles();

		Iterator<String> itr = windowids.iterator();

		while (itr.hasNext()) {

			String windowid = itr.next();

			driver.switchTo().window(windowid);

			if (driver.getTitle().equals("Selenium143")) {

				driver.findElement(By.xpath("//a[@href='https://www.youtube.com/c/QAFox/playlists']//img")).click();
			}

			if (driver.getTitle().equals("Selenium143")) {

				driver.findElement(By.className("title style-scope ytd-guide-entry-renderer")).click();
			}
		}

		driver.quit();
	}

}
