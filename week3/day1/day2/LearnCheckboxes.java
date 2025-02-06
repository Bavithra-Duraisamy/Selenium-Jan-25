package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnCheckboxes {
	static ChromeDriver driver = new ChromeDriver();

	public void checkboxActions() {
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		// Click on the "Basic Checkbox.”
		driver.findElement(By.xpath("((//span[text()='Basic'])/preceding-sibling::div)[2]")).click();

		// Click on the "Notification Checkbox."
		driver.findElement(By.xpath("((//span[text()='Ajax'])/preceding-sibling::div)[2]")).click();

		// Verify that the expected message is displayed.
		boolean checkedToaster = driver.findElement(By.xpath("//span[text()='Checked']")).isDisplayed();
		if (checkedToaster) {
			System.out.println("The checkbox has been checked");
		}
		// Click on your favorite language (assuming it's related to checkboxes).
		driver.findElement(By.xpath("(//label[text()='Python'])/preceding-sibling::div")).click();

		// Click on the "Tri-State Checkbox."
		driver.findElement(By.xpath("(//div[contains(@class, 'formgrid')])[4]/div/div")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		

		// Verify which tri-state option has been chosen.
		String stateValue = driver.findElement(By.xpath("//div[@class='ui-growl-message']/p")).getText();
		System.out.println("The state " + stateValue + " has been selected..");

		// Click on the "Toggle Switch."
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();

		// Verify that the expected message is displayed.
		String toggleCheck = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		if (toggleCheck.equalsIgnoreCase("checked")) {
			System.out.println("The toggle has been enabled");
		} else {
			System.out.println("The toggle has been disabled");
		}

		// Verify if the Checkbox is disabled.
		boolean disabledCheckbox = driver
				.findElement(By.xpath("((//span[text()='Disabled'])/preceding-sibling::div)[2]")).isSelected();
		if (!disabledCheckbox) {
			System.out.println("The checkbox is already disabled");
		} else {
			System.out.println("The checkbox is enabled");
		}

		// Select multiple options on the page (details may be needed).
		driver.findElement(By.xpath("//ul[contains(@class, 'ui-selectcheckboxmenu-multiple-container ')]")).click();
		WebElement countrySelect = driver.findElement(By.xpath("//label[text()='Paris']/preceding-sibling::div"));
		countrySelect.click();
		String countryValue = driver.findElement(By.xpath("//span[@class='ui-selectcheckboxmenu-token-label']")).getText();
		System.out.println(countryValue + " has been selected!..");

		// Perform any additional actions or verifications required.

		// Close the web browser when done.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.quit();
	}

	public static void main(String[] args) {
		LearnCheckboxes alerts = new LearnCheckboxes();
		alerts.checkboxActions();

	}

}
