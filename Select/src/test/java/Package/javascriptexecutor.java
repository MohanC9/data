package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javascriptexecutor {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
	        driver.get("https://adactinhotelapp.com/");
	        driver.manage().window().maximize();
	        
	        WebElement username=driver.findElement(By.name("username"));
	        WebElement pwd=driver.findElement(By.name("password"));
	        WebElement login =driver.findElement(By.name("login"));
	        
	        //Casting WebDriver to JavaScriptExecutor
	        JavascriptExecutor js =(JavascriptExecutor)driver;
	        
	        //Send value to a text box
	        js.executeScript("arguments[0].value='rameshadepu'", username);
	        js.executeScript("arguments[0].value='ramesh'", pwd);
	        
	        //OR
	        js.executeScript("document.getElementById('username').value='rameshadepu';");
	        
	        //To click on WebElement
	        js.executeScript("arguments[0].click();", login);

	 /*

	        //Refresh Browser
	        js.executeScript("history.go(0)");
	        
	        // To get URL of CurrentPage
	        String url=js.executeScript("return document.URL;").toString();
	        System.out.println(url);
	        
	        //to Generate Alert
	        js.executeScript("alert('Ojas Innovative Technologies');");
	        Thread.sleep(3000);
	        
	        //to click Ok on alert popup message
	        js.executeScript("confirm('Ojas Innovative Technologies');");
	        
	        
	        //to get the x and y coordinates of a webelement
	        Location = mediawiki.getLocation();
	        Dimension size = mediawiki.getSize();
	        System.out.println(location);
	        System.out.println(size);	
	        
	        JavascriptExecutor js1 =(JavascriptExecutor)driver;
//	        js.executeScript("window.scrollBy(644, 2024)");
//	        Thread.sleep(3000);
	    //    js.executeScript("arguments[0].click();",mediawiki);
	        
	        
	        //To Get the Title of the webPage
	        String title=js1.executeScript("return document.title;").toString();
	        System.out.println(title);
	        System.out.println(driver.getTitle());
	        
	        js1.executeScript("arguments[0].value='rameshadepu'", username);
	        js1.executeScript("arguments[0].value='ramesh'",pwd); */
	}

}
