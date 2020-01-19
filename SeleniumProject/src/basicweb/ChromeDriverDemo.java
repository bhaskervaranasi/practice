package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverDemo {

	public static void main(String[] args) 
	{
		String baseURL = "http://google.com";
		
		System.setProperty("webdriver.chrome.driver", "E:\\Bhaskar\\Selenium\\chromedriver.exe");
		
		WebDriver driver =  new ChromeDriver();
		
		driver.get(baseURL);
	}

}
