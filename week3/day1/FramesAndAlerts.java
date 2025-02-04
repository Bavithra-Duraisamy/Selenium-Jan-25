package week3.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAndAlerts {
	static ChromeDriver driver = new ChromeDriver();
	public void AutomateFramesAndAlerts() {
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		WebElement frame = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert = driver.switchTo().alert();
        alert.accept();
        if(driver.findElement(By.xpath("//p[text()='You pressed OK!']")).getText().equalsIgnoreCase("you pressed ok!")) {
        	System.out.println("The alert has been accepted!..");
        } else {
        	System.out.println("The alert has not been accepted...");
        }
		driver.switchTo().defaultContent();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.quit();
	}

	public static void main(String[] args) {
		FramesAndAlerts frames = new FramesAndAlerts();
		frames.AutomateFramesAndAlerts();


	}

}
