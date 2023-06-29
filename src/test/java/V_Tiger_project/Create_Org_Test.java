package V_Tiger_project;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Create_Org_Test {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		Random ran = new Random();
		int r= ran.nextInt(1000);
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id=\"submitButton\"]")).click();
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[1]")).sendKeys("Maximum"+r);
		//driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("(//select[@class='small'])[2]"));
		ele.click();
		Select sel = new Select(ele);
		sel.selectByIndex(3);
		Thread.sleep(3000);
	/*	
		String orgtext = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		if(orgtext.contains("Maximum")) {
			System.out.println("This Test Case is Pass");
		}
		else {
			System.out.println("This Test Case is Fail");
		}
		//driver.findElement(By.xpath("//select[@name='industry']")).click();
		
		WebElement img = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions act = new Actions(driver);
		act.moveToElement(img).perform();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		driver.quit();
		
		WebElement ele = driver.findElement(By.xpath("(//select[@class='small'])[2]"));
		ele.click();
		Select sel = new Select(ele);
		sel.selectByIndex(3);
		Thread.sleep(3000);*/
		
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		String orgtext = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		if(orgtext.contains("Maximum")) {
			System.out.println("This Test Case is Pass");
		}
		else {
			System.out.println("This Test Case is Fail");
		}
		WebElement img = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions act = new Actions(driver);
		act.moveToElement(img).perform();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		driver.quit();
		
		
	}

}
