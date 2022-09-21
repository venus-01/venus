package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.ElementControl;
import generic.TestBase;

public class LoginPage extends TestBase {
	
	ElementControl elementControl=new ElementControl();
	
	@FindBy(id="username")
	private WebElement txtUserName;
	
	@FindBy(name="pwd")
	private WebElement txtPassword;
	
	@FindBy(xpath="//a[@id='loginButton']/div")
	private WebElement loginBtn;
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String userName ) {
		elementControl.type(txtUserName, userName);
	}
	
	public void enterPassword(String password) {
		elementControl.type(txtPassword, password);
	}
	
	public void clickOnLoginBtn() {
		elementControl.clickElement(loginBtn);
	}	
	
}
