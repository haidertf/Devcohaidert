package net.onlinenotepad.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.IngresoOnlineNotepadTask;
import tasks.Navegar;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class stepDefs {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("Se ingresa a la URL de notepad")
    public void seIngresaALaURLDeNotepad() {
        // Write code here that turns the phrase above into concrete actions
        theActorCalled("actor").wasAbleTo(Navegar.abrirUrl());
    }
    @When("Se ingresa el texto de ejemplo")
    public void seIngresaElTextoDeEjemplo() {
        // Write code here that turns the phrase above into concrete actions
        theActorInTheSpotlight().attemptsTo(IngresoOnlineNotepadTask.ingresoOnlineNotepadTask("data"));
    }
    @Then("Cumple las condiciones solicitadas")
    public void cumpleLasCondicionesSolicitadas() {
        // Write code here that turns the phrase above into concrete actions
        theActorInTheSpotlight().attemptsTo(IngresoOnlineNotepadTask.ingresoOnlineNotepadTask("data"));
    }

}
