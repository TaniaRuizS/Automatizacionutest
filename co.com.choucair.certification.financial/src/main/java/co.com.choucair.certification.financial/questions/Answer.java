package co.com.choucair.certification.financial.questions;

import co.com.choucair.certification.financial.userinterface.CompletesDataPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String welcomeToCommunity= Text.of(CompletesDataPage.WELCOM_TOCOMMUNITY).viewedBy(actor).asString();
        if (welcomeToCommunity.contains(question)) {
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
