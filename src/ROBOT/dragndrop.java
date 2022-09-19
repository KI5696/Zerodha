package ROBOT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;
import org.openqa.selenium.interactions.Actions;

public class dragndrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KIRAN PAWAR\\Desktop\\sele\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		  //inspect first element and store in ele1
		  WebElement ele1 = driver.findElement(By.xpath("//div[@id='draggable']"));
		  //inspect element 2 and store in ele2
		  WebElement ele2 = driver.findElement(By.xpath("//div[@id='droppable']"));
		  //object of Actions class
		  Actions act=new Actions(driver);
		  act.dragAndDrop(ele1, ele2).perform();
		  
	}
	}