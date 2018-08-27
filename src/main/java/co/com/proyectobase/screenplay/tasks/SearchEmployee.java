package co.com.proyectobase.screenplay.tasks;

import static co.com.proyectobase.screenplay.ui.OrangeHRSearchPage.BUTTON_EMPLOYEE_LIST;
import static co.com.proyectobase.screenplay.ui.OrangeHRSearchPage.BUTTON_SEARCH;
import static co.com.proyectobase.screenplay.ui.OrangeHRSearchPage.EMPLOYEE_NAME;

import org.openqa.selenium.Keys;

import co.com.proyectobase.screenplay.util.ExcelReader;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SearchEmployee implements Task{
	
	private int i;

	public SearchEmployee(int i) {
		this.i = i;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		try{
		String Name= ExcelReader.getCellData(i, 0).trim()+" "+ ExcelReader.getCellData(i, 1).trim()+" "+ExcelReader.getCellData(i, 2).trim();
		Thread.sleep(3000);
			actor.attemptsTo(
					
					Click.on(BUTTON_EMPLOYEE_LIST),
					Enter.theValue(Name).into(EMPLOYEE_NAME).thenHit(Keys.ENTER),
					Click.on(BUTTON_SEARCH)
					);
		}catch (Exception e) {
		
		}
		
	}

	public static SearchEmployee WithTheFollowingData(int i) {

		return Tasks.instrumented(SearchEmployee.class, i);
	}

}
