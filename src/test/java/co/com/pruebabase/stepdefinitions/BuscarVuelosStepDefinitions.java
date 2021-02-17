package co.com.pruebabase.stepdefinitions;

import co.com.pruebabase.questions.Answer;
import co.com.pruebabase.tasks.Buscarvuelo;
import co.com.pruebabase.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class BuscarVuelosStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que (.*) quiere buscar vuelos en la pagina de avianca$")
    public void queAndresQuiereBuscarVuelosEnLaPaginaDeAvianca(String actor) {
        OnStage.theActorCalled(actor).wasAbleTo(OpenUp.thePage());

    }

    @Cuando("^busca vuelos$")
    public void buscaVuelos() {
        OnStage.theActorInTheSpotlight().attemptsTo(Buscarvuelo.onThePage());

    }

    @Entonces("^se debe visualizar en el cuerpo de la pagina (.*)$")
    public void seDebeVisualizarEnElCuerpoDeLaPaginaSeleccionaTuVueloDeIda(String question) {
              OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}
