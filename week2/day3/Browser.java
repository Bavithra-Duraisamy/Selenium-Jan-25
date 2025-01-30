package week2.day3;

public class Browser extends Chrome {
	
	String browserName, browserVersion;
	
	public void openURL() {
		
	}
	
	public void closeBrowser() {
		
	}
	
	public void navigateBack() {
		
	}

	public static void main(String[] args) {
		Browser browser = new Browser();
		browser.openIncognito();
		browser.clearCache();

	}

}
