package PagesToExplore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GoTORMMSetupTab5 
{
	private static WebElement WebObject = null ;

	public static WebElement RMMSetupTab(WebDriver driver)
	{

		WebObject = driver.findElement(By.linkText("RMM Setup"));
		return WebObject;
	}


	public static void CreateaNewRMMSite(WebDriver driver)
	{

		WebElement New = driver.findElement(By.id("ctl00_ctl00_leftPanel_CenterPanel_btnNew_input")) ;	
		Actions CreateNewSite = new Actions(driver) ;
		CreateNewSite.moveToElement(New).perform(); 
		driver.findElement(By.linkText("Create a new site")).click();
	}
	
	public static void UseAnExistingSite(WebDriver driver)
	{

		WebElement New = driver.findElement(By.id("ctl00_ctl00_leftPanel_CenterPanel_btnNew_input")) ;	
		Actions UseAnExistingSite = new Actions(driver) ;
		UseAnExistingSite.moveToElement(New).perform(); 
		driver.findElement(By.linkText("Use an existing site")).click();
	}
	
	public static void  SelectASite(WebDriver driver)
	{

		Select SelectASite = new Select(driver.findElement(By.id("ctl00_ctl00_leftPanel_CenterPanel_ddlNonRMMSite"))) ;
		SelectASite.selectByIndex(2);
	}
	
	public static WebElement SiteName(WebDriver driver)
	{

		WebObject = driver.findElement(By.id("ctl00_ctl00_leftPanel_CenterPanel_txtsiteName"));
		return WebObject;
	}
	
	public static WebElement SiteCode(WebDriver driver)
	{

		WebObject = driver.findElement(By.id("ctl00_ctl00_leftPanel_CenterPanel_txtSiteCode"));
		return WebObject;
	}
	
	public static void  SelectTimeZone(WebDriver driver)
	{

		Select TimeZone = new Select(driver.findElement(By.id("ctl00_ctl00_leftPanel_CenterPanel_ddlTimeZone"))) ;
		TimeZone.selectByVisibleText("UTC-10:00 (Hawaii)");
	}
	
	public static void  SelectNotification(WebDriver driver)
	{

		Select Notification = new Select(driver.findElement(By.id("ctl00_ctl00_leftPanel_CenterPanel_radProduct_i0_ddlNotification"))) ;
		Notification.selectByVisibleText("00000Proactive _AST");
	}
	
	public static WebElement ClickonInstallWebrootCheckBoxForServerCareOptions(WebDriver driver)
	{
		WebObject = driver.findElement(By.id("ctl00_ctl00_leftPanel_CenterPanel_radProduct_i0_chkWebroot")) ;
		//ctl00_ctl00_leftPanel_CenterPanel_radProduct_i0_chkWebroot
		return WebObject ;
	}
	
	
	public static WebElement CreateNewWebrootSiteForServerCareOptions(WebDriver driver)
	{
		WebObject = driver.findElement(By.id("ctl00_ctl00_leftPanel_CenterPanel_radProduct_i0_radWebrootAutoNewsiteS")) ;
		return WebObject ;
	}
	
	public static WebElement EnterNameOfWebrootSiteToBeCreatedForServerOption(WebDriver driver)
	{
		WebObject = driver.findElement(By.id("ctl00_ctl00_leftPanel_CenterPanel_radProduct_i0_WRNewsiteNameS")) ;
		return WebObject ;
	}
	
	
	public static WebElement ClickonInstallWebrootCheckBoxForDesktopCareOptions(WebDriver driver)
	{
		WebObject = driver.findElement(By.id("ctl00_ctl00_leftPanel_CenterPanel_radProduct_i0_chkWebrootD")) ;
		return WebObject ;
	}
	
	public static WebElement CreateNewWebrootSiteForDesktopCareOptions(WebDriver driver)
	{
		WebObject = driver.findElement(By.id("ctl00_ctl00_leftPanel_CenterPanel_radProduct_i0_radWebrootAutoNewsiteD")) ;
		return WebObject ;
	}
	
	public static WebElement EnterNameOfWebrootSiteToBeCreatedForDesktopOption(WebDriver driver)
	{
		WebObject = driver.findElement(By.id("ctl00_ctl00_leftPanel_CenterPanel_radProduct_i0_WRNewsiteNameD")) ;
		return WebObject ;
	}
	
	public static WebElement CreateSiteandSaveSettings(WebDriver driver)
	{
		WebObject = driver.findElement(By.id("ctl00_ctl00_leftPanel_CenterPanel_btnNext_input")) ;
		//ctl00_ctl00_leftPanel_CenterPanel_btnNext_input
		return WebObject ;
	}
	
	
}
