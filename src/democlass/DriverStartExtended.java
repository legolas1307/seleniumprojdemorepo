package democlass;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import democlass.PoM;

public class DriverStartExtended {

	static WebDriver driver = null;

	public static void startup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
	}

	void testlogin() {
		PoM pm = new PoM(driver);
		PoM.setusername("Abhishek");
	}

	void testlogintwo() {
		PoM pm = new PoM(driver);
		PoM.setpassword("rahulshettyacademy");
	}

	void login() {
		PoM pm = new PoM(driver);
		PoM.clicklogin();
	}

	void quit() {
		driver.quit();
	}

	public static void main(String[] args) {

		DriverStartExtended obj = new DriverStartExtended();
		obj.startup();
		obj.testlogin();
		obj.testlogintwo();
		obj.login();
		obj.quit();
	}

}
