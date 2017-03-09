package Scenario_Cases2;
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

public class SecurityTestCasesPart1 
{

	static WebDriver driver ;

	@BeforeClass
	public void openBrowser()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void TC1_LoginAsManagerWithAdminRights()
	{
		GoToWebSitePage1.OpenWeb(driver);
		GoToLoginPage2.Username(driver).clear();
		GoToLoginPage2.Username(driver).sendKeys("Bilal.Khan1@continuum.net");
		GoToLoginPage2.Password(driver).clear();
		GoToLoginPage2.Password(driver).sendKeys("Abc@1234");
		GoToLoginPage2.LogIn(driver).click();
		GoTORMMSetupTab5.RMMSetupTab(driver).click();
		GoTORMMSetupTab5.CreateaNewRMMSite(driver);
	}
	
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
}
