package POPUPS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.zeromq.ZStar.Set;

public class CHILDBROW {

	public static void main(String[] args) throws Throwable {

			System.setProperty("webdriver.chrome.driver","C:\\Users\\KIRAN PAWAR\\Desktop\\sele\\chromedriver_win32\\chromedriver.exe");
		     WebDriver driver=new ChromeDriver();
		     
		     driver.get("https://www.flipkart.com/");
		     //click on cancel button
		     driver.findElement(By.xpath("//button[text()='✕']")).click();
		     //search for mobiles
		     driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles");
		     //click on search button
		     driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		     Thread.sleep(3000);
		     //click on 1st mobile so that new child window  will opens
		     driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		     //by default sselenium control should be on main window we have switch it from main window to child
		     Thread.sleep(3000);
		     java.util.Set<String> allws = driver.getWindowHandles();
		     //use arraylist to store all windows 
		for(String singlewin:allws) {
	     	driver.switchTo().window(singlewin);//now ur selenium control goes from main win to child
	     }
	     //get the text of child for our confirmation
	     Thread.sleep(3000);
	     String expT="REDMI Note 10S (Frost White, 64 GB)  (6 GB RAM))";
	     String actT = driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
	     System.out.println(actT);
	     //verify the child window handle or not
	     Thread.sleep(3000);
	     if(actT.equals(expT)) {
	     	System.out.println("child window is handles and TC is pass");
	     }
	     else {
	     	System.out.println("Tc is fail");
	     }
	     
	 }
	 }