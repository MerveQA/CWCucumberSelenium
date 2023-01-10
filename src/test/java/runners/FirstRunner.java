package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)  // HERYERDE sabit
@CucumberOptions(
        // dosyanın yolunu versik klasor yoluda verilebilir
        features = {"src/test/resources/features/firstfeature.feature"},
        //cucumber hangi calssla hangi methodla calısacagını nerden biliyor ?
        // java nın altındaki step claasımızı buraya tanıtıyoruz
        // eger stepdefinition package ın altında birden fazla class olursa
        // {} susulu içinde virgulle ayırarak hepsının yollarını ayrı belirtmek gerekir
        glue = {"stepdefinitions"}

)


public class FirstRunner {
}
