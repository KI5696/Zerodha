package IFRAME;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\KIRAN PAWAR\\Desktop\\sele\\chromedriver_win32\\chromedriver.exe");    WebDriver driver=new ChromeDriver();
    driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
    //maximize the browser
    driver.manage().window().maximize();
    //switch to first frame
    driver.switchTo().frame("packageListFrame");
    //take 1st element on first frame
    String text = driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).getText();
    System.out.println(text);
    Thread.sleep(3000);
  
    
    //switch to second frame
    driver.switchTo().defaultContent();//it will move control of sel from 1st frame to main webpage
    driver.switchTo().frame("packageFrame");
    //take 1st element on 2nd frame
    String text1 = driver.findElement(By.xpath("//a[text()='AbstractAnnotations']")).getText();
    System.out.println(text1);
    Thread.sleep(3000);
    
    
    //switch to 3rd frame
    driver.switchTo().defaultContent();//switch control of sel from frame 2 to main webpage
    driver.switchTo().frame("classFrame");
    //take any element on 3rd frame
    String text2 = driver.findElement(By.xpath("//span[text()='Interface Summary']")).getText();
    System.out.println(text2);
    
    
}
}