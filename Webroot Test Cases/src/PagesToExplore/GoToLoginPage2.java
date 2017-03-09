package PagesToExplore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoToLoginPage2 
{
	private static WebElement WebObject = null ;
	
	public static WebElement Username(WebDriver driver)
	{
		
		WebObject = driver.findElement(By.id("user_txt"));
		return WebObject;
	}
	
	public static WebElement Password(WebDriver driver)
	{
		
		WebObject = driver.findElement(By.id("user_pass"));
		return WebObject;
	}
	
	public static WebElement LogIn(WebDriver driver)
	{
		
		WebObject = driver.findElement(By.xpath(".//*[@id='Submit']"));
		return WebObject;
	}

}
