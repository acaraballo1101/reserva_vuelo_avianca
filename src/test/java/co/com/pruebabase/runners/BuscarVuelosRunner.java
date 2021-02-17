package co.com.pruebabase.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/buscarVuelos.feature",
        tags = "@stories",
        glue = "co.com.pruebabase",
        snippets = SnippetType.CAMELCASE)

public class BuscarVuelosRunner {
}
