package progressive.common;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class progressiveBase {

	public WebDriver driver;
	public String url;
	private String bName;

	public WebDriver getDriver() throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"//Users//SUNNY//Desktop//my-workspace//progressive//resources//data.properties");
		prop.load(fis);

		bName = prop.getProperty("browser");
		url = prop.getProperty("url");
		System.out.println("bName");

		if (bName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"/Users/SUNNY/Desktop/my-workspace/progressive/Driver/chromedriver");
			driver = new ChromeDriver();

		} else if (bName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"/Users/SUNNY/Desktop/my-workspace/progressive/Driver/geckodriver");
			driver = new FirefoxDriver();

		} else if (bName.equalsIgnoreCase("ie")) {
			// ie code goes here
		} else {
			System.out.println("Unknows Browser, Browser Cant open");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		return driver;
	}

	public void closeBrowser() {
		driver.close();
	}

}
