package Crossbrowsertest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Allbrowser {
	WebDriver driver;

	@Test
	@Parameters("browser")

	
	public void verifypageTitle(String browserName) {
		
		if (browserName.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", "E://geckodriver-v0.24.0-win64//geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver","E:\\IEDriver\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			
			
			
		}

		driver.manage().window().maximize();
		driver.get("http://192.168.10.242");
		System.out.println(driver.getTitle());
       // driver.quit();
	}

}
