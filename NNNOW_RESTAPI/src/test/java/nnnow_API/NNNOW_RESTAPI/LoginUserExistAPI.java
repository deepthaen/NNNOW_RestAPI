package nnnow_API.NNNOW_RESTAPI;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import nnnow_API.NNNOW_RESTAPI.Utils.RestUtils;
import nnnow_API.NNNOW_RESTAPI.constants.StatusCode;
import nnnow_API.NNNOW_RESTAPI.controllers.RestController;
import nnnow_API.NNNOW_RESTAPI.implemention.LoginImplemention;

public class LoginUserExistAPI {
	
	@Test
	public void userexist() {
		
		RestController li = new LoginImplemention();
		Response response = li.senRequest();
		if(li.statuscodes(response) == 200) {
			System.out.println("Success ::");
			String resBody = li.response(response);
			System.out.println(resBody);
			JSONObject resObj =  RestUtils.string_ToObject(resBody);
		    //JSONObject data = resObj.getJSONObject("message");
		    String msg = resObj.getString("message").toString();
		    System.out.println(msg);
		}
	}

}
