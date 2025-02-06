package week3.day4;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import week3.day2.LearnRadioButtons;

public class LearnWindowHandles {
	// Initialize ChromeDriver
	static ChromeDriver driver = new ChromeDriver();
	String parentWindow = driver.getWindowHandle();
	
	public void windowHandles() {
		
		// Load the URL (http://leaftaps.com/opentaps/control/login)
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		// Add an implicit wait to ensure the webpage elements are fully loaded Requirements
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		// Enter the username and password.
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		// Click on the Login button. 
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// Click on the CRM/SFA link.
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		// Click on the Contacts button.
		driver.findElement(By.linkText("Contacts")).click();
		
		// Click on Merge Contacts. 
		driver.findElement(By.linkText("Merge Contacts")).click();
		
		// Click on the widget of the "From Contact". 
		driver.findElement(By.xpath("//input[@id='partyIdFrom']/following-sibling::a")).click();
		switchToChildWindow();
		
		// Click on the first resulting contact. 
		boolean firstFromElement = driver.findElement(By.xpath("(//table[contains(@class,'row-table')]/tbody/tr/td)[1]")).isDisplayed();
		if(firstFromElement) {
			driver.findElement(By.xpath("(//table[contains(@class,'row-table')]/tbody/tr/td)[1]")).click();
		} else {
			System.out.println("No rows are displayed!.. Kindly add some leads and try merge again!..");
		}
		verifyFocusOnParentWindow();
		
		// Click on the widget of the "To Contact". 
		driver.findElement(By.xpath("//input[@id='partyIdTo']/following-sibling::a")).click();
		switchToChildWindow();
		
		// Click on the second resulting contact.
		boolean secondToElement = driver.findElement(By.xpath("((//table[contains(@class,'row-table')]/tbody)[2])/tr[1]/td[1]")).isDisplayed();
		if(secondToElement) {
			driver.findElement(By.xpath("((//table[contains(@class,'row-table')]/tbody)[2])/tr[1]/td[1]")).click();
		} else {
			System.out.println("No rows are displayed!.. Kindly add some leads and try merge again!..");
		}
		verifyFocusOnParentWindow();
		
		// Click on the Merge button. 
		driver.findElement(By.linkText("Merge")).click();
		
		// Accept the alert. 
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		//Verify the title of the page.
		String pageTitle = driver.getTitle();
		System.out.println("The current page title is: " + pageTitle);
		quitBrowser();
	}
	
	public void switchToChildWindow() {
		Set<String> allWindows = driver.getWindowHandles();
		for (String window : allWindows) {
		    if (!window.equals(parentWindow)) {
		        driver.switchTo().window(window);
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		        break;
		    }
		}
	}
	
	public void verifyFocusOnParentWindow() {
		if (driver.getWindowHandles().size() == 1) {
		    driver.switchTo().window(parentWindow); // Ensure focus remains on the parent window
		}
	}
	
	public void quitBrowser() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.quit();
	}

	public static void main(String[] args) {
		LearnWindowHandles alerts = new LearnWindowHandles();
		alerts.windowHandles();	

	}

}
