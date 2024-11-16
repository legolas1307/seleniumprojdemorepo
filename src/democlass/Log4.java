package democlass;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		Logger log = LogManager.getLogger(Log4.class.getName());
		log.debug("Execution has started");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		log.debug("Chrome browser got launched");
		driver.manage().window().maximize();
		log.debug("Window got maximised");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.quit();
		log.debug("Driver got closed");
		int a = 2;
		if (a == 2) {
			log.info("Passed");
		} else {
			log.error("Failed");
		}
	}
}
