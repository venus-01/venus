package generic;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerHelper {
	

	private static boolean root=false;
	
	public static Logger getLogger(Class cls) {
		if(root) {
			return LogManager.getLogger(cls);
		}
		root=true;
		return LogManager.getLogger(cls);
	}
}
