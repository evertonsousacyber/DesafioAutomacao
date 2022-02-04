package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.DatePickerPage;

public class DatePickerSteps {
	WebDriver driver;

	@Given("que esteja na pagina da Data: {string}")
	public void que_esteja_na_pagina_da_data(String url) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}

	@When("eu preencher o campo  {string}")
	public void eu_preencher_o_campo(String DatePicker) {
		DatePickerPage DatePickerPage = new DatePickerPage(driver);
		DatePickerPage.preencherDatePicker(DatePicker);

	}

	@Then("sitema devera permitir o preenchimento da data com sucesso")
	public void sitema_devera_permitir_o_preenchimento_da_data_com_sucesso() {
		 System.out.println("Preenchimento do data com sucesso");
	}

}
