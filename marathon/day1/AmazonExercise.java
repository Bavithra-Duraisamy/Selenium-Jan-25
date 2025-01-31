package marathon.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonExercise {
	static ChromeDriver driver = new ChromeDriver();
	public void chooseNewArrivals() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
		driver.findElement(By.xpath("(//div[@class='s-suggestion-container'])[1]")).click();
		String totalNumberOfIyems = driver.findElement(By.xpath("((//span[@class='rush-component'])[1]/div/h1/div/div/div/h2/span)[1]")).getText();
		System.out.println("Total number of items are: "+ totalNumberOfIyems);
		driver.findElement(By.xpath("(//li[@class='a-spacing-micro'])[4]/span/a/div/label/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@class='a-spacing-micro'])[5]/span/a/div/label/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='a-button-inner'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='a-popover-inner']/ul/li)[5]")).click();
		String bagName = driver.findElement(By.xpath("//h2[contains(@class,'a-size-base-plus a-spacing-none')]//span")).getText();
		System.out.println("First displayed bag name is: "+bagName);
		String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("Bag price is : "+ price);
		String currentPageTitle = driver.getTitle();
		System.out.println("Current page title is: "+ currentPageTitle);
		Thread.sleep(3000);
		driver.close();
				
	}

	public static void main(String[] args) throws InterruptedException {
		AmazonExercise arrivals = new AmazonExercise();
		arrivals.chooseNewArrivals();

	}

}
