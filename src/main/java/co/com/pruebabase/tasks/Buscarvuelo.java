package co.com.pruebabase.tasks;

import co.com.pruebabase.userinterface.AviancaPage;
import co.com.pruebabase.userinterface.SoloIdaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.Wait;
import org.openqa.selenium.Keys;

public class Buscarvuelo implements Task {


    public static Buscarvuelo onThePage() {
        return Tasks.instrumented(Buscarvuelo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SoloIdaPage.BTN_COOKIES),
                Click.on(SoloIdaPage.BTN_RESERVA),
                Click.on(SoloIdaPage.BTN_SOLO_IDA),
                Click.on(SoloIdaPage.CAJA_ORIGEN),
                //Scroll.to(SoloIdaPage.CAJA_ORIGEN),
                Enter.theValue("Medell").into(SoloIdaPage.CAJA_ORIGEN),
                new SendKeys(Keys.ARROW_DOWN).into(SoloIdaPage.CAJA_ORIGEN),
                new SendKeys(Keys.ENTER).into(SoloIdaPage.CAJA_ORIGEN),
                Click.on(SoloIdaPage.CAJA_DESTINO),
                Enter.theValue("Cartag").into(SoloIdaPage.CAJA_DESTINO),
                new SendKeys(Keys.ARROW_DOWN).into(SoloIdaPage.CAJA_DESTINO),
                new SendKeys(Keys.ENTER).into(SoloIdaPage.CAJA_DESTINO),
                Click.on(SoloIdaPage.CAJA_FECHA),
                Click.on(SoloIdaPage.CAJA_DIA),
                Click.on(SoloIdaPage.CAJA_PASAJEROS),
                Click.on(SoloIdaPage.BTN_ADULTOS),
                Click.on(SoloIdaPage.BTN_NINOS),
                Click.on(SoloIdaPage.BTN_BEBES),
                Click.on(SoloIdaPage.BTN_CONTINUAR),
                Click.on(SoloIdaPage.BTN_BUSCAR_VUELO),
                Click.on(SoloIdaPage.BTN_CONTINUAR2)
        );
   }
}
