package pl.sda.cucumber;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class MyStepDefs {
    HelloWorld helloWorld;
    String zwroconepowitanie = "";

    @Given("Stworzona instancja klasy obiektu HelloWorld")
    public void stworzonaInstancjaKlasyObiektuHelloWorld() {
        helloWorld = new HelloWorld();
    }

    @When("Wprowadzono jezyk {string}")
    public void wprowadzonoJezykPolski(String lang)
    {
        zwroconepowitanie = helloWorld.getHelloMessage(lang);
    }

    @Then("Wyswietlony zostal komunikat {string}")
    public void wyswietlonyZostalKomunikatWJezykuPolskim(String powitanie)
    {
        assertThat(zwroconepowitanie).isEqualTo(powitanie);
    }



    }

