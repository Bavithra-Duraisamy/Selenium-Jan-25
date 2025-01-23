package week1.day3;

public class Browser {
	
	public static String launchBroswer(String browserName) {
		System.out.println(browserName +" browser has been launched successfully");
		return browserName;
	}
	
	public static void loadURL(String URL) {
		System.out.println("The URL "+ URL+" has been loaded");
		
	}

	public static void main(String[] args) {
		Browser browser = new Browser();
		browser.launchBroswer("Firefox");
		browser.loadURL("https://mail.google.com/");

	}

}
