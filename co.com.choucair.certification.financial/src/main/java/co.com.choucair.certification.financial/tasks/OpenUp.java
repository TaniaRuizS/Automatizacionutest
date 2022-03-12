package co.com.choucair.certification.financial.tasks;

import co.com.choucair.certification.financial.unserinterface.Utestpage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;


public class OpenUp implements Task {
    private Utestpage utestpage;
    public static OpenUp thePage() {
            return Tasks.instrumented(OpenUp.class);
        }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(utestpage));

    }
}
