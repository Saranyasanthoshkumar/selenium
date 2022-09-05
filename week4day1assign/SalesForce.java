package week4day1assign;

import java.time.Duration;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");	
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");		
		driver.findElement(By.id("password")).sendKeys("Password#123");		
		driver.findElement(By.id("Login")).click();
		
		//click on learn more
		WebDriverWait  wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.titleContains("Home | Salesforce"));
		Thread.sleep(5000);		
		driver.findElement(By.xpath("//span[text()='Learn More']//parent::button")).click();
		
		//move to other window
		Set<String> windowHandles=driver.getWindowHandles();
		List<String> listWindows=new ArrayList<String>(windowHandles);		
		driver.switchTo().window(listWindows.get(1));
		
		//to click confirm
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		//to get title
		String title=driver.getTitle();
		System.out.println("The Page Title:"+title);
		
		//return
		driver.switchTo().window(listWindows.get(0));
		driver.quit();
        
		
		
}}

