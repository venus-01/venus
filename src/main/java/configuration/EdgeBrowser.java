package configuration;

import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class EdgeBrowser {
	
	private WebDriver driver;
	
	public WebDriver getEdgeBrowser(EdgeOptions options) {
		System.setProperty("webdriver.edge.driver", "F:\\Softwares\\drivers\\msedgedriver.exe");
		driver=new EdgeDriver(options);
		return driver;
		
	}
	
	public EdgeOptions getEdgeOptions() {
		EdgeOptions options=new EdgeOptions();
		options.addArguments("-inprivate");
		options.addArguments("start-maximized");
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		return options;
	}

}
