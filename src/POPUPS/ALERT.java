package POPUPS;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ALERT {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KIRAN PAWAR\\Desktop\\sele\\chromedriver_win32\\chromedriver.exe");    WebDriver driver=new ChromeDriver();
	    WebDriver driver1=new ChromeDriver();
	    driver1.get("https://demo.guru99.com/test/delete_customer.php");
	    //enter custmer id
	    driver1.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345");
	    //click on submit button
	    driver1.findElement(By.xpath("//input[@name='submit']")).click();
	    
	    //switch from main webpage to popup
	    Alert alt = driver1.switchTo().alert();
	    Thread.sleep(4000);
	    //click on ok button
	    alt.accept();
	   // Thread.sleep(4000);
	 //   click on cancel button
	 //  alt.dismiss();
	    
	    //vget the text of popup
	    Thread.sleep(3000);
	    String text = alt.getText();
	    System.out.println(text);
	    
	}
	}