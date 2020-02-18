import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelloWorld extends Login {

	public static void main(String[] args) throws InterruptedException {
		Base bo=new Base();
		Common co=new Common();
		Login lo=new Login();
		//Lunching chrome browser
		bo.LunchBrowser();
		//Navigate to stoxx.com
		driver.get(co.Url);
		//wait for page load 
		bo.Wait();
		//Maximize the window
		bo.window();
		//Login as an admin
		lo.login();
		
		
		
		

	}

}
