package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.Allpages;
import pages.Alltrick;
import utils.ConfigReader;
import utils.Driver;

public class HomePageStepDefs {

    Alltrick elements = new Alltrick();

    @Given("Alltricks anasayfasina git")
    public void alltricks_anasayfasina_git() {
     Driver.getAppiumDriver().get("www.alltricks.com");

    }

    @Then("Profil sekmesine gec")
    public void profil_sekmesine_gec() {

        elements.agree.click();

    }

    @And("Adresim kismina emaili gir")
    public void adresim_kismina_emaili_gir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int arg0) throws InterruptedException {
        Thread.sleep(3000);
    }
}
