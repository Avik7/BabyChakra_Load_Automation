package MavenFramework1;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ReusableMethods {
	
public static  String rawToString(Response res)
	
	{
		
		String responseString= res.asString();
		return responseString;

		
	}
	
	public static  JsonPath rawToJson(Response res)
	
	{
		
		String responseString= res.asString();
		JsonPath js = new JsonPath(responseString);
		return js;
		
	}
	

}
