package nnnow_API.NNNOW_RESTAPI.Utils;

import org.json.JSONObject;

import com.google.gson.Gson;

public class RestUtils {
	
	
	public static String objectTo_String(Object obj) {
		Gson gson = new Gson();
		String reqString = gson.toJson(obj);
		return reqString;
	}

	public static JSONObject string_ToObject(String res) {
		JSONObject json = new JSONObject(res);
		return json;
	}
	
}
