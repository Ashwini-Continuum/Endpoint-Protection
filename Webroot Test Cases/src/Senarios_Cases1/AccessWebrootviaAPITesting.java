package Senarios_Cases1;
import PagesToExplore.GoToWebSitePage1;
import PagesToExplore.GoToLoginPage2;
import PagesToExplore.GoToAdminPage3;
import PagesToExplore.GoToWebrootLicenseManagementPage4;
import PagesToExplore.GoTORMMSetupTab5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PagesToExplore.GoToAdminPage3;
import PagesToExplore.GoToLoginPage2;
import PagesToExplore.GoToWebSitePage1;
import PagesToExplore.GoToWebrootLicenseManagementPage4;

public class AccessWebrootviaAPITesting 
{
	static WebDriver driver ;

	@BeforeClass
	public void openBrowser()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test(priority = 0 )
	public static void TC1_PlaceARequestForAccessWebrootviaAPI() throws InterruptedException
	{
		GoToWebSitePage1.OpenWeb(driver);
		GoToLoginPage2.Username(driver).clear();
		GoToLoginPage2.Username(driver).sendKeys("engg@continuum.net");
		GoToLoginPage2.Password(driver).clear();
		GoToLoginPage2.Password(driver).sendKeys("Abc@1234");
		GoToLoginPage2.LogIn(driver).click();
		GoToAdminPage3.AdminTab(driver).click();
		GoToWebrootLicenseManagementPage4.ProductsServicesTab(driver).click();
		GoToWebrootLicenseManagementPage4.WebrootLicenseManagement(driver).click();
		GoToWebrootLicenseManagementPage4.SwitchIntoFramesToAccessWebrootLicenseManagementPage(driver);
		GoToWebrootLicenseManagementPage4.PlacingARequestForAccessWebrootviaAPI(driver);
		Thread.sleep(60000);
		GoToWebrootLicenseManagementPage4.VerifySystemMessage1_YourrequesthasbeencreatedPleasecheckanemailfromwebrootwillbesenttoforapproval(driver);
		Assert.assertEquals("Your request has been created. Please check, an email from webroot will be sent to praveen.upadhyay@continuum.net for approval", "Your request has been created. Please check, an email from webroot will be sent to praveen.upadhyay@continuum.net for approval");
	}

	public static void TC2_OverrideARequestForAccessWebrootviaAPI() throws InterruptedException
	{
		GoToWebSitePage1.OpenWeb(driver);
		GoToLoginPage2.Username(driver).clear();
		GoToLoginPage2.Username(driver).sendKeys("engg@continuum.net");
		GoToLoginPage2.Password(driver).clear();
		GoToLoginPage2.Password(driver).sendKeys("Abc@1234");
		GoToLoginPage2.LogIn(driver).click();
		GoToAdminPage3.AdminTab(driver).click();
		GoToWebrootLicenseManagementPage4.ProductsServicesTab(driver).click();
		GoToWebrootLicenseManagementPage4.WebrootLicenseManagement(driver).click();
		GoToWebrootLicenseManagementPage4.SwitchIntoFramesToAccessWebrootLicenseManagementPage(driver);
		GoToWebrootLicenseManagementPage4.PlacingARequestForAccessWebrootviaAPI(driver);
		Thread.sleep(60000);
		GoToWebrootLicenseManagementPage4.CheckAlert_AccessWebrootviaAPIrequesthasalreadybeendone(driver);
		Assert.assertEquals("Access Webroot via API request has already been done", "Access Webroot via API request has already been done");

	}

	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
}
