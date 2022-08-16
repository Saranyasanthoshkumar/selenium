package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


	public class CreateLead {

		public static void main(String[] args) {

			// Launch URL
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps");

			// MAXIMIZE THE WINDOW
			driver.manage().window().maximize();

			// Enter UserName and Password Using Id Locator
			WebElement elementUserName = driver.findElement(By.id("username"));
			elementUserName.sendKeys("Demosalesmanager");

			WebElement elementPassword = driver.findElement(By.id("password"));
			elementPassword.sendKeys("crmsfa");

			// Click on Login Button using Class Locator
			WebElement elementLoginButton = driver.findElement(By.className("decorativeSubmit"));
			elementLoginButton.click();

			// to Click on CRM/SFA Link
			WebElement elementCrmSfa = driver.findElement(By.linkText("CRM/SFA"));
			elementCrmSfa.click();

			// to Click on Leads Button
			WebElement elementLead = driver.findElement(By.linkText("Leads"));
			elementLead.click();

			// to Click on Create Lead
			WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
			elementCreateLead.click();

			// to Enter CompanyName Field Using id Locator
			WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
			elementCompanyName.sendKeys("aaa");

			// Enter FirstName Field Using id Locator 
			WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
			elementFirstName.sendKeys("saranya");

			// Enter LastName Field Using id Locator
			WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
			elementLastName.sendKeys("Santhosh kumar");

			// Enter FirstName(Local) Field Using id Locator
			WebElement elementFirstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
			elementFirstNameLocal.sendKeys("saran");

			// Enter Department Field Using any Locator 
			WebElement elementDepartment = driver.findElement(By.name("departmentName"));
			elementDepartment.sendKeys("Testing");

			// Enter Description Field Using any Locator 
			WebElement elementDescription = driver.findElement(By.id("createLeadForm_description"));
			elementDescription.sendKeys("CREATE LEAD FOR SARANYA");

			// Enter email in the E-mail address Field 
			WebElement elementEmailAddress = driver.findElement(By.id("createLeadForm_primaryEmail"));
			elementEmailAddress.sendKeys("saranyarajadayalan@gmail.com");

			// Select State/Province as NewYork Using Visible Text
			WebElement elementStateProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			Select StateProvinceDD = new Select(elementStateProvince);
			StateProvinceDD.selectByVisibleText("New York");

			// to Click on Create Button
			WebElement elementCreateButton = driver.findElement(By.className("smallSubmit"));
			elementCreateButton.click();

			// Get the Title of Resulting Page
			System.out.println("Title of Resulting Page:" + driver.getTitle());
		}

	}
