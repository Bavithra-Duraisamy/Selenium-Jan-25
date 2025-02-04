package week3.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertInteractions {
	
	static ChromeDriver driver = new ChromeDriver();
	public void alertsActions() {
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//button[contains(@class, 'ui-button-success')]")).click();
		Alert alert = driver.switchTo().alert();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        alert.sendKeys("Content typed in the alert box");
        alert.accept();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        String alertText = driver.findElement(By.id("confirm_result")).getText();
        System.out.println(alertText);
        driver.quit();
}

	public static void main(String[] args) {
		AlertInteractions alerts = new AlertInteractions();
		alerts.alertsActions();

	}

}
