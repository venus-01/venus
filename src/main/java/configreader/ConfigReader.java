package configreader;

import configuration.BrowserType;

public interface ConfigReader {
	
	public String getUserName();
	
	public String getPassword();
	
	public String getUrl();
	
	public int getImplicitWait();
	
	public int getExplicitWait();
	
	public BrowserType getBrowser();

}
