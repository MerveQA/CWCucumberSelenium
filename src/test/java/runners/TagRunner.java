package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // sadece smoke tagine sahip olan senaryoları calıstıran runner
      features = "src/test/resources/features",
      glue = "stepdefinitions" ,
      tags = "@smoke",
      dryRun = false
)
public class TagRunner {

}
