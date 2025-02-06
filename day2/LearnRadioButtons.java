package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnRadioButtons {
	static ChromeDriver driver = new ChromeDriver();
	List<String> browserTextList = new ArrayList<>();

	public void radioButtonActions() {
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		// Select Firefox browser
		driver.findElement(By.xpath("//table[@id='j_idt87:console1']/tbody[1]/tr[1]/td[1]/div[1]/div[2]/span[1]"))
				.click();
		String browserName = driver.findElement(By.xpath("(//label[text()='Firefox'])[1]")).getText();
		System.out.println(browserName + " browser has been selected!..");

		// Select and Unselect city name
		WebElement element = driver
				.findElement(By.xpath("//div[@id='j_idt87:city2']/div[1]/div[1]/div[1]/div[2]/span[1]"));
		element.click();
		boolean selectRadioButton = element.isEnabled();
		System.out.println("Radio button is selected!.." + selectRadioButton);
		element.click();
		boolean UnSelectRadioButton = element.isSelected();
		System.out.println("Radio button is unselected!.." + UnSelectRadioButton);

		// Check if any browser has been selected by default
		List<WebElement> browserStatus = driver
				.findElements(By.xpath("//table[@id='j_idt87:console2']/tbody[1]/tr[1]/td/div/div[2]"));

		for (WebElement browser : browserStatus) {
			if (browser.isSelected()) {
				getBrowserNames();
				for (int i = 0; i < browserTextList.size(); i++) {
					System.out.println(browserTextList.get(i) + " has been selected by default!..");
				}

			} else {
				getBrowserNames();
				for (int i = 0; i < browserTextList.size(); i++) {
					System.out.println(browserTextList.get(i) + " has not been selected by default!..");
				}

			}
		}

		// Check if age group is already selected
		boolean ageGroup = driver.findElement(By.cssSelector(
				"html>body>div>div:nth-of-type(5)>div:nth-of-type(2)>form>div>div:nth-of-type(2)>div:nth-of-type(2)>div>div>div>div>div:nth-of-type(2)>div>div:nth-of-type(2)>span"))
				.isEnabled();
		String ageGroupValue = driver.findElement(By.cssSelector(
				"html>body>div>div:nth-of-type(5)>div:nth-of-type(2)>form>div>div:nth-of-type(2)>div:nth-of-type(2)>div>div>div>div>div:nth-of-type(2)>label"))
				.getText();
		if (ageGroup) {
			System.out.println("Age group is already selected with the value: " + ageGroupValue);
		}
		quitBrowser();

	}

	public List<String> getBrowserNames() {
		List<WebElement> browserNames = driver
				.findElements(By.xpath("//table[@id='j_idt87:console2']/tbody[1]/tr[1]/td/label"));
		// Extract text from each WebElement and store it in a list

		for (WebElement browserText : browserNames) {
			browserTextList.add(browserText.getText());

		}
		return browserTextList;
	}
	
	public void quitBrowser() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.quit();
	}

	public static void main(String[] args) {
		LearnRadioButtons alerts = new LearnRadioButtons();
		alerts.radioButtonActions();

	}

}
