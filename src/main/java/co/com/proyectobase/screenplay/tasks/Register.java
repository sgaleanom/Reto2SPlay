package co.com.proyectobase.screenplay.tasks;

import static co.com.proyectobase.screenplay.ui.OrangeHRAddEmployeePage.DATE_OF_BIRTH;
import static co.com.proyectobase.screenplay.ui.OrangeHRAddEmployeePage.DRIVER_LICENSE;
import static co.com.proyectobase.screenplay.ui.OrangeHRAddEmployeePage.FIRST_NAME;
import static co.com.proyectobase.screenplay.ui.OrangeHRAddEmployeePage.GENDER_FEMALE;
import static co.com.proyectobase.screenplay.ui.OrangeHRAddEmployeePage.GENDER_MALE;
import static co.com.proyectobase.screenplay.ui.OrangeHRAddEmployeePage.LAST_NAME;
import static co.com.proyectobase.screenplay.ui.OrangeHRAddEmployeePage.LICENSE_EXPIRY_DATE;
import static co.com.proyectobase.screenplay.ui.OrangeHRAddEmployeePage.LOCATION;
import static co.com.proyectobase.screenplay.ui.OrangeHRAddEmployeePage.LOCATION_LIST;
import static co.com.proyectobase.screenplay.ui.OrangeHRAddEmployeePage.MARITAL_STATUS;
import static co.com.proyectobase.screenplay.ui.OrangeHRAddEmployeePage.MIDDLE_NAME;
import static co.com.proyectobase.screenplay.ui.OrangeHRAddEmployeePage.MILITARY_SERVICE;
import static co.com.proyectobase.screenplay.ui.OrangeHRAddEmployeePage.NATIONALITY;
import static co.com.proyectobase.screenplay.ui.OrangeHRAddEmployeePage.NICKNAME;
import static co.com.proyectobase.screenplay.ui.OrangeHRAddEmployeePage.OTHER_ID;
import static co.com.proyectobase.screenplay.ui.OrangeHRAddEmployeePage.SAVE_EMPLOYEE;
import static co.com.proyectobase.screenplay.ui.OrangeHRAddEmployeePage.SAVE_PERSONAL_DETAILS;
import static co.com.proyectobase.screenplay.ui.OrangeHRAddEmployeePage.SMOKER;

import co.com.proyectobase.screenplay.interactions.Select;
import co.com.proyectobase.screenplay.util.ExcelReader;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Register implements Task{

	private int i;

	public Register(int i) {

		this.i = i;
	}



	@Override
	public <T extends Actor> void performAs(T actor) {
			try {
				Thread.sleep(6000);
				actor.attemptsTo(Enter.theValue(ExcelReader.getCellData(i, 0).trim()).into(FIRST_NAME),
						Enter.theValue(ExcelReader.getCellData(i, 1).trim()).into(MIDDLE_NAME),
						Enter.theValue(ExcelReader.getCellData(i, 2).trim()).into(LAST_NAME),
						Click.on(LOCATION),				
						Select.ofTheList(LOCATION_LIST, ExcelReader.getCellData(i, 3).trim()),
						Click.on(SAVE_EMPLOYEE)
						);
				Thread.sleep(3000);
				actor.attemptsTo(Enter.theValue(ExcelReader.getCellData(i, 4).trim()).into(OTHER_ID),
						Enter.theValue(ExcelReader.getCellData(i, 5).trim()).into(DATE_OF_BIRTH),
						Click.on(MARITAL_STATUS),
						Select.ofTheList(MARITAL_STATUS, ExcelReader.getCellData(i, 6).trim()),
						Click.on(NATIONALITY),
						Select.ofTheList(NATIONALITY, ExcelReader.getCellData(i, 8).trim()),
						Enter.theValue(ExcelReader.getCellData(i, 9).trim()).into(DRIVER_LICENSE),
						Enter.theValue(ExcelReader.getCellData(i, 10).trim()).into(LICENSE_EXPIRY_DATE),
						Enter.theValue(ExcelReader.getCellData(i, 11).trim()).into(NICKNAME),
						Enter.theValue(ExcelReader.getCellData(i, 12).trim()).into(MILITARY_SERVICE));
				
				if(ExcelReader.getCellData(i, 7).trim().equals("Male"))
					{
						actor.attemptsTo(Click.on(GENDER_MALE));
					}
				else
					actor.attemptsTo(Click.on(GENDER_FEMALE));
				
				if(ExcelReader.getCellData(i, 13).trim().equals("Yes"))
				{
					actor.attemptsTo(Click.on(SMOKER));
				}
				
				actor.attemptsTo(Click.on(SAVE_PERSONAL_DETAILS));
				
			} catch (Exception e) {
			
				e.printStackTrace();
			}

	}



	public static Register WithTheFollowingData(int i) {
	
		return Tasks.instrumented(Register.class, i);
	}
	
	

}
