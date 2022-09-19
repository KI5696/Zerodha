package LIST_BOX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KIRAN PAWAR\\Downloads\\chromedriver_win32 (1) chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("C:\\Users\\KIRAN PAWAR\\OneDrive\\Documents\\Software Testing\\listbox.html");
	WebElement dropdown = driver.findElement(By.xpath("//select[@id='Goodluck']"));
	Select s=new Select(dropdown);
	//s.selectByIndex(3);// select by index method
	//s.selectByValue("D");// select by value
	s.selectByVisibleText("misal"); // select by vissible text
	}

}
