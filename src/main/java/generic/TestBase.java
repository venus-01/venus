package generic;


import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import configreader.ConfigReader;
import configreader.PropertyFileReader;
import configuration.BrowserType;
import configuration.ChromeBrowser;
import configuration.EdgeBrowser;

public class TestBase {
	
	private final Logger log = LoggerHelper.getLogger(TestBase.class);

	public  WebDriver driver;
	ConfigReader reader = new PropertyFileReader();

	public WebDriver getBrowserObject(BrowserType bType) {

		switch (bType) {

		case Chrome:
			ChromeBrowser chrome = new ChromeBrowser();
			return chrome.getChromeBrowser(chrome.getChromeOptions());
		case Edge:
			EdgeBrowser edge = new EdgeBrowser();
			return edge.getEdgeBrowser(edge.getEdgeOptions());
		default:
			throw new RuntimeException("Driver Not Found " + bType);
		}

	}
	
	@BeforeMethod
	public void setUp() {
		log.info("Open The Chrome Browser");
		driver=getBrowserObject(reader.getBrowser());
		driver.get(reader.getUrl());
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	

	public static void main(String[] args) {
		ConfigReader reader = new PropertyFileReader();
		System.out.println(reader.getUrl());

		TestBase base = new TestBase();
		base.driver = base.getBrowserObject(reader.getBrowser());

	}

}
