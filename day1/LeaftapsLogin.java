package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeaftapsLogin {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
	// for entering username and password	
WebElement elementUsername=driver.findElement(By.id("username"));
elementUsername.sendKeys("Demosalesmanager");

WebElement elementPassword=driver.findElement(By.id("password"));
elementPassword.sendKeys("crmsfa");
//for clicking login
WebElement elementDecorative=driver.findElement(By.className("decorativeSubmit"));
elementDecorative.click();


WebElement elementWelcomeMessage=driver.findElement(By.tagName("h2"));
String text=elementWelcomeMessage.getText();
System.out.println(text);

//for clicking crmsfa
WebElement elementCRMSFA=driver.findElement(By.linkText("CRM/SFA"));
elementCRMSFA.click();

//for clicking on leads
WebElement elementLeads=driver.findElement(By.linkText("Leads"));
elementLeads.click();

//for clicking create lead in the web page
WebElement elementCreateLead=driver.findElement(By.linkText("Create Lead"));
elementCreateLead.click();

WebElement elementSourceDD=driver.findElement(By.id("createLeadForm_dataSourceId"));
Select dd=new Select(elementSourceDD);
dd.selectByIndex(2);
	}

}
