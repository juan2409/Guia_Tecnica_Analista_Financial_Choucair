package co.com.choucair.certification.Guia_Tecnica_Analista_Financial.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("Button that shows us the form to login").located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(), 'Ingresar')]"));
    public static final Target SECOND_LOGIN_BUTTON = Target.the("Button that shows us the form to login").located(By.xpath("//*[@id=\"nav-menu\"]/ul[2]/li/a"));
    public static final Target INPUT_USER = Target.the("Button that shows us the form to login").located(By.id("username"));
    public static final Target INPUT_PASSWORD = Target.the("Button that shows us the form to login").located(By.id("password"));
    public static final Target ENTER_BUTTON = Target.the("Button that shows us the form to login").located(By.xpath("//button[contains(@class, 'btn btn-primary')]"));
}
