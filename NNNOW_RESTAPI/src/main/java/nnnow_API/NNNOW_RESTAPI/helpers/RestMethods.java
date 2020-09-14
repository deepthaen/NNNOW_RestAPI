package nnnow_API.NNNOW_RESTAPI.helpers;
import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.json.JSONObject;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestMethods {
	static RequestSpecification req;
	static Response response;
	
	public RestMethods() {
		if(req == null) {
			req = construct();
		}
	}
	

	
	public static RequestSpecification construct() {
		RequestSpecification req = given().relaxedHTTPSValidation();
		return req;
	}
	
	public static RequestSpecification when() {
		req= req.when();
		return req;
	}
	
	public static RequestSpecification with() {
		req =  req.with();
		return req;
	}
	
	public static RequestSpecification basic(String user,String pass) {
		 req = req.auth().basic(user, pass);
		return req;
	}
	
	
	
	
	public static Response get(String url, HashMap<String, String> params) {
		req = construct();
		response = req.queryParams(params).get(url);
		return response;
			
	}
	
	public static Response post(String url, HashMap<String, String> params, HashMap<String, String> header, String body) {
		req = construct().queryParams(params).headers(header).body(body);
		
		response = req.post(url);
		return response;
	}
	
	public static Response post(String url, HashMap<String, String> header, String body) {
		req = construct().headers(header).body(body);
		
		response = req.post(url);
		return response;
	}
	
	public static Response put(String url, HashMap<String, String> params, HashMap<String, String> header, String body) {
		req = construct().queryParams(params).headers(header).body(body);
		response = req.put(url);
		return response;
	}
	
	public static int getStatusCode() {
		int code = response.getStatusCode();
		System.out.println(code);
		return code;
	}
	
	public static String statusResponse() {
		String res = response.asString();
		System.out.println(res);
		return res;
	}
	
	
	
	
}
