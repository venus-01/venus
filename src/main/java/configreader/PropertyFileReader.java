package configreader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import configuration.BrowserType;

public class PropertyFileReader implements ConfigReader {
	
	private Properties pop;
	private FileInputStream f;
	
	public PropertyFileReader() {
		try {
			f=new FileInputStream("./src/main/resources/config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		pop=new Properties();
		try {
			pop.load(f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getUrl() {
		return pop.getProperty("url");
	}
	
	public String getUserName() {
		return pop.getProperty("userName");
	}
	
	public String getPassword() {
		return pop.getProperty("password");
	}
	
	public int getImplicitWait() {
		return Integer.parseInt(pop.getProperty("implicitwait"));
	}
	
	public int getExplicitWait() {
		return Integer.parseInt(pop.getProperty("explicitwait"));
	}
	
	public BrowserType getBrowser() {
		return BrowserType.valueOf(pop.getProperty("browser"));
	}
}
