package marathon.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BookTicket {
	static ChromeDriver driver = new ChromeDriver();

	public void bookTicket() throws InterruptedException {

		driver.manage().window().maximize();
		driver.get("https://www.pvrcinemas.com/");
		Thread.sleep(5000);
		String currentLocation = driver.findElement(By.xpath("(//span[@class='cities-placed'])[2]")).getText();
		System.out.println(currentLocation);
		if (currentLocation.equalsIgnoreCase("Chennai")) {
			selectMovie();

		} else {
			driver.findElement(By.xpath("(//span[@class='cities-placed'])[2]")).click();
			driver.findElement(By.xpath(
					"//img[@src='https://originserver-static1-uat.pvrcinemas.com/pvrcms/cities/Chennai_56598_vnWADRZF.png']/following-sibling::div[1]"))
					.click();
			selectMovie();
		}

	}

	public void selectMovie() throws InterruptedException {
		waitTime(2000);
		driver.findElement(By.className("cinemas-inactive")).click();
		waitTime(2000);
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		driver.findElement(By.xpath("//ul[@class='p-dropdown-items']/li[1]")).click();
		waitTime(2000);
		driver.findElement(By.xpath("//ul[@class='p-dropdown-items']/li[1]")).click();
		waitTime(2000);
		driver.findElement(By.xpath("//ul[@class='p-dropdown-items']/li[1]")).click();
		waitTime(2000);
		driver.findElement(By.xpath("//ul[@class='p-dropdown-items']/li[1]")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		waitTime(2000);
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		waitTime(2000);
		driver.findElement(By.xpath("(//span[@class='seat-current-pvr'])[5]")).click();
		waitTime(2000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		waitTime(2000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		String pageTitle = driver.getTitle();
		System.out.println("Current page title is: " + pageTitle);
		driver.close();
	}

	public void waitTime(int time) throws InterruptedException {
		Thread.sleep(time);
	}
	public static void main(String[] args) throws InterruptedException {
		BookTicket book = new BookTicket();
		book.bookTicket();

	}

}
