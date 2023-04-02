package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.Allpages;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;

public class AmazonStepDef {


    @Given("kullanici amazon anasayfaya gider")
    public void kullanici_amazon_anasayfaya_gider() throws InterruptedException {
       Driver.getAppiumDriver().get(ConfigReader.getProperty("AmazonUrl"));
    }

    @Then("amazon arama kutusuna Nutella yazip aratir")
    public void amazon_arama_kutusuna_nutella_yazip_aratir() {
       Driver.getAppiumDriver().findElement(By.id("twotabsearchtextbox")).click();

    }

    @And("arama sonuclarinin Nutella icerdigini test eder")
    public void arama_sonuclarinin_nutella_icerdigini_test_eder() {
        System.out.println("Nutella ıcerik");
    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        System.out.println("kapatir");
    }


}
