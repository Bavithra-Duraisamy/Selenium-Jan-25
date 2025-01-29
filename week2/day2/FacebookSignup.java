package week2.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignup {

	static ChromeDriver driver = new ChromeDriver();

	// Launch browser and load the Facebook signup page
	public void launchBrowser() {
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		try {
			driver.wait(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Enter the Firstname and Lastname
	public void personalDetails() {
		driver.findElement(By.name("firstname")).sendKeys("Bavithra");
		driver.findElement(By.name("lastname")).sendKeys("Duraisamy");
	}

	// Enter Date of Birth
	public void dateOfBirth() {
		WebElement dayOfBirth = driver.findElement(By.id("day"));
		Select day = new Select(dayOfBirth);
		day.selectByValue("5");

		WebElement monthOfBirth = driver.findElement(By.id("month"));
		Select month = new Select(monthOfBirth);
		month.selectByValue("11");

		WebElement yearOfBirth = driver.findElement(By.id("year"));
		Select year = new Select(yearOfBirth);
		year.selectByVisibleText("1991");
	}

	// Select the Gender
	public void selectGender() {
		driver.findElement(By.xpath("(//input[@id='sex'])[1]")).click();
	}

	// Enter the Phone number and Password
	public void phoneAndPassword() {
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input"))
				.sendKeys("9884465539");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test@123");
		driver.findElement(By.name("websubmit")).click();

	}

	// Close the browser
	public void quitBrowser() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.close();
	}

	// Consolidated method which has all the methods

	public void fbSignup() {
		launchBrowser();
		personalDetails();
		dateOfBirth();
		selectGender();
		phoneAndPassword();
		quitBrowser();
	}

	public static void main(String[] args) {
		FacebookSignup signup = new FacebookSignup();
		signup.fbSignup();

	}

}
