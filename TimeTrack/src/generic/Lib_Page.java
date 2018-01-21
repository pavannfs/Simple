package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Lib_Page  
{
	public WebDriver driver;
	
	public Lib_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void verifyTitle(String aTitle)
	{
		try
		{
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.titleIs(aTitle));
		}
		catch(Exception e)
		{
			Reporter.log("Title is not matching",true);
			Assert.fail();
		}
	}
	
	public void verifyElement(WebElement ele)
	{
		try
		{
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.visibilityOf(ele));
		}
		catch(Exception e)
		{
			Reporter.log("Element is not present",true);
			Assert.fail();
		}
	}
}
