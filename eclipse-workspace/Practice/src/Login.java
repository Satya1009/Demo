import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	static WebDriver driver;

		 public static void login() {
			
		
		driver.findElement(By.xpath("//*[@id=\"eucookie_confirmation_popup\"]/div/div[2]/input")).click();
		WebElement ele = driver.findElement(By.xpath("//span[text()='Login/Register']"));
		WebElement username=driver.findElement(By.xpath("//input[@id='_58_login']"));
		WebElement loginbutton=driver.findElement(By.xpath("//input[@class='large-6 header-login-submit']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
        executor.executeScript("arguments[0].value='avinash1@yopmail.com';", username);
		driver.findElement(By.id("_58_password")).sendKeys("temporarY@6");
		executor.executeScript("arguments[0].click();", loginbutton);
		}

	}

	


