package democlass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PoM {

	static WebDriver driver = null;

	static By username_loc = By.id("inputUsername");
	static By password_loc = By.xpath("//input[@placeholder='Password']");
	static By submit_loc = By.xpath("//button[normalize-space()='Sign In']");

	public PoM(WebDriver driver) {
		this.driver = driver;
	}

	public static void setusername(String user) {
		driver.findElement(username_loc).sendKeys(user);
	}

	public static void setpassword(String pswd) {
		driver.findElement(password_loc).sendKeys(pswd);
	}

	public static void clicklogin() {
		driver.findElement(submit_loc).click();
	}
}
