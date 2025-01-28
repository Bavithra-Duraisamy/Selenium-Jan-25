package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {
	public void createLead() {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bavithra");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Duraisamy");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Ideas2IT");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Nurturebox");
		driver.findElement(By.name("submitButton")).click();
		driver.close();
		
		
	}

	public static void main(String[] args) {
		CreateLead newLead = new CreateLead();
		newLead.createLead();


	}

}
