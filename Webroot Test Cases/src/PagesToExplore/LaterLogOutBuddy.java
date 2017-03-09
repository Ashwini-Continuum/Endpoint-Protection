package PagesToExplore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LaterLogOutBuddy 
{

	private static WebElement WebObject = null ;
	
	public static WebElement LogOut(WebDriver driver)
	{

		WebObject = driver.findElement(By.linkText("Log Out"));
		return WebObject;
	}
}
