package PagesToExplore;

import org.openqa.selenium.WebDriver;

public class GoToWebSitePage1 
{
	static boolean title ;
	
	public static void OpenWeb(WebDriver driver)
	{
		title = driver.getTitle().equals("ITSupport247") ;
		
		if (!title)
		{
			driver.get("https://control.dtitsupport247.net");
		}
	}
		

}
