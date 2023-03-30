package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static userinterface.IngresoOnlineNotepad.TXT_NOTA;

public class ValidacionIngreso implements Task {

    String data;

    public ValidacionIngreso(String data) {
        this.data = data;
    }

    public static Performable validacionIngreso(String data) {
        return Instrumented.instanceOf(IngresoOnlineNotepadTask.class).withProperties(data);
    }

    @Override
    public <T extends Actor> void performAs(T t) {

        t.attemptsTo(

                WaitUntil.the(TXT_NOTA, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds()



        );
    }
}
