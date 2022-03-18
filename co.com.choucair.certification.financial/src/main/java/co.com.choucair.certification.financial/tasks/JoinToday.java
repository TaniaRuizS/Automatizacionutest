package co.com.choucair.certification.financial.tasks;

import co.com.choucair.certification.financial.userinterface.AccessJoinTodayPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class JoinToday implements Task {
    public static JoinToday onThePage() {

        return Tasks.instrumented(JoinToday.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(AccessJoinTodayPage.JOINTODAY_BUTTON));
    }
}
