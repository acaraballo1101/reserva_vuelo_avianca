package co.com.pruebabase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SoloIdaPage extends PageObject {

    public static final Target BTN_COOKIES = Target.the("Boton Reserva Tu vuelo").located(By.xpath("//*[@id=\"cookiePolicy\"]/div/div/div[2]/button"));
    public static final Target BTN_RESERVA = Target.the("Boton Reserva Tu vuelo").located(By.xpath("//a[@id='reservatuvuelo']"));
    public static final Target BTN_SOLO_IDA = Target.the("Boton Solo Ida").locatedBy("//A[@role='presentation'][text()='Solo ida']");
    //public static final Target CAJA_ORIGEN = Target.the("Boton Origen").located(By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[3]/div[4]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/div[1]/div[1]/label[1]"));
    public static final Target CAJA_ORIGEN = Target.the("Boton Origen").located(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[3]/div[4]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/div[1]/div[1]/label[1]/div[1]/input[1]"));
    public static final Target CAJA_DESTINO = Target.the("Boton Destino").located(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[3]/div[4]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/div[3]/div[2]/label[1]/div[1]/input[1]"));
    public static final Target CAJA_FECHA = Target.the("Boton Fecha").located(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[3]/div[4]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[2]/fieldset[1]/div[1]/div[1]/div[1]/label[1]/div[1]/input[1]"));
    public static final Target CAJA_DIA = Target.the("Boton Fecha").located(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[3]/div[4]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[2]/fieldset[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[3]/table[1]/tbody[1]/tr[3]/td[3]/div[1]"));
    public static final Target CAJA_PASAJEROS = Target.the("Boton Pasajeros").located(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[3]/div[4]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[3]/fieldset[1]/div[1]/div[1]/div[1]/label[1]/div[1]/input[1]"));
    public static final Target CLIC_VACIO = Target.the("Boton Pasajeros").located(By.xpath("//*[@id=\"ida_1_836416014\"]/div/form/div"));
    public static final Target BTN_ADULTOS = Target.the("Boton Adultos").located(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[3]/div[4]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[3]/fieldset[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/i[1]"));
    public static final Target BTN_NINOS = Target.the("Boton Niños").located(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[3]/div[4]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[3]/fieldset[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[3]/i[1]"));
    public static final Target BTN_BEBES = Target.the("Boton Niños").located(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[3]/div[4]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[3]/fieldset[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div[3]/i[1]"));
    public static final Target BTN_CONTINUAR = Target.the("Boton Continuar").located(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[3]/div[4]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[3]/fieldset[1]/div[1]/div[1]/div[2]/button[1]"));
    public static final Target BTN_BUSCAR_VUELO = Target.the("Boton Buscar Vuelo").located(By.xpath("(//BUTTON[@class='btn primary btn-codepromo pull-btn'][text()='Buscar vuelos'][text()='Buscar vuelos'])[2]"));
    //public static final Target BTN_BUSCAR_VUELO = Target.the("Boton Buscar Vuelo").located(By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[3]/div[4]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[3]/fieldset[1]/div[1]/div[4]/button[1]/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[3]/div[4]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[3]/fieldset[1]/div[1]/div[4]/button[1]"));
    public static final Target BTN_CONTINUAR2 = Target.the("Boton Continuar ").located(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/button[1]"));
    public static final Target VALIDAR = Target.the("CONFIRMACION").located(By.xpath("//h1[contains(text(),'Selecciona tu vuelo de ida')]"));



}