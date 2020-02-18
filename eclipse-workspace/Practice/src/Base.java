import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Base extends Login {
	public void LunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ce1103\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		 driver=new ChromeDriver();
	}
	public void Wait()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public void window()
	{
		driver.manage().window().maximize();
	}

}
