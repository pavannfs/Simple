package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Lib_Page;

public class ActiTime_Home_Page extends Lib_Page
{
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	public ActiTime_Home_Page(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void clickLogout()
	{
		logout.sendKeys(Keys.ENTER);
	}
}
