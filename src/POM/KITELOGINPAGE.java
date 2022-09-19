package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KITELOGINPAGE {
	
	//step1 Declaration
		@FindBy(xpath="//input[@id='userid']")private WebElement UN;
		@FindBy(xpath="//input[@id='password']")private WebElement PWD;
		@FindBy(xpath="//button[@class='button-orange wide']")private WebElement LOGINBTN;
	//step2 Initialization
		public void KiteKogin1Page(WebDriver driver) {
			
			PageFactory.initElements(driver,this);
		}
	//Utilization
		public void enterUN() {
			UN.sendKeys("DPG458");
		}
		public void enterPWD() {
			PWD.sendKeys("Amol@1234");
		}
		public void clickLOGINBTN() {
			LOGINBTN.click();
		}
	}