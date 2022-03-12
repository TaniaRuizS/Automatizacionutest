package co.com.choucair.certification.financial.tasks;

import static co.com.choucair.certification.financial.unserinterface.Jointodaypage.ENTER_BUTTONCOMPLETESETUP;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class CreateUser implements Task {
    private String jointoday;

    public CreateUser(String jointoday) {
        this.jointoday = jointoday;
    }

    public static CreateUser the(String jointoday) {
        return Tasks.instrumented(CreateUser.class, jointoday);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ENTER_BUTTONCOMPLETESETUP));

    }
}
