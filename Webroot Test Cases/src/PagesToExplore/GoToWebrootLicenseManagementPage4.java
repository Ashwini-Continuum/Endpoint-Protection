package PagesToExplore;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoToWebrootLicenseManagementPage4 
{
	private static WebElement WebObject = null ;

	public static WebElement ProductsServicesTab(WebDriver driver)
	{

		WebObject = driver.findElement(By.xpath("(//span[@class='spnMenu'])[4]")) ;
		return WebObject;
	}

	public static WebElement WebrootLicenseManagement(WebDriver driver)
	{

		WebObject = driver.findElement(By.linkText("Webroot License Management")) ;
		return WebObject;
	}

	public static void SwitchIntoFramesToAccessWebrootLicenseManagementPage(WebDriver driver)
	{

		driver.switchTo().frame("iframe");
		driver.switchTo().frame("ifrmQServerRight");
	}
	//AccessWebrootviaAPI
	public static void PlacingARequestForAccessWebrootviaAPI(WebDriver driver)
	{
		driver.findElement(By.xpath(".//*[@id='chkOptin']")).click();
		driver.findElement(By.xpath(".//*[@id='cl_optin']")).click();
	}

	public static void VerifySystemMessage1_YourrequesthasbeencreatedPleasecheckanemailfromwebrootwillbesenttoforapproval(WebDriver driver)
	{
		String ErrMsg = driver.findElement(By.xpath(".//*[@id='trMsg']/div/label")).getText();
		//Your request has been created. Please check, an email from webroot will be sent to praveen.upadhyay@continuum.net for approval
	}
	
	public static void CheckAlert_AccessWebrootviaAPIrequesthasalreadybeendone(WebDriver driver)
	{
		Alert alrt = driver.switchTo().alert();
		String alrttext = alrt.getText();
		alrt.accept();
		
	}

}
