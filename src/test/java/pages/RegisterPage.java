package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class RegisterPage {

	WebDriver driver;

	final String CAMPO_NAME = "/html/body/section/div/div/div[2]/form/div[1]/div[1]/input";
	final String CAMPO_LastName = "/html/body/section/div/div/div[2]/form/div[1]/div[2]/input";
	final String CAMPO_Address = "/html/body/section/div/div/div[2]/form/div[2]/div/textarea";
	final String CAMPO_EmailAddress = "/html/body/section/div/div/div[2]/form/div[3]/div[1]/input";
	final String CAMPO_Phone = "/html/body/section/div/div/div[2]/form/div[4]/div/input";
	final String CAMPO_Gender = "/html/body/section/div/div/div[2]/form/div[5]/div/label[1]/input";
	final String CAMPO_Hobbies = "/html/body/section/div/div/div[2]/form/div[6]/div/div[2]/input";
	final String CAMPO_Languages = "/html/body/section/div/div/div[2]/form/div[7]/div/multi-select/div[1]";
	final String VALOR_Languages = "/html/body/section/div/div/div[2]/form/div[7]/div/multi-select/div[2]/ul/li[29]/a";
	final String CAMPO_Imagetrgt = "/html/body/section/div/div/div[2]/form/div[8]/label";
	final String CAMPO_Skills = "/html/body/section/div/div/div[2]/form/div[8]/div/select";
	final String VALOR_Skills = "/html/body/section/div/div/div[2]/form/div[8]/div/select/option[5]";
	final String CAMPO_imagetrgt = "/html/body/section/div/div/div[2]/form/div[8]/label";
	final String CAMPO_SelectCountry = "/html/body/section/div/div/div[2]/form/div[10]/div/span/span[1]/span";
	final String VALOR_SelectCountry = "/html/body/span/span/span[2]/ul/li[2]";
    final String CAMPO_DateOfBirth = "/html/body/section/div/div/div[2]/form/div[11]/div[1]/select";
    final String VALOR_DateOfBirth = "/html/body/section/div/div/div[2]/form/div[11]/div[1]/select/option[74]";
    final String CAMPOS_DateOfBirth = "/html/body/section/div/div/div[2]/form/div[11]/div[2]/select";
    final String VALO_DateOfBirth = "/html/body/section/div/div/div[2]/form/div[11]/div[2]/select/option[9]";
    final String CAMPO_DAY = "/html/body/section/div/div/div[2]/form/div[11]/div[3]/select";
	final String VALOR_Day = "/html/body/section/div/div/div[2]/form/div[11]/div[3]/select/option[11]";
	final String CAMPOS_Imagetrgt = "/html/body/section/div/div/div[2]/form/div[8]/label";
	final String CAMPO_Password = "//input[@id='firstpassword']";
	final String CAMPO_ConfirmPassword = "//input[@id='secondpassword']";
	final String BUTTON_Submit  = "//button[@id='submitbtn']";
    
    
    public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}

	public void realizaCampo(String firstName, String lastName, String address, String emailAddress, String phone, String password, String confirmPassword) {
		
		
		driver.findElement(By.xpath(CAMPO_NAME)).sendKeys(firstName);
		driver.findElement(By.xpath(CAMPO_LastName)).sendKeys(lastName);
		driver.findElement(By.xpath(CAMPO_Address)).sendKeys(address);
		driver.findElement(By.xpath(CAMPO_EmailAddress)).sendKeys(emailAddress);
		driver.findElement(By.xpath(CAMPO_Phone)).sendKeys(phone);
		driver.findElement(By.xpath(CAMPO_Gender)).click();
		driver.findElement(By.xpath(CAMPO_Hobbies)).click();
		driver.findElement(By.xpath(CAMPO_Languages)).click();
		driver.findElement(By.xpath(VALOR_Languages)).click();
		driver.findElement(By.xpath(CAMPO_Imagetrgt)).click();
		driver.findElement(By.xpath(CAMPO_Skills)).click();
		driver.findElement(By.xpath(VALOR_Skills)).click();
		driver.findElement(By.xpath(CAMPO_Imagetrgt)).click();
		driver.findElement(By.xpath(CAMPO_SelectCountry)).click();
		driver.findElement(By.xpath(VALOR_SelectCountry)).click();
		driver.findElement(By.xpath(CAMPO_DateOfBirth)).click();
		driver.findElement(By.xpath(VALOR_DateOfBirth)).click();
		driver.findElement(By.xpath(CAMPOS_DateOfBirth)).click();
		driver.findElement(By.xpath(VALO_DateOfBirth)).click();
		driver.findElement(By.xpath(CAMPO_DAY)).click();
		driver.findElement(By.xpath(VALOR_Day)).click();
		driver.findElement(By.xpath(CAMPOS_Imagetrgt)).click();
        driver.findElement(By.xpath(CAMPO_Password)).sendKeys(password);
		driver.findElement(By.xpath(CAMPO_ConfirmPassword)).sendKeys(confirmPassword);
		driver.findElement(By.xpath(BUTTON_Submit)).click();
		((JavascriptExecutor)driver).executeScript("document.body.style.zoom='67%'");
		
		

	}

}
