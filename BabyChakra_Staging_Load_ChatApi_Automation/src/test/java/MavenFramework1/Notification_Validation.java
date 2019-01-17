package MavenFramework1;

import static io.restassured.RestAssured.given;
//import static org.hamrest.Machers.equalTo;
//import static org.hamcrest.Matchers.*;
//import static org.hamcrest.Matchers.equalTo;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
//import java.util.Collections;
import java.util.Properties;

//import org.json.simple.JSONObject;
//import io.restassured.path.json.JsonPath;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//import MavenFramework1.Resources;
import MavenFramework1.ReusableMethods;

public class Notification_Validation {

	Properties prop = new Properties();
	
	@BeforeClass
	public void UserTagAutoCompleteLoad() throws IOException
	{
		//Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("/var/lib/jenkins/workspace/Staging_Load_ChatAPI/BabyChakra_Staging_Load_ChatApi_Automation/src/main/java/MavenFramework1/Environment.properties");
	    prop.load(fis);
	}
	@Test
	public void UserTagAutoCompleteTest() throws NullPointerException
	{

//		 public static void main(String[] args) {

		
		RestAssured.baseURI = prop.getProperty("Host");
//		String id = prop.getProperty("UserID");
//		int i = Integer.parseInt(id); 
		
		Response res = given().
		
		//Particular User
			  
			   header("User ID",prop.getProperty("ExistingUserID")).
		       header("Authorization",prop.getProperty("ExistingUserAuthToken")).
		       	      
		       log().all().
		       
	    when().
	    
	           get("/v1/notifications").
	           
	    then().log().all().assertThat().statusCode(200).and().

	    //header("server","nginx/1.4.6 (Ubuntu)").
	    extract().response();
		
		
		JsonPath js = ReusableMethods.rawToJson(res);
       
    // For Print All User Name related to Tagging
       int count = js.get("notifications.size()");
       System.out.println(count);
       int i;
       System.out.println("\n Print All Notification: \n");

       for (i=0;i<count;i++)
        {    
	        System.out.println("\n Notification ["+i+"] ID: "+ js.get("notifications["+i+"].notification_id"));
	        System.out.println("\n Notification ["+i+"] Type: "+ js.get("notifications["+i+"].notification_type"));
	        System.out.println("\n Notification ["+i+"] Title: "+ js.get("notifications["+i+"].notification_title"));
	        System.out.println("\n");
	
        }
       	   
	}


}
