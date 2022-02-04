package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DatePickerPage {
	
WebDriver driver;
	
	
	
	final String CAMPO_DatePicker = "//input[@id='datepicker2']";
    final String CAMPO_DatePickerDisabled = "//input[@id='datepicker1']";
	final String VALOR_DatePickerDisabled = "/html/body/div/table/tbody/tr[2]/td[3]/a";
	
	public DatePickerPage(WebDriver driver) {
		this.driver = driver;

	}
	
	public void preencherDatePicker(String DatePicker) {
		driver.findElement(By.xpath(CAMPO_DatePicker)).sendKeys(DatePicker);
		driver.findElement(By.xpath(CAMPO_DatePickerDisabled)).click();
		driver.findElement(By.xpath(VALOR_DatePickerDisabled)).click();
		
	}
	
}