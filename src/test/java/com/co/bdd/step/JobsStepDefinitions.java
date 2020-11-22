package com.co.bdd.step;

import static org.junit.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.annotations.findby.By;

public class JobsStepDefinitions {

	private WebDriver driver;

	@Given("Ubicado en la pagina principal de Chourcair")
	public void ubicado_en_la_pagina_principal_de_Chourcair() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.choucairtesting.com/");
	}

	@When("Doy click en la pestana de empleo")
	public void doy_click_en_la_pestana_de_empleo() {
		driver.findElement(By.linkText("Empleos")).click();
	}

	@Then("Me muevo a la pagina de empleo")
	public void me_muevo_a_la_pagina_de_empleo() {
		String expUrl = "https://www.choucairtesting.com/empleos-testing/";
		String actUrl = driver.getCurrentUrl();
		if (!expUrl.equals(actUrl)) {
			fail("Direccion incorrecta");
		}

		driver.quit();

	}

	@When("Clik a cada uno de los iconos")
	public void Clik_a_cada_uno_de_los_iconos() {
		System.out.print("Clik a cada uno de los iconos");
	}

	@Then("Me ubico en la seccion del icono")
	public void me_ubico_en_la_seccion_del_icono() {
		System.out.print("me ubico en la seccion del icono");
	}

	/// abajo

	@Given("Ubicado en la pestana de empleo chourcair")
	public void Ubicado_en_la_pestana_de_empleo_chourcair() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.choucairtesting.com/empleos-testing/");

	}

	@When("Doy click al video multimedia")
	public void doy_click_al_video_multimedia() {
		driver.findElement(By.xpath("button[@aria-label='Play']")).click();
	}

	@Then("Video inicia reproduccion")
	public void video_inicia_reproduccion() {
		System.out.print("video inicia reproduccion");
	}
}
