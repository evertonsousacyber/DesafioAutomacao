package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderPage {
	
	final String slider  = "/html/body/section/div[1]/div/div/div/a";

	WebDriver driver;

	public SliderPage(WebDriver driver) {
		this.driver = driver;

	}

	public void moverSlider() {
		
		new Actions(driver).dragAndDropBy(driver.findElement(By.xpath(slider)),  350, 0).build().perform();

 
		
	}



}
