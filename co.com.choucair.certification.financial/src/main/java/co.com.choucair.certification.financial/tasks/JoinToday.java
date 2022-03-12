package co.com.choucair.certification.financial.tasks;

import static co.com.choucair.certification.financial.unserinterface.Jointodaypage.ACCESS_BUTTON;
import static co.com.choucair.certification.financial.unserinterface.Jointodaypage.ENTER_BUTTONCOMPLETESETUP;
import static co.com.choucair.certification.financial.unserinterface.Jointodaypage.ENTER_BUTTONNEXTDEVICES;
import static co.com.choucair.certification.financial.unserinterface.Jointodaypage.ENTER_BUTTONNEXTLASTSTEP;
import static co.com.choucair.certification.financial.unserinterface.Jointodaypage.ENTER_BUTTONNEXTLOCATION;
import static co.com.choucair.certification.financial.unserinterface.Jointodaypage.INPUT_CONFIRMPASSWORD;
import static co.com.choucair.certification.financial.unserinterface.Jointodaypage.INPUT_CREATEPASSWORD;
import static co.com.choucair.certification.financial.unserinterface.Jointodaypage.INPUT_EMAIL;
import static co.com.choucair.certification.financial.unserinterface.Jointodaypage.INPUT_FIRSTNAME;
import static co.com.choucair.certification.financial.unserinterface.Jointodaypage.INPUT_LASTNAME;
import static co.com.choucair.certification.financial.unserinterface.Jointodaypage.INPUT_POSTALCODE;
import static co.com.choucair.certification.financial.unserinterface.Jointodaypage.SELECT_CITY;
import static co.com.choucair.certification.financial.unserinterface.Jointodaypage.SELECT_CODEOFCONDUCT;
import static co.com.choucair.certification.financial.unserinterface.Jointodaypage.SELECT_COUNTRY;
import static co.com.choucair.certification.financial.unserinterface.Jointodaypage.SELECT_DAY;
import static co.com.choucair.certification.financial.unserinterface.Jointodaypage.SELECT_MONTH;
import static co.com.choucair.certification.financial.unserinterface.Jointodaypage.SELECT_PRIVACYSECURITY;
import static co.com.choucair.certification.financial.unserinterface.Jointodaypage.SELECT_TERMSOFUSE;
import static co.com.choucair.certification.financial.unserinterface.Jointodaypage.SELECT_YEAR;

import org.openqa.selenium.Keys;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class JoinToday implements Task {
    public static JoinToday onThePage() {
        return Tasks.instrumented(JoinToday.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ACCESS_BUTTON),
                         Enter.theValue("Tania").into(INPUT_FIRSTNAME),
                         Enter.theValue("Ruiz").into(INPUT_LASTNAME),
                         Enter.theValue("tania8@hotmail.com").into(INPUT_EMAIL),
                         SelectFromOptions.byVisibleText("January").from(SELECT_MONTH),
                         SelectFromOptions.byVisibleText("1").from(SELECT_DAY),
                         SelectFromOptions.byVisibleText("2000").from(SELECT_YEAR),
                         Click.on(ENTER_BUTTONNEXTLOCATION),
                         Enter.theValue("Pereira").into(SELECT_CITY),
                         Hit.the(Keys.ARROW_DOWN).keyIn(SELECT_CITY),
                         Enter.theValue("60001").into(INPUT_POSTALCODE),
                         Click.on(SELECT_COUNTRY),
                         Enter.theValue("60001").into(INPUT_POSTALCODE),
                         Click.on(ENTER_BUTTONNEXTDEVICES),
                         Click.on(ENTER_BUTTONNEXTLASTSTEP),
                         Enter.theValue("Taniasanchez123").into(INPUT_CREATEPASSWORD),
                         Enter.theValue("Taniasanchez123").into(INPUT_CONFIRMPASSWORD),
                         Click.on(SELECT_TERMSOFUSE),
                         Click.on(SELECT_CODEOFCONDUCT),
                         Click.on(SELECT_PRIVACYSECURITY));
        }
    }
