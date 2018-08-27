package co.com.proyectobase.screenplay.tasks;

import static co.com.proyectobase.screenplay.ui.OrangeHRLoginPage.BUTTON_LOGIN;

import co.com.proyectobase.screenplay.ui.OrangeHRLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;


public class OpenPage implements Task{

	private OrangeHRLoginPage orangeHRHomePage;

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(orangeHRHomePage), 
				Click.on(BUTTON_LOGIN));
	}

	public static OpenPage ThePageOrangeHR() 
	{
		return Tasks.instrumented(OpenPage.class);
	}

}
