package V_Tiger_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class First_Class {
	@Test(priority = 0)
	public void a (){
		
		WebDriver driver = new ChromeDriver();
		driver.get("https;//www.google.com");
		//driver.get("https://www.amazon.com");
	}
	@Test
	public void b () {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.get("https://www.instagram.com");
		driver.get("https://www.amazon.com");
		driver.get("https://www..google.com have u use this anywhere")
		
		
	}
}
