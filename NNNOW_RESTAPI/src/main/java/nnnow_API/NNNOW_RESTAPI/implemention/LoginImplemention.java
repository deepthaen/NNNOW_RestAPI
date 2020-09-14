package nnnow_API.NNNOW_RESTAPI.implemention;

import java.util.HashMap;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import nnnow_API.NNNOW_RESTAPI.Utils.PropertyUtils;
import nnnow_API.NNNOW_RESTAPI.Utils.RestUtils;
import nnnow_API.NNNOW_RESTAPI.constants.Constant;
import nnnow_API.NNNOW_RESTAPI.constants.Endpoints;
import nnnow_API.NNNOW_RESTAPI.controllers.RestController;
import nnnow_API.NNNOW_RESTAPI.helpers.RestMethods;
import nnnow_API.NNNOW_RESTAPI.pojos.userExists.LoginPojos;
import nnnow_API.NNNOW_RESTAPI.pojos.userExists.UserDetails;

public class LoginImplemention implements RestController {
	
	static RequestSpecification req;
	
	

	public String getUrl() {
		String url = Constant.baseURI()+Endpoints.USER_EXISTS;
		return url;
		
	}

	public HashMap<String, String> headers() {
		HashMap<String, String> head = new HashMap<String, String>();
		head.put("X-Tenant-ID", "5f9d336a-eedb-4fa4-b408-cf38cefc96e0");
		head.put("Content-Type", "application/json");
		head.put("accept", "application/json");
		head.put("module", "odin");
		return head;
	}

	public String reqBody() {
		
		LoginPojos lp = new LoginPojos();
		lp.setEmailId("null");
		
		UserDetails ud = new UserDetails();
		ud.setMobileNumber(Constant.mobileNumber());
		ud.setCountryCallingCode("+91");
		lp.setMobileNumber(ud);
		String reqStringVal = RestUtils.objectTo_String(lp);
		System.out.println(reqStringVal);
		return reqStringVal;
	}

	public String response(Response response) {
		String res = response.asString();
		System.out.println(res);
		return res;
	}

	public int statuscodes(Response response) {
		int code = response.getStatusCode();
		System.out.println(code);
		return code;
	}



	public Response senRequest() {
	 Response response = RestMethods.post(getUrl(),headers(), reqBody() );
		return response;
	}

	
	}

