package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButtonActions {
	static ChromeDriver driver = new ChromeDriver();

	public void radioButtonActions() {
		driver.manage().window().maximize();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		// Check if the button with the text ‘Confirm if the button is disabled’ is
		// disabled
		boolean buttonStatus = driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
		if (!buttonStatus) {
			System.out.println("Button is disabled by default");
		}
		// Click on the button with the text ‘Click and Confirm title'
		driver.findElement(By.xpath("//span[text()= 'Click']")).click();

		// Verify that the title of the page is ‘dashboard.’
		String currentPageTitle = driver.getTitle();
		if (currentPageTitle.equalsIgnoreCase("dashboard")) {
			System.out.println("Current page title is Dashboard");
		}
		
		// Browser back
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		// Find and print the position of the button with the text ‘Submit.’
		int xCord = driver.findElement(By.xpath("(//span[text()='Submit'])[1]")).getLocation().getX();
		int yCord = driver.findElement(By.xpath("(//span[text()='Submit'])[1]")).getLocation().getY();
		System.out.println("X position of the Submit button is: " + xCord);
		System.out.println("Y position of the Submit button is: " + yCord);

		// Find and print the background color of the button with the text ‘Find the
		// Save button color.’
		String buttonColor = driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("background-color");
		System.out.println("The Save button color is: " + buttonColor);

		// Find and print the height and width of the button with the text ‘Find the
		// height and width of this button.’
		int buttonHeight = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize().height;
		int buttonWidth = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize().width;
		System.out.println("Button height is: " + buttonHeight);
		System.out.println("Button width is: " + buttonWidth);

		// Close the browser window.
		driver.quit();
	}

	public static void main(String[] args) {
		LeafGroundButtonActions alerts = new LeafGroundButtonActions();
		alerts.radioButtonActions();

	}

}
