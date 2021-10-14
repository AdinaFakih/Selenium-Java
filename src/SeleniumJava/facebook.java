package SeleniumJava;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\addyf\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/"); 
		
		String exp_title = "Facebook – log in or sign up";
		String act_title = driver.getTitle();
		
		if(exp_title.equals(act_title)==true) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}	
		driver.close();
	}
}