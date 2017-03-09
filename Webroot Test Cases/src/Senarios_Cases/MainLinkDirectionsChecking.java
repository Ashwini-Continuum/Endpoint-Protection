package Senarios_Cases;
import PagesToExplore.GoToWebSitePage1;
import PagesToExplore.GoToLoginPage2;
import PagesToExplore.GoToAdminPage3;
import PagesToExplore.GoToWebrootLicenseManagementPage4;
import PagesToExplore.GoTORMMSetupTab5;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MainLinkDirectionsChecking 
{

	static WebDriver driver ;

	@BeforeClass
	public void openBrowser()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test(priority = 0 )
	public static void TC1_CheckRedirectionToWebrootLicenseManagementPage()
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
		System.out.println("Succesfully Visit Webroot License ManagementPage ");
	}
	
	@Test (priority = 1 )
	public static void TC2_CheckRedirectionToRMMSetupPage()
	{
		GoToWebSitePage1.OpenWeb(driver);
		GoToLoginPage2.Username(driver).clear();
		GoToLoginPage2.Username(driver).sendKeys("engg@continuum.net");
		GoToLoginPage2.Password(driver).clear();
		GoToLoginPage2.Password(driver).sendKeys("Abc@1234");
		GoToLoginPage2.LogIn(driver).click();
		GoTORMMSetupTab5.RMMSetupTab(driver).click();
		System.out.println("Succesfully Visit RMM Setup Page ");
	}

	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
}
