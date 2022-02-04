package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.pt.Quando;

import pages.RegisterPage;

public class DesafioSteps {
	WebDriver driver;
	
	@Given("que esteja na pagina do formulario: {string}")
	public void que_esteja_na_pagina_do_formulario(String url) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@Quando("eu preencher o formulario {string} {string} {string} {string} {string} {string} {string}")
	public void eu_preencher_o_formulario(String firstName,String lastName, String address, String emailAddress, String phone, String password, String confirmPassword ) {
		RegisterPage homeRegister = new RegisterPage(driver);
		homeRegister.realizaCampo(firstName, lastName, address, emailAddress, phone, password, confirmPassword);
		
	}
		

	@Then("sitema devera permitir o preenchimento do formulario com sucesso")
	public void sitema_devera_permitir_o_preenchimento_do_formulario_com_sucesso() {
	    System.out.println("Preenchimento do formulario com sucesso");
	}
	

	
	}

