package jenkins;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class jenkinsParameterTest {
	@Test
	public void reciveParameter()
	{
		String browserValue = System.getProperty("Browser");
		Reporter.log(browserValue,true);
		
	}

}
