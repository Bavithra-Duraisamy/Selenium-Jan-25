package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public void facebookLogin() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		driver.findElement(By.id("loginbutton")).click();
		driver.findElement(By.linkText("Find your account and log in.")).click();
		System.out.println(driver.getTitle());
		driver.close();

	}

	public static void main(String[] args) {
		FacebookLogin fbLogin = new FacebookLogin();
		fbLogin.facebookLogin();
	}

}
