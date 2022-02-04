package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramePage {
	
	WebDriver driver;
	
		
	
	final String CAMPO_Frame = "/html/body/section/div/div/div/input";
	
	public FramePage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void preencherFrame(String frame) {
		driver.switchTo().frame("singleframe");
		driver.findElement(By.xpath(CAMPO_Frame)).sendKeys(frame);
	}

}


