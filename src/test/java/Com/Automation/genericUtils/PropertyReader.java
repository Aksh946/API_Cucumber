package Com.Automation.genericUtils;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReader {
static Properties prop = new Properties();
	
	public static void initProperty() 
	{
		try {
			prop.load(new FileInputStream("C:\\Users\\aksh.pundir\\eclipse-workspace\\API_Testing_Cucumber\\src\\test\\resources\\Config\\data.txt"));
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		public static String getProperty(String key)
		{
			return prop.getProperty(key);
		}

}
