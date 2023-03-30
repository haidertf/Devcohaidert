package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import userinterface.IngresoOnlineNotepad;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Navegar implements Task {

    IngresoOnlineNotepad url;

    @Step("{0} navega a la url ")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(url)
        );
    }

    public static Navegar abrirUrl() {
        return instrumented(Navegar.class);
    }
}
