package week4day1assign;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class WindowHandling {
	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml");
		driver.manage().window().maximize();

	    //to click and conform the window open
		Thread.sleep(3000);
		String title1 = driver.getTitle();
		System.out.println("The Page Title:" + title1);
        driver.findElement(By.xpath("//span[text()='Open']")).click();

        String windowHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> list = new ArrayList<String>(windowHandles);
        driver.switchTo().window(list.get(1));

        driver.switchTo().window(list.get(0));
        String title2= driver.getTitle();
        System.out.println("The Page Title:" + title2);

        if (title1.equals(title2)) {
	    System.out.println("You are not on new window");
        } else
	    System.out.println("New Window Opened");

       //to find the number of open windows
        Thread.sleep(3000);

       driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
       Set<String> windowNumberOfOpenTabs = driver.getWindowHandles();
       List<String> listOfOpenTabs = new ArrayList<String>(windowNumberOfOpenTabs);
       int count = listOfOpenTabs.size();
       System.out.println("Number of opened tabs:" + count);
       driver.switchTo().window(listOfOpenTabs.get(0));


       //close all except primary window

       Thread.sleep(3000);
       driver.findElement(By.xpath("//span[text()='Close Windows']")).click();

       String mainWindow1 = driver.getWindowHandle();
       Set<String> windowClose = driver.getWindowHandles();

       List<String> listClose = new ArrayList<String>(windowClose);

       int count1 = listClose.size();
       for (int i = 0; i < count1; i++) {
	   if (!(listClose.get(i).equals(mainWindow1))) {
		driver.switchTo().window(listClose.get(i));
		Thread.sleep(1000);
		driver.close();
	}
}
        driver.switchTo().window(listClose.get(0));

        //Wait for 2 new tabs to open

		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));
	
		Set<String> windowDelay = driver.getWindowHandles();
		List<String> listDelay = new ArrayList<String>(windowDelay);
		int count2 = listDelay.size();
		System.out.println("Number of tabs opened :" + count2);
		
		Thread.sleep(2000);
		
		driver.quit();
}}