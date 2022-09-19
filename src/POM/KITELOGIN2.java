package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KITELOGIN2 {
	@FindBy(xpath="//input[@id='pin']")private WebElement PIN;
	@FindBy(xpath="//button[@class='button-orange wide']")private WebElement cntBtn;
	
	
	//Initialization
	public void KiteLogin2Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//utilization
	public void enterPIN() {
		PIN.sendKeys("171992");
	}
	public void clickcntBtn() {
		cntBtn.click();
	}
	
	
}