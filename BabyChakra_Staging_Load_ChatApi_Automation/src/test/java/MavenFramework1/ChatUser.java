package MavenFramework1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
//import MavenFramework1.PayLoad;
//import MavenFramework1.Resources;
//import MavenFramework1.ReusableMethods;
import static io.restassured.RestAssured.given;
//import static org.hamrest.Machers.equalTo;
//import static org.hamcrest.Matchers.*;

//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
//import java.util.Properties;

//import org.json.simple.JSONObject;
//import io.restassured.path.json.JsonPath;ß

import io.restassured.RestAssured;
//import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ChatUser {

	//Properties prop = new Properties();
	
	int i;
	int j;
	int k;
	
	@BeforeClass
	public void ChatUserLoad() throws IOException
	{
		//Properties prop = new Properties();
//		FileInputStream fis = new FileInputStream("/Users/avik/eclipse-workspace/BabyChakra API Automaton/src/Files/Environment.properties");
//	    prop.load(fis);
	}
	
	
	@Test(priority=0)
	public void ChatUserRegistrationHindiFemale() throws NullPointerException
	{

//		 public static void main(String[] args) {
		
		    //RestAssured.baseURI = prop.getProperty("Host");
			RestAssured.baseURI = "http://releaseapi.babychakra.com";

		for(i=150161;i<150166;i++)
		{

		Response res = given().
			
				//queryParam("UserId",i).
				
		//Particular User
			   header("User ID","88236").
		       header("Authorization","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOjg4MjM2LCJpc3MiOiJodHRwOi8vcmVsZWFzZS5iYWJ5Y2hha3JhLmNvbSIsImlhdCI6MTU1NzM5Mjg3NiwiZXhwIjoxNTc4OTkyODc2LCJuYmYiOjE1NTczOTI4NzYsImp0aSI6InoyUUN3bTZRRm9jeGJaTDEifQ.1BrTWs7nV15oo77HeSP4-Z3G0kuNLtkzalFBGZyG_4Y").
		       
		//Global User
//		       header("app-identifier","android_consumer").
//		       header("app-version","2.9.3.1").
//		       header("app-signature","app_signature_2_1_5_4").
//		       header("appuid","20403").
		       
//		       body(PayLoad.ChatUser()).
		       
		       
	    when(). 
	    
	           //post(Resources.ChatUser()).
	           post("/firebase/register_user/"+i).
	           
	    then().log().all().assertThat().statusCode(200).and().

	       extract().response();

		}
	       
	}
	
   
	
	@Test(priority=2)
	public void AddToLanguageHindiFemale() throws NullPointerException
	{

//		 public static void main(String[] args) {
		
		//RestAssured.baseURI = prop.getProperty("Host");
		RestAssured.baseURI = "http://releaseapi.babychakra.com";
		 

		for(j=150161;j<150166;j++)
		{

		Response res = given().
				
				queryParam("gender","2").
				queryParam("language","hi").
				
		//Particular User
//			   header("User ID",prop.getProperty("ExistingUserID")).
//		       header("Authorization",prop.getProperty("ExistingUserAuthToken")).
		       
		       header("User ID","88236").
		       header("Authorization","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOjg4MjM2LCJpc3MiOiJodHRwOi8vcmVsZWFzZS5iYWJ5Y2hha3JhLmNvbSIsImlhdCI6MTUzNTM2ODEwOSwiZXhwIjoxNTU2OTY4MTA5LCJuYmYiOjE1MzUzNjgxMDksImp0aSI6IlhQQmtHZDlUZjJWV3U4cDYifQ.2FLWF9knLbE8_tXYUYCKFKjH1VMxFMpcYp0IEJhB488").
		       
		       
	    when().
	    
	           //post(Resources.ChatUser()).
	           post("/firebase/add_to_language_group/"+j).
	           
	    then().log().all().assertThat().and().

	       extract().response();

		}
	       
	} 
	
	

	@Test(priority=4)
	public void AddToMonthHindiFemale() throws NullPointerException
	{ 

//		 public static void main(String[] args) {
		
		//RestAssured.baseURI = prop.getProperty("Host");
		RestAssured.baseURI = "http://releaseapi.babychakra.com"; 
		

		for(k=150161;k<150166;k++)
		{

		Response res = given().
				
				queryParam("birth-date","2018-07-01").

		//Particular User
//			   header("User ID",prop.getProperty("ExistingUserID")).
//		       header("Authorization",prop.getProperty("ExistingUserAuthToken")).
		       
		       header("User ID","88236").
		       header("Authorization","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOjg4MjM2LCJpc3MiOiJodHRwOi8vcmVsZWFzZS5iYWJ5Y2hha3JhLmNvbSIsImlhdCI6MTUzNTM2ODEwOSwiZXhwIjoxNTU2OTY4MTA5LCJuYmYiOjE1MzUzNjgxMDksImp0aSI6IlhQQmtHZDlUZjJWV3U4cDYifQ.2FLWF9knLbE8_tXYUYCKFKjH1VMxFMpcYp0IEJhB488").
		       
		       
	    when().
	    
	           //post(Resources.ChatUser()).
	           post("/firebase/add_to_month_group/"+k).
	           
	    then().log().all().assertThat().and().

	       extract().response();

		}
	       
	}
	
	@Test(priority=1)
	public void ChatUserRegistrationEnglishMale() throws NullPointerException
	{

//		 public static void main(String[] args) {
		
		    //RestAssured.baseURI = prop.getProperty("Host");
			RestAssured.baseURI = "http://releaseapi.babychakra.com";

		for(i=150166;i<150171;i++)
		{

		Response res = given().
			
				//queryParam("UserId",i).
				
		//Particular User
			   header("User ID","88236").
		       header("Authorization","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOjg4MjM2LCJpc3MiOiJodHRwOi8vcmVsZWFzZS5iYWJ5Y2hha3JhLmNvbSIsImlhdCI6MTUzNTM2ODEwOSwiZXhwIjoxNTU2OTY4MTA5LCJuYmYiOjE1MzUzNjgxMDksImp0aSI6IlhQQmtHZDlUZjJWV3U4cDYifQ.2FLWF9knLbE8_tXYUYCKFKjH1VMxFMpcYp0IEJhB488").
		       
		//Global User
//		       header("app-identifier","android_consumer").
//		       header("app-version","2.9.3.1").
//		       header("app-signature","app_signature_2_1_5_4").
//		       header("appuid","20403").
		       
//		       body(PayLoad.ChatUser()).
		       
		       
	    when().
	    
	           //post(Resources.ChatUser()).
	           post("/firebase/register_user/"+i).
	           
	    then().log().all().assertThat().statusCode(200).and().

	       extract().response();

		}
	       
	}
	
  
	
	@Test(priority=3)
	public void AddToLanguageEnglishMale() throws NullPointerException
	{

//		 public static void main(String[] args) {
		
		//RestAssured.baseURI = prop.getProperty("Host");
		RestAssured.baseURI = "http://releaseapi.babychakra.com";
		 

		for(j=150166;j<150171;j++)
		{

		Response res = given().
				
				queryParam("gender","1").
				queryParam("language","en").
				
		//Particular User
//			   header("User ID",prop.getProperty("ExistingUserID")).
//		       header("Authorization",prop.getProperty("ExistingUserAuthToken")).
		       
		       header("User ID","88236").
		       header("Authorization","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOjg4MjM2LCJpc3MiOiJodHRwOi8vcmVsZWFzZS5iYWJ5Y2hha3JhLmNvbSIsImlhdCI6MTUzNTM2ODEwOSwiZXhwIjoxNTU2OTY4MTA5LCJuYmYiOjE1MzUzNjgxMDksImp0aSI6IlhQQmtHZDlUZjJWV3U4cDYifQ.2FLWF9knLbE8_tXYUYCKFKjH1VMxFMpcYp0IEJhB488").
		       
		       
	    when().
	    
	           //post(Resources.ChatUser()).
	           post("/firebase/add_to_language_group/"+j).
	           
	    then().log().all().assertThat().and().

	       extract().response();

		}
	       
	} 
	

	@Test(priority=5)
	public void AddToMonthEnglishMale() throws NullPointerException
	{ 

//		 public static void main(String[] args) {
		
		//RestAssured.baseURI = prop.getProperty("Host");
		RestAssured.baseURI = "http://releaseapi.babychakra.com"; 
		

		for(k=150166;k<150171;k++)
		{

		Response res = given().
				
				queryParam("birth-date","2018-12-10").

		//Particular User
//			   header("User ID",prop.getProperty("ExistingUserID")).
//		       header("Authorization",prop.getProperty("ExistingUserAuthToken")).
		       
		       header("User ID","88236").
		       header("Authorization","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOjg4MjM2LCJpc3MiOiJodHRwOi8vcmVsZWFzZS5iYWJ5Y2hha3JhLmNvbSIsImlhdCI6MTUzNTM2ODEwOSwiZXhwIjoxNTU2OTY4MTA5LCJuYmYiOjE1MzUzNjgxMDksImp0aSI6IlhQQmtHZDlUZjJWV3U4cDYifQ.2FLWF9knLbE8_tXYUYCKFKjH1VMxFMpcYp0IEJhB488").
		       
		       
	    when().
	    
	           //post(Resources.ChatUser()).
	           post("/firebase/add_to_month_group/"+k).
	           
	    then().log().all().assertThat().and().

	       extract().response();

		}
	       
	}
	
	
	
}

