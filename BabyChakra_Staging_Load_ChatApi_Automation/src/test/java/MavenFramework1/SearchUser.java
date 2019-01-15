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

public class SearchUser {

	//Properties prop = new Properties();
	
	int i;
	
	@BeforeClass
	public void SearchUserLoad() throws IOException
	{
		//Properties prop = new Properties();
//		FileInputStream fis = new FileInputStream("/Users/avik/eclipse-workspace/BabyChakra API Automaton/src/Files/Environment.properties");
//	    prop.load(fis);
	}
	
	
	@Test(priority=0)
	public void SearchUser() throws NullPointerException
	{

//		 public static void main(String[] args) {
		
		    //RestAssured.baseURI = prop.getProperty("Host");
			RestAssured.baseURI = "https://api1.babychakra.com";

		for(i=1;i<2001;i++)
		{

		Response res = given().
			
				//queryParam("UserId",i).
				
		//Particular User
			   header("User ID","88236").
		       header("Authorization","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODIzNiIsImlzcyI6Imh0dHBzOi8vd3d3LmJhYnljaGFrcmEuY29tIiwiaWF0IjoxNTM1MzY4MDMyLCJleHAiOjE1NTY5NjgwMzIsIm5iZiI6MTUzNTM2ODAzMiwianRpIjoiRnVGblNiZ1JEd0tENkNMVyJ9.b4LvHxWXptbCjjhbzzoHC3AvxVpDP2J2NR1vZefINqg").

//		       body(PayLoad.ChatUser()).
		       
		       
	    when().
	    
	           //post(Resources.ChatUser()).
	           get("/search/v2/package_products").
	           
	    then().log().all().assertThat().statusCode(200).and().

	       extract().response();

		}
	       
	}
	
	
}

