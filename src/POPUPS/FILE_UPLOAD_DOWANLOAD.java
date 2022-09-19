package POPUPS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FILE_UPLOAD_DOWANLOAD {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KIRAN PAWAR\\Desktop\\sele\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.selenium.dev/downloads/");
	     
	}
}
