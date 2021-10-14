package SeleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\addyf\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/test/newtours/");
		// user name
		driver.findElement(By.name("userName")).sendKeys("mercury");
		// password
		driver.findElement(By.name("password")).sendKeys("mercury");
		// submit
		driver.findElement(By.name("submit")).click();
		
		String exp_title = "Login: Mercury Tours";
		String act_title = driver.getTitle();
		
		if(exp_title.equals(act_title)==true) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}	
		
		driver.close();
	}
}