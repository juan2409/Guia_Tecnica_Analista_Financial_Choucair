package co.com.choucair.certification.Guia_Tecnica_Analista_Financial.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SearchCoursePage extends PageObject {

    public static final Target CURSOS_BUTTON = Target.the("Button that shows us the list of courses").located(By.xpath("//*[@id=\"certificaciones\"]/div[1]/a/h4/strong"));
    public static final Target SEARCH_BAR = Target.the("Bar that allows us to type the desired course").located(By.xpath("//*[@id=\"coursesearchbox\"]"));
    public static final Target SEARCH_BUTTON = Target.the("Button that allows us to search the desired course").located(By.xpath("//*[@id=\"coursesearch\"]/fieldset/button"));
    public static final Target COURSE_BUTTON = Target.the("Button that shows us the course").located(By.xpath("/html/body/div[2]/div[2]/div/div/div/section/div/div/div[1]/h4/a"));
    public static final Target NAME_COURSE = Target.the("Gets the name of the course").located(By.xpath("//h1[contains(text(),'Advanced Level Test Manager')]"));
}
