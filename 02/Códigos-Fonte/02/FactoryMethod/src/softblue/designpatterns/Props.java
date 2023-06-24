package softblue.designpatterns;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Props {

	private static Properties props;
	
	static {
		props = new Properties();
		
		try (InputStream in = new FileInputStream("config.properties")) {
			props.load(in);
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String getString(String property) {
		return props.getProperty(property);
	}
	
	public static int getInt(String property, int defaultValue) {
		String value = getString(property);
		
		try {
			return Integer.parseInt(value);
		} catch (NumberFormatException e) {
			return defaultValue;
		}
	}
}
