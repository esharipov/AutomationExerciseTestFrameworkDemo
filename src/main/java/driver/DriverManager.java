package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
	private static WebDriver driver;
	
	private DriverManager() {
		
	}
	
	public static WebDriver getDriver() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		return driver;
	}
	
	public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
