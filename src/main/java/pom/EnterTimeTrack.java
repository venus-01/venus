package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.TestBase;

public class EnterTimeTrack extends TestBase {
	
	private WebDriver driver;
	
	@FindBy(xpath="//a[contains(@class,'username')]")
	private WebElement userProfileLink;
	
	public EnterTimeTrack(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 
	public String getTitle() {
		System.out.println(driver.getTitle());
		return driver.getTitle();	
	}
}
