package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\KIRAN PAWAR\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
WebElement txtfield = driver.findElement(By.xpath("//input[@name='q']"));//@1010
		    txtfield.sendKeys("Indian movie");
		    driver.navigate().refresh();//@2020
		    txtfield.sendKeys("Sairat");
		    
		}
		}  