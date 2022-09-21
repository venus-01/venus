package configuration;

import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowser {
	
	private WebDriver driver;
	
	public WebDriver getChromeBrowser(ChromeOptions options) {
		String key="webdriver.chrome.driver";
		String value="F:\\Softwares\\drivers\\chromedriver.exe";
		System.setProperty(key, value);
		driver=new ChromeDriver(options);
		return driver;
	}
	
	public ChromeOptions getChromeOptions() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--disable-infobars");
		options.addArguments("incognito");
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		return options;
	}
}
