package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static userinterface.IngresoOnlineNotepad.*;

public class IngresoOnlineNotepadTask implements Task {


    String data;

    public IngresoOnlineNotepadTask(String data) {
        this.data = data;
    }

    public static Performable ingresoOnlineNotepadTask(String data) {
        return Instrumented.instanceOf(IngresoOnlineNotepadTask.class).withProperties(data);
    }

    @Override
    public <T extends Actor> void performAs(T t) {

        t.attemptsTo(

                WaitUntil.the(BTN_NOTATXTENRIQUECIDO, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_NOTATXTENRIQUECIDO),
                Click.on(BTN_NEGRILLA),
                Enter.theValue(data).into(TXT_NOTA)



        );
    }
}
