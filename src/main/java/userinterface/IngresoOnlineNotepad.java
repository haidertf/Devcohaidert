package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.online-notepad.net/es/bloc-de-notas-online")
public class IngresoOnlineNotepad extends PageObject {


    public static final Target BTN_NOTATXTENRIQUECIDO = Target.the("Ingreso de texto en la Nota").located(By.xpath("//*[@class='nav flex-column nav-pills']/button[2]"));

    public static final Target BTN_NEGRILLA = Target.the("Ingreso de texto en la Nota").located(By.xpath("//*[@id='richtextnote']/main/div/div/div[1]/div/div[1]/button[1]"));

    public static final Target TXT_NOTA = Target.the("Ingreso de texto en la Nota").located(By.id("editor"));

}
