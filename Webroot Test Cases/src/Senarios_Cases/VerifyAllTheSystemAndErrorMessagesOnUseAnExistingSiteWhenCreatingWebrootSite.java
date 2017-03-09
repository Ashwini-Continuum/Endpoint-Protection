package Senarios_Cases;
import PagesToExplore.GoToWebSitePage1;
import PagesToExplore.GoToLoginPage2;
import PagesToExplore.GoToAdminPage3;
import PagesToExplore.GoToWebrootLicenseManagementPage4;
import PagesToExplore.GoTORMMSetupTab5;
import PagesToExplore.AlertsOnCreateNewRMMSiteAndUseAnExistingSitePageOnCreatingWebrootSite6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyAllTheSystemAndErrorMessagesOnUseAnExistingSiteWhenCreatingWebrootSite 
{

	static WebDriver driver ;

	@BeforeClass
	public void openBrowser()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test (priority = 0 )
	public static void TC1_VerifyAlert_AWebrootsitewiththisnamealreadyexists() throws InterruptedException
	{
		GoToWebSitePage1.OpenWeb(driver);
		GoToLoginPage2.Username(driver).clear();
		GoToLoginPage2.Username(driver).sendKeys("engg@continuum.net");
		GoToLoginPage2.Password(driver).clear();
		GoToLoginPage2.Password(driver).sendKeys("Abc@1234");
		GoToLoginPage2.LogIn(driver).click();
		GoTORMMSetupTab5.RMMSetupTab(driver).click();
		GoTORMMSetupTab5.UseAnExistingSite(driver);
		GoTORMMSetupTab5.SelectASite(driver);
		GoTORMMSetupTab5.SelectNotification(driver);
		GoTORMMSetupTab5.ClickonInstallWebrootCheckBoxForServerCareOptions(driver).click();
		Thread.sleep(10000);
		GoTORMMSetupTab5.CreateNewWebrootSiteForServerCareOptions(driver).click();
		GoTORMMSetupTab5.EnterNameOfWebrootSiteToBeCreatedForServerOption(driver).clear();
		GoTORMMSetupTab5.EnterNameOfWebrootSiteToBeCreatedForServerOption(driver).sendKeys("AutomatedCreatedWebrootSite4");
		GoTORMMSetupTab5.ClickonInstallWebrootCheckBoxForDesktopCareOptions(driver).click();
		GoTORMMSetupTab5.CreateNewWebrootSiteForDesktopCareOptions(driver).click();
		GoTORMMSetupTab5.EnterNameOfWebrootSiteToBeCreatedForDesktopOption(driver).clear();
		GoTORMMSetupTab5.EnterNameOfWebrootSiteToBeCreatedForDesktopOption(driver).sendKeys("AutomatedCreatedWebrootSite5");
		GoTORMMSetupTab5.CreateSiteandSaveSettings(driver).click();
		AlertsOnCreateNewRMMSiteAndUseAnExistingSitePageOnCreatingWebrootSite6.CheckAlert_AWebrootsitewiththisnamealreadyexists(driver);
		Assert.assertEquals("A Webroot site with this name already exists.", "A Webroot site with this name already exists.");

	}

	@Test (priority = 1 , enabled = false )
	public static void TC2_VerifyAlert_EnteranameforthenewWebrootsite() throws InterruptedException
	{
		GoToWebSitePage1.OpenWeb(driver);
		GoToLoginPage2.Username(driver).clear();
		GoToLoginPage2.Username(driver).sendKeys("engg@continuum.net");
		GoToLoginPage2.Password(driver).clear();
		GoToLoginPage2.Password(driver).sendKeys("Abc@1234");
		GoToLoginPage2.LogIn(driver).click();
		GoTORMMSetupTab5.RMMSetupTab(driver).click();
		GoTORMMSetupTab5.UseAnExistingSite(driver);
		GoTORMMSetupTab5.SelectASite(driver);
		GoTORMMSetupTab5.SelectNotification(driver);
		GoTORMMSetupTab5.ClickonInstallWebrootCheckBoxForServerCareOptions(driver).click();
		Thread.sleep(10000);
		GoTORMMSetupTab5.CreateNewWebrootSiteForServerCareOptions(driver).click();
		GoTORMMSetupTab5.EnterNameOfWebrootSiteToBeCreatedForServerOption(driver).clear();
		GoTORMMSetupTab5.EnterNameOfWebrootSiteToBeCreatedForServerOption(driver).sendKeys("AutomatedCreatedWebrootSite4");
		GoTORMMSetupTab5.ClickonInstallWebrootCheckBoxForDesktopCareOptions(driver).click();
		GoTORMMSetupTab5.CreateNewWebrootSiteForDesktopCareOptions(driver).click();
		GoTORMMSetupTab5.EnterNameOfWebrootSiteToBeCreatedForDesktopOption(driver).clear();
		GoTORMMSetupTab5.EnterNameOfWebrootSiteToBeCreatedForDesktopOption(driver).sendKeys("AutomatedCreatedWebrootSite5");
		GoTORMMSetupTab5.CreateSiteandSaveSettings(driver).click();
		AlertsOnCreateNewRMMSiteAndUseAnExistingSitePageOnCreatingWebrootSite6.CheckAlert_EnteranameforthenewWebrootsite(driver);
		Assert.assertEquals("Enter a name for the new Webroot site.", "Enter a name for the new Webroot site.");
	}

	@Test (priority = 2 , enabled = false )
	public static void TC3_VerifyAlert_OnlyblankspacesandspecialcharactersarenotsupportedinnewWebrootsitefieldPleaseprovideavalidnewWebrootsitetocontinue() throws InterruptedException
	{
		GoToWebSitePage1.OpenWeb(driver);
		GoToLoginPage2.Username(driver).clear();
		GoToLoginPage2.Username(driver).sendKeys("engg@continuum.net");
		GoToLoginPage2.Password(driver).clear();
		GoToLoginPage2.Password(driver).sendKeys("Abc@1234");
		GoToLoginPage2.LogIn(driver).click();
		GoTORMMSetupTab5.RMMSetupTab(driver).click();
		GoTORMMSetupTab5.UseAnExistingSite(driver);
		GoTORMMSetupTab5.SelectASite(driver);
		GoTORMMSetupTab5.SelectNotification(driver);
		GoTORMMSetupTab5.ClickonInstallWebrootCheckBoxForServerCareOptions(driver).click();
		Thread.sleep(10000);
		GoTORMMSetupTab5.CreateNewWebrootSiteForServerCareOptions(driver).click();
		GoTORMMSetupTab5.EnterNameOfWebrootSiteToBeCreatedForServerOption(driver).clear();
		GoTORMMSetupTab5.EnterNameOfWebrootSiteToBeCreatedForServerOption(driver).sendKeys("AutomatedCreatedWebrootSite4");
		GoTORMMSetupTab5.ClickonInstallWebrootCheckBoxForDesktopCareOptions(driver).click();
		GoTORMMSetupTab5.CreateNewWebrootSiteForDesktopCareOptions(driver).click();
		GoTORMMSetupTab5.EnterNameOfWebrootSiteToBeCreatedForDesktopOption(driver).clear();
		GoTORMMSetupTab5.EnterNameOfWebrootSiteToBeCreatedForDesktopOption(driver).sendKeys("AutomatedCreatedWebrootSite5");
		GoTORMMSetupTab5.CreateSiteandSaveSettings(driver).click();
		AlertsOnCreateNewRMMSiteAndUseAnExistingSitePageOnCreatingWebrootSite6.CheckAlert_EnteranameforthenewWebrootsite(driver);
		Assert.assertEquals("Only blank spaces and special characters are not supported in  new Webroot site field. Please provide a valid  new Webroot site to continue.", "Only blank spaces and special characters are not supported in  new Webroot site field. Please provide a valid  new Webroot site to continue.");
	}

	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
}
