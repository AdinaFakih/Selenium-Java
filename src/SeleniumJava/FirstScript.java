package SeleniumJava;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {
	
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\addyf\\Downloads\\selenium\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		
		driver.close();
	}
}
