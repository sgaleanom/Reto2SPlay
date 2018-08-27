package co.com.proyectobase.screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import static co.com.proyectobase.screenplay.ui.OrangeHRSearchPage.NAME_SEARCH;

public class TheEmployeeName implements Question<Boolean>{

	@Override
	public Boolean answeredBy(Actor actor) {
		try {Thread.sleep(2000);} catch (Exception e) {}
		return Visibility.of(NAME_SEARCH).viewedBy(actor).asBoolean();
	}

	public static TheEmployeeName isPresent() {

		return new TheEmployeeName();
	}

}
