package suitecrm;

import static utilities.ConfigReader.getProperty;

import java.time.LocalDateTime;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.CreateTaskPage;
import pages.HomePage;
import pages.LoginPage;
import pages.TaskOverviewPage;

public class SuiteCRMTests extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	CreateTaskPage createTaskPage;
	TaskOverviewPage taskOverviewPage;

	@BeforeMethod
	public void createTaskInSuiteCRM1() {
		// navigate to page
		driver.get(getProperty("suitecrm.url"));
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		createTaskPage = new CreateTaskPage(driver);
		taskOverviewPage = new TaskOverviewPage(driver);
	}

	@Test
  public void createTaskInSuiteCRM2() {
	  loginPage.login(getProperty("siutecrm.username"), getProperty("suitecrm.password"));
	  homePage.createNewItem("Create Task");
	  createTaskPage.subject.sendKeys(getProperty("suitecrm.tasksubject"));
	  new Select(createTaskPage.status).selectByVisibleText(getProperty("suitecrm.taskstatus"));
	  createTaskPage.description.sendKeys(getProperty("suitecrm.description") +"-"+LocalDateTime.now());
	  createTaskPage.save.click();
}
}