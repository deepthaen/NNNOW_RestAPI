package nnnow_API.NNNOW_RESTAPI.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import nnnow_API.NNNOW_RESTAPI.constants.Constant;

public class PropertyUtils {
	
	public static String getProperty(String key) {
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(Constant.PROPERTY_PATH));
			String propValue = prop.getProperty(key);
			return propValue;
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	

}
