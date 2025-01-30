package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
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
	public void deleteLead() throws InterruptedException {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[contains(text(), 'Phone')]")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("0000000000");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(3000);
		String firstLead = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		if(firstLead.isBlank()) {
			System.out.println("The first lead is not deleted");
		} else {
			System.out.println("The first lead is deleted successfully");
		}
		Thread.sleep(1000);
	}

	public static void main(String[] args) throws InterruptedException {
		DeleteLead delete = new DeleteLead();
		delete.launchBrowser();
		delete.deleteLead();

	}

}
