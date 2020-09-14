package nnnow_API.NNNOW_RESTAPI.controllers;

import java.util.HashMap;

import io.restassured.response.Response;

public interface RestController {
	
	
    Response senRequest();
    String getUrl();
    HashMap<String, String> headers();
    String reqBody();
    String response(Response response);
    int statuscodes(Response response);
    
    
}
