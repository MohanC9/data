package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class adactin {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/index.php");
		driver.findElement(By.id("username")).sendKeys("rameshadepu");
		driver.findElement(By.id("password")).sendKeys("ramesh");
		driver.findElement(By.id("login")).click();

		Select Location = new Select(driver.findElement(By.id("location")));
		Location.selectByValue("Paris");
		Select Hotel = new Select(driver.findElement(By.id("hotels")));
		Hotel.selectByValue("Hotel Sunshine");
		Select Room = new Select(driver.findElement(By.id("room_type")));
		Room.selectByValue("Super Deluxe");
		Select Number = new Select(driver.findElement(By.id("room_nos")));
		Number.selectByValue("1");
		Select C = new Select(driver.findElement(By.id("room_nos")));
		C.selectByValue("1");
		Select Availability = new Select(driver.findElement(By.id("adult_room")));
		Availability.selectByValue("2");

		driver.findElement(By.id("datepick_in")).sendKeys("19/04/2021");
		driver.findElement(By.id("datepick_out")).sendKeys("22/04/2021");
		Select no = new Select(driver.findElement(By.id("adult_room")));
		no.selectByValue("2");
		driver.findElement(By.id("Submit")).submit();
		 String n = driver.getTitle();
		 System.out.println(n);
		 driver.close();

	}

}
