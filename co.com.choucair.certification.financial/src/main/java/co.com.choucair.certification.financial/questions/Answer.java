package co.com.choucair.certification.financial.questions;

import co.com.choucair.certification.financial.unserinterface.Jointodaypage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

	private String question;

	public Answer(String question){
		this.question = question;
	}

	public static Answer toThe(String question){
		return new Answer(question);
	}

	@Override
	public Boolean answeredBy(final Actor actor) {
		boolean result;
		String nameCourse = Text.of(Jointodaypage.END_USER).viewedBy(actor).asString();
		if(question.equals(nameCourse)){
			result = true;
		} else {
			result = false;
		}
		return result;
	}
}
