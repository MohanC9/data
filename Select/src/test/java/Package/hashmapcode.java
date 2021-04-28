package Package;


import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hashmapcode {
		
		 
	public static void main(String[] args) throws Exception {

		 
		  HashMap<String ,String > hm = new HashMap<String,String>();
		  hm.put("rameshadepu", "ramesh");
		  hm.put("sandeepj","sandeep");
		  hm.put("saireddy", "saireddy");
		  
	        for (String username : hm.keySet()) {
		  WebDriverManager.chromedriver().setup();
		    WebDriver    driver=new ChromeDriver();
            driver.get("https://adactinhotelapp.com/");
           WebElement usr= driver.findElement(By.name("username"));
           usr.sendKeys(username);
            System.out.println(username);
            
           WebElement pswd = driver.findElement(By.name("password"));
            pswd.sendKeys(hm.get(username));
            System.out.println(hm.get(username));
            
            driver.findElement(By.name("login")).click();
            driver.close();
	        }
	}
}
