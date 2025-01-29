package week2.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import week2.day2.CreateAccount;

public class CreateAccount {
	int num = 1;
	static ChromeDriver driver = new ChromeDriver();

	//Launch the browser and load the leaftaps URL
	public void launchBrowser() {
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	//Select the industry type as computer software value as Employee
	public void selectIndustry() {
		WebElement industryType = driver.findElement(By.name("industryEnumId"));
		Select industry = new Select(industryType);
		industry.selectByValue("IND_SOFTWARE");
	}

	// Select ownership type as S-Corporation
	public void selectOwnership() {
		
		WebElement ownershipType = driver.findElement(By.name("ownershipEnumId"));
		Select ownership = new Select(ownershipType);
		ownership.selectByVisibleText("S-Corporation");
	}

	// Select source value as Employee
	public void selectSource() {
		
		WebElement sourceType = driver.findElement(By.id("dataSourceId"));
		Select source = new Select(sourceType);
		source.selectByValue("LEAD_EMPLOYEE");
	}

	// Select marketing campaign as eCommerce Site Internal Campaign
	public void selectMarketingCampaign() {
		
		WebElement marketingCampaign = driver.findElement(By.id("marketingCampaignId"));
		Select campaign = new Select(marketingCampaign);
		campaign.selectByIndex(6);
	}

	// Get Texas as state
	public void selectState() {
		
		WebElement stateValue = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select state = new Select(stateValue);
		state.selectByValue("TX");
	}

	// Change the account name is already exists
	public void createUniqueAccountName() {
		do {
			num++;
			driver.findElement(By.id("accountName")).clear();
			driver.findElement(By.name("description")).clear();
			driver.findElement(By.name("numberEmployees")).clear();
			driver.findElement(By.name("officeSiteName")).clear();
			driver.findElement(By.cssSelector("input#accountName")).sendKeys("Account name " + num);
			driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
			driver.findElement(By.className("smallSubmit")).click();
			//implicitWait(2);
		} while (driver.findElements(By.className("errorMessageHeader")).size() == 0 || driver.findElements(By.className("errorMessage")).size() == 0);
	}

	public void implicitWait(int time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	//Verify the Account name is created correctly
	public void verifyAccountName() {
		/*
		 * if
		 * (driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText().
		 * equalsIgnoreCase("Account name " + num)) {
		 * System.out.println("Account name is displayed correctly!.." +
		 * "Account name is: " + num); }
		 */
		System.out.println(driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText());
	}

	// Close the browser
	public void closeBrowser() {
		// Set implicit wait time for 10 seconds
		implicitWait(5);
		driver.close();
	}
	
	// Consolidated method which has all the above methods
	public void createAccount() {
		launchBrowser();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Account name " + num);
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		selectIndustry();
		selectOwnership();
		selectSource();
		selectMarketingCampaign();
		selectState();
		driver.findElement(By.className("smallSubmit")).click();
		createUniqueAccountName();
		//verifyAccountName();
		//closeBrowser();

	}

	public static void main(String[] args) {
		CreateAccount newAccount = new CreateAccount();
		newAccount.createAccount();

	}
}
