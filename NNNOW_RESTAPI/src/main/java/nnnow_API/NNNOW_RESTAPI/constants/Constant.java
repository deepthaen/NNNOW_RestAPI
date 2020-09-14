package nnnow_API.NNNOW_RESTAPI.constants;

import nnnow_API.NNNOW_RESTAPI.Utils.PropertyUtils;

public class Constant {
	
	public static final String PROPERTY_PATH = "./config.properties";
	public static final String  URL = "URL";
	public static final String MOBILE_NUMBER = "mobile_number";
	public static final String PASSWORD = "password";
	
	public static String baseURI() {
		String url = PropertyUtils.getProperty(URL);
		System.out.println("Base Url ::" +url);
		return url;	
	}
	
	public static String mobileNumber() {
		String mobNum = PropertyUtils.getProperty(MOBILE_NUMBER);
		System.out.println("Mobile Number ::" + mobNum);
		return mobNum;
	}
	
	public static String password() {
		String pass = PropertyUtils.getProperty(PASSWORD);
		return pass;
	}
	
	

}
