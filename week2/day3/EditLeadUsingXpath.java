package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLeadUsingXpath {
	
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
	
	public void createLead() throws InterruptedException {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("Test Leaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Bavithra");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Duraisamy");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Bavi");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("CSE");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Senior Quality Analyst");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("bavithra.arvind@gmail.com");
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateValue = new Select(state);
		stateValue.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(1000);
	}
	
	public void editLead() throws InterruptedException {
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[1]")).click();
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).clear();
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Sample Description");
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(1000);
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
	}
	
	public void quitBrowser() {
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		EditLeadUsingXpath editLead = new EditLeadUsingXpath();
		editLead.launchBrowser();
		editLead.createLead();
		editLead.editLead();
		//editLead.quitBrowser();

	}

}
