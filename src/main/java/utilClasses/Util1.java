package utilClasses;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Util1 {

	public static String getConfigData(String key) throws IOException {
		FileInputStream file = new FileInputStream("Configuration\\config.properties");
		Properties p = new Properties();
		p.load(file);
		return p.getProperty(key);
	}
}
