package Senarios_Cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PagesToExplore.GoTORMMSetupTab5;
import PagesToExplore.GoToLoginPage2;
import PagesToExplore.GoToWebSitePage1;

public class CreationOfNewRMMSiteAlongWithWebrootSitesUsingITSPortal 
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
	public static void TC1_CreateRMMSitealongWithWebrootSiteforServerCareOption() throws InterruptedException
	{
		GoToWebSitePage1.OpenWeb(driver);
		GoToLoginPage2.Username(driver).clear();
		GoToLoginPage2.Username(driver).sendKeys("engg@continuum.net");
		GoToLoginPage2.Password(driver).clear();
		GoToLoginPage2.Password(driver).sendKeys("Abc@1234");
		GoToLoginPage2.LogIn(driver).click();
		GoTORMMSetupTab5.RMMSetupTab(driver).click();
		GoTORMMSetupTab5.CreateaNewRMMSite(driver);
		Thread.sleep(15000);
		GoTORMMSetupTab5.SiteName(driver).clear();
		GoTORMMSetupTab5.SiteName(driver).sendKeys("MyRMMTestingSites1");
		GoTORMMSetupTab5.SiteCode(driver).clear();
		GoTORMMSetupTab5.SiteCode(driver).sendKeys("MyRMMTestingSites1");
		GoTORMMSetupTab5.SelectTimeZone(driver);
		GoTORMMSetupTab5.SelectNotification(driver);
		GoTORMMSetupTab5.ClickonInstallWebrootCheckBoxForServerCareOptions(driver).click();
		Thread.sleep(10000);
		GoTORMMSetupTab5.CreateNewWebrootSiteForServerCareOptions(driver).click();
		GoTORMMSetupTab5.EnterNameOfWebrootSiteToBeCreatedForServerOption(driver).clear();
		GoTORMMSetupTab5.EnterNameOfWebrootSiteToBeCreatedForServerOption(driver).sendKeys("AutomatedCreatedWebrootSite1");
		GoTORMMSetupTab5.CreateSiteandSaveSettings(driver).click();
		Thread.sleep(120000);
		System.out.println("Done its Working");
	}

	@Test (priority = 1 )
	public static void TC2_CreateRMMSitealongWithWebrootSiteforDesktopCareOption() throws InterruptedException
	{
		GoToWebSitePage1.OpenWeb(driver);
		GoToLoginPage2.Username(driver).clear();
		GoToLoginPage2.Username(driver).sendKeys("engg@continuum.net");
		GoToLoginPage2.Password(driver).clear();
		GoToLoginPage2.Password(driver).sendKeys("Abc@1234");
		GoToLoginPage2.LogIn(driver).click();
		GoTORMMSetupTab5.RMMSetupTab(driver).click();
		GoTORMMSetupTab5.CreateaNewRMMSite(driver);
		Thread.sleep(15000);
		GoTORMMSetupTab5.SiteName(driver).clear();
		GoTORMMSetupTab5.SiteName(driver).sendKeys("MyRMMTestingSites2");
		GoTORMMSetupTab5.SiteCode(driver).clear();
		GoTORMMSetupTab5.SiteCode(driver).sendKeys("MyRMMTestingSites2");
		GoTORMMSetupTab5.SelectTimeZone(driver);
		GoTORMMSetupTab5.SelectNotification(driver);
		GoTORMMSetupTab5.ClickonInstallWebrootCheckBoxForDesktopCareOptions(driver).click();
		Thread.sleep(10000);
		GoTORMMSetupTab5.CreateNewWebrootSiteForDesktopCareOptions(driver).click();
		GoTORMMSetupTab5.EnterNameOfWebrootSiteToBeCreatedForDesktopOption(driver).clear();
		GoTORMMSetupTab5.EnterNameOfWebrootSiteToBeCreatedForDesktopOption(driver).sendKeys("AutomatedCreatedWebrootSite2");
		GoTORMMSetupTab5.CreateSiteandSaveSettings(driver).click();
		Thread.sleep(120000);
		System.out.println("Done its Working");
	}
	
	@Test (priority = 2 )
	public static void TC3_CreateRMMSitealongWithWebrootSiteforServerAndDesktopCareOption() throws InterruptedException
	{
		GoToWebSitePage1.OpenWeb(driver);
		GoToLoginPage2.Username(driver).clear();
		GoToLoginPage2.Username(driver).sendKeys("engg@continuum.net");
		GoToLoginPage2.Password(driver).clear();
		GoToLoginPage2.Password(driver).sendKeys("Abc@1234");
		GoToLoginPage2.LogIn(driver).click();
		GoTORMMSetupTab5.RMMSetupTab(driver).click();
		GoTORMMSetupTab5.CreateaNewRMMSite(driver);
		Thread.sleep(15000);
		GoTORMMSetupTab5.SiteName(driver).clear();
		GoTORMMSetupTab5.SiteName(driver).sendKeys("MyRMMTestingSites13");
		GoTORMMSetupTab5.SiteCode(driver).clear();
		GoTORMMSetupTab5.SiteCode(driver).sendKeys("MyRMMTestingSites13");
		GoTORMMSetupTab5.SelectTimeZone(driver);
		GoTORMMSetupTab5.SelectNotification(driver);
		GoTORMMSetupTab5.ClickonInstallWebrootCheckBoxForServerCareOptions(driver).click();
		Thread.sleep(10000);
		GoTORMMSetupTab5.CreateNewWebrootSiteForServerCareOptions(driver).click();
		GoTORMMSetupTab5.EnterNameOfWebrootSiteToBeCreatedForServerOption(driver).clear();
		GoTORMMSetupTab5.EnterNameOfWebrootSiteToBeCreatedForServerOption(driver).sendKeys("AutomatedCreatedWebrootSite13");
		GoTORMMSetupTab5.ClickonInstallWebrootCheckBoxForDesktopCareOptions(driver).click();
		GoTORMMSetupTab5.CreateNewWebrootSiteForDesktopCareOptions(driver).click();
		GoTORMMSetupTab5.EnterNameOfWebrootSiteToBeCreatedForDesktopOption(driver).clear();
		GoTORMMSetupTab5.EnterNameOfWebrootSiteToBeCreatedForDesktopOption(driver).sendKeys("AutomatedCreatedWebrootSite14");
		GoTORMMSetupTab5.CreateSiteandSaveSettings(driver).click();
		Thread.sleep(120000);
		System.out.println("Done its Working");
	}


	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
}
