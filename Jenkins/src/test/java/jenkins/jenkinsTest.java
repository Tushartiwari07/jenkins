package jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class jenkinsTest 
{
	@Test
	public void launch()
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Reporter.log("Youtube has launched successfully",true);
	}
	

}
