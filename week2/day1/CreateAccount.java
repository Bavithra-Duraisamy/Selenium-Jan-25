package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {
	public void createAccount() {
		int num = 1;
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.cssSelector("input#accountName")).sendKeys("Account name "+ num);
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.name("numberEmployees")).sendKeys("10");
		driver.findElement(By.name("officeSiteName")).sendKeys("LeafTaps");
		driver.findElement(By.className("smallSubmit")).click();
		do{
			num++;
			driver.findElement(By.cssSelector("input#accountName")).clear();
			driver.findElement(By.name("description")).clear();
			driver.findElement(By.name("numberEmployees")).clear();
			driver.findElement(By.name("officeSiteName")).clear();
			driver.findElement(By.cssSelector("input#accountName")).sendKeys("Account name "+ num);
			driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
			driver.findElement(By.name("numberEmployees")).sendKeys("10");
			driver.findElement(By.name("officeSiteName")).sendKeys("LeafTaps");
			driver.findElement(By.className("smallSubmit")).click();
		}
		while (driver.findElements(By.className("errorMessageHeader")).size() == 0);
		String pageTitle = driver.getTitle();
		if(pageTitle.equalsIgnoreCase("Account Details | opentaps CRM")) {
			System.out.println("The page title has been printed correctly!..");
		}
		driver.close();
		
	}

	public static void main(String[] args) {
		CreateAccount newAccount = new CreateAccount();
		newAccount.createAccount();

	}

}
