package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SliderPage;



public class SliderSteps {
	WebDriver driver;
	
	
	@Given("que esteja na pagina da Slider: {string}")
	public void que_esteja_na_pagina_da_slider(String url) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	   
	}

	@When("eu mover o Slider")
	public void eu_mover_o_slider() {
		SliderPage SliderPage = new SliderPage(driver);
		SliderPage.moverSlider();
	    
	}
	

	@Then("sitema devera mover o Slider com sucesso")
	public void sitema_devera_mover_o_slider_com_sucesso() {
		System.out.println("Slider movido com sucesso");
	   
	}

}
