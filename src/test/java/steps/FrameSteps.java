package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.FramePage;




public class FrameSteps {
	WebDriver driver ;
	
	@Given("que esteja na pagina de frames: {string}")
	public void que_esteja_na_pagina_de_frames(String url) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	
	@When("eu preencher o campo Frames {string}")
	public void eu_preencher_o_campo_frames(String frame) {
		FramePage framePage = new FramePage(driver);
		framePage.preencherFrame(frame);
	}

	@Then("sitema devera permitir o preenchimento com sucesso")
	public void sitema_devera_permitir_o_preenchimento_com_sucesso() {
		 System.out.println("Preenchimento do texto no frame com sucesso");
	  
	}

}
