package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskOverviewPage extends CreateTaskPage {
	
//since all the elements are same we are extending other class to get everything from there
	public TaskOverviewPage(WebDriver driver) {
		super(driver);

	}

}
