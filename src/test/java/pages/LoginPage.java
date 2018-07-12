package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="user_name")
	public WebElement userName;
	
//	@FindBy(id="username_password")
	//we can write this way too.
	public WebElement username_password;
	
	@FindBy(id="bigbutton")
	public WebElement loginButton;
	
	// http://ec2-34-223-219-142.us-west-2.compute.amazonaws.com:1022/suitecrm
	
	public void login(String username, String password) {
		userName.sendKeys(username);
		username_password.sendKeys(password);
		loginButton.click();
	}

}
