package week1.day4;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		}
}
