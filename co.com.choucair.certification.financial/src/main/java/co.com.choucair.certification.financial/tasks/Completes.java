package co.com.choucair.certification.financial.tasks;


import co.com.choucair.certification.financial.model.InformationData;
import co.com.choucair.certification.financial.userinterface.CompletesDataPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;



public class Completes implements Task {
    private InformationData informationData;

    public Completes(InformationData informationData) {
        this.informationData = informationData;
    }

    public static Completes the(InformationData informationData) {return Tasks.instrumented(Completes.class, informationData); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CompletesDataPage.INPUT_FIRSTNAME),
                Enter.theValue(informationData.getFirstname()).into(CompletesDataPage.INPUT_FIRSTNAME),
                Enter.theValue(informationData.getLastname()).into(CompletesDataPage.INPUT_LASTNAME),
                Enter.theValue(informationData.getEmail()).into(CompletesDataPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(informationData.getMonth()).from(CompletesDataPage.SELECT_MONTH),
                SelectFromOptions.byVisibleText(informationData.getDay()).from(CompletesDataPage.SELECT_DAY),
                SelectFromOptions.byVisibleText(informationData.getYear()).from(CompletesDataPage.SELECT_YEAR),
                Click.on(CompletesDataPage.ENTER_BUTTONNEXTLOCATION),
                Enter.theValue(informationData.getCity()).into(CompletesDataPage.SELECT_CITY),
                Enter.theValue(informationData.getPostalcode()).into(CompletesDataPage.INPUT_POSTALCODE),
                Click.on(CompletesDataPage.ENTER_BUTTONNEXTDEVICES),
                Click.on(CompletesDataPage.SELECT_CLICK_MOBILEDEVICE),
                Click.on(CompletesDataPage.INPUT_SELECT_MOBILEDEVICE),
                Click.on(CompletesDataPage.SELECT_CLICK_MODEL),
                Click.on(CompletesDataPage.INPUT_SELECT_MODEL),
                Click.on(CompletesDataPage.SELECT_CLICK_OPERATINGSYSTEM),
                Click.on(CompletesDataPage.INPUT_SELECT_OPERATINGSYSTEM),
                Click.on(CompletesDataPage.ENTER_BUTTONNEXTLASTSTEP),
                Enter.theValue(informationData.getPassword1()).into(CompletesDataPage.INPUT_CREATEPASSWORD),
                Enter.theValue(informationData.getPassword2()).into(CompletesDataPage.INPUT_CONFIRMPASSWORD),
                Click.on(CompletesDataPage.SELECT_TERMSOFUSE),
                Click.on(CompletesDataPage.SELECT_CODEOFCONDUCT),
                Click.on(CompletesDataPage.SELECT_PRIVACYSECURITY),
                Click.on(CompletesDataPage.ENTER_BUTTONCOMPLETESETUP)
        );
    }
}


