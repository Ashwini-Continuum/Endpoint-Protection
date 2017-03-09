package PagesToExplore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoToAdminPage3 
{
	private static WebElement WebObject = null ;

	public static WebElement AdminTab(WebDriver driver)
	{

		WebObject = driver.findElement(By.linkText("Admin"));   
		return WebObject;
	}

	

}
