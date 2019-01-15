package MavenFramework1;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class Broken_Link_WebTest {
    

         @Test
         
         public static void Broken()
         
         {
        
        String homePage = "http://www.babychakra.com";
        String url = "";
        HttpURLConnection huc = null;
        int respCode = 200;
        
        System.setProperty("webdriver.chrome.driver", "/var/lib/jenkins/workspace/Production_Broken_Link/BabyChakra_Staging_Load_ChatApi_Automation/src/main/java/MavenFramework1/chromedriver.exe");
        //WebDriver driver = new SafariDriver();
        WebDriver driver = new ChromeDriver();
        
        //driver.manage().window().maximize();
        
        driver.get(homePage);
        
        List<WebElement> links = driver.findElements(By.tagName("a"));
        
        Iterator<WebElement> it = links.iterator();
        
        while(it.hasNext()){
            
            url = it.next().getAttribute("href");
            
            System.out.println(url);
        
            if(url == null || url.isEmpty())
            {
                System.out.println(url+"URL is either not configured for anchor tag or it is empty");
                continue;
            }
            
//            if(!url.startsWith(homePage))
//            {
//                System.out.println("URL belongs to another domain, skipping it.");
//                continue;
//            }
            
            try {
                huc = (HttpURLConnection)(new URL(null, url,new sun.net.www.protocol.https.Handler()).openConnection());
                
                //URL url = new URL(null, "https://redmine.xxx.cz/time_entries.xml", new sun.net.www.protocol.https.Handler());
                
                huc.setRequestMethod("HEAD");
                
                huc.connect();
                
                respCode = huc.getResponseCode();
                
                if(respCode >= 400){
                    System.out.println(url+" is a broken link");
                }
                else{
                    System.out.println(url+" is a valid link");
                }
                    
            } 
            
            catch (MalformedURLException e)
            {
             
                e.printStackTrace();
            } 
            
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        
        driver.quit();

    }
}