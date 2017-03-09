package Senarios_Cases1;
import PagesToExplore.GoToWebSitePage1;
import PagesToExplore.GoToLoginPage2;
import PagesToExplore.GoToAdminPage3;
import PagesToExplore.GoToWebrootLicenseManagementPage4;
import PagesToExplore.GoTORMMSetupTab5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyAllLinksOnWLMpage 
{
	static WebDriver driver ;

	@BeforeClass
	public void openBrowser()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test (priority = 0 , enabled = false)
	public void TC1_ClickOnLaunchWebrootConsole()
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
		driver.findElement(By.xpath(".//*[@id='divDetls']/table/tbody/tr/td/table[2]/tbody/tr[1]/td/table/tbody/tr/td[1]/input")).click();
	}

	@Test (priority = 1)
	public void TC2_ClickOnExportToExcel()
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
		try 
		{
			driver.findElement(By.xpath(".//*[@id='divDetls']/table/tbody/tr/td/table[2]/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
		} 
		catch (WebDriverException e) 
		{
			e.printStackTrace();
		}
		driver.findElement(By.xpath(".//*[@id='divDetls']/table/tbody/tr/td/table[2]/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
	}

	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
}
