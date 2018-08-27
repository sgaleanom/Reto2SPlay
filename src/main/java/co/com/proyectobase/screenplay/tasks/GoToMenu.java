package co.com.proyectobase.screenplay.tasks;

import static co.com.proyectobase.screenplay.ui.OrangeHRLoginPage.BUTTON_ADD_EMPLOYEE;
import static co.com.proyectobase.screenplay.ui.OrangeHRLoginPage.BUTTON_MENU_PIM;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class GoToMenu implements Task{
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(BUTTON_MENU_PIM), 
				Click.on(BUTTON_ADD_EMPLOYEE));
	}

	public static GoToMenu AddEmployee() {

		return Tasks.instrumented(GoToMenu.class);
	}

}
