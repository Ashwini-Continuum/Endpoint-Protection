package PagesToExplore;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertsOnCreateNewRMMSiteAndUseAnExistingSitePageOnCreatingWebrootSite6
{

	private static WebElement WebObject = null ;
	
	public static void CheckAlert_AWebrootsitewiththisnamealreadyexists(WebDriver driver)
	{
		Alert alrt = driver.switchTo().alert();
		String alrttext = alrt.getText();
		alrt.accept();
		
	}
	
	public static void CheckAlert_EnteranameforthenewWebrootsite(WebDriver driver)
	{
		Alert alrt = driver.switchTo().alert();
		String alrttext = alrt.getText();
		alrt.accept();
		
	}
	
	public static void CheckAlert_OnlyblankspacesandspecialcharactersarenotsupportedinnewWebrootsitefieldPleaseprovideavalidnewWebrootsitetocontinue(WebDriver driver)
	{
		Alert alrt = driver.switchTo().alert();
		String alrttext = alrt.getText();
		alrt.accept();
		
	}
}
