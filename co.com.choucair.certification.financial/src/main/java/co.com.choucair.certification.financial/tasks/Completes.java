package co.com.choucair.certification.financial.tasks;


import co.com.choucair.certification.financial.userinterface.CompletesDataPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;



public class Completes implements Task {
    private String data;

    public Completes(String data) {
        this.data = data;
    }

    public static Completes the(String data) {return Tasks.instrumented(Completes.class, data); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CompletesDataPage.INPUT_FIRSTNAME),
                Enter.theValue("TANIA").into(CompletesDataPage.INPUT_FIRSTNAME),
                Enter.theValue("RUIZ").into(CompletesDataPage.INPUT_LASTNAME),
                Enter.theValue("santidino12@hotmail.com").into(CompletesDataPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText("March").from(CompletesDataPage.SELECT_MONTH),
                SelectFromOptions.byVisibleText("23").from(CompletesDataPage.SELECT_DAY),
                SelectFromOptions.byVisibleText("1995").from(CompletesDataPage.SELECT_YEAR),
                Click.on(CompletesDataPage.ENTER_BUTTONNEXTLOCATION),
                Enter.theValue("Pereira").into(CompletesDataPage.SELECT_CITY),
                Enter.theValue("660011").into(CompletesDataPage.INPUT_POSTALCODE),
                Click.on(CompletesDataPage.ENTER_BUTTONNEXTDEVICES),
                Click.on(CompletesDataPage.SELECT_CLICK_MOBILEDEVICE),
                Click.on(CompletesDataPage.INPUT_SELECT_MOBILEDEVICE),
                Click.on(CompletesDataPage.SELECT_CLICK_MODEL),
                Click.on(CompletesDataPage.INPUT_SELECT_MODEL),
                Click.on(CompletesDataPage.SELECT_CLICK_OPERATINGSYSTEM),
                Click.on(CompletesDataPage.INPUT_SELECT_OPERATINGSYSTEM),
                Click.on(CompletesDataPage.ENTER_BUTTONNEXTLASTSTEP),
                Enter.theValue("Taniasanchez123").into(CompletesDataPage.INPUT_CREATEPASSWORD),
                Enter.theValue("Taniasanchez123").into(CompletesDataPage.INPUT_CONFIRMPASSWORD),
                Click.on(CompletesDataPage.SELECT_TERMSOFUSE),
                Click.on(CompletesDataPage.SELECT_CODEOFCONDUCT),
                Click.on(CompletesDataPage.SELECT_PRIVACYSECURITY),
                Click.on(CompletesDataPage.ENTER_BUTTONCOMPLETESETUP)
        );
    }
}


