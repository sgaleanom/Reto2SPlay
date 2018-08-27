package co.com.proyectobase.screenplay.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class OrangeHRAddEmployeePage extends PageObject{
	

	public static final Target FIRST_NAME = Target.the("First name employee").located(By.id("firstName"));
	public static final Target MIDDLE_NAME = Target.the("Middle name employee").located(By.id("middleName"));
	public static final Target LAST_NAME = Target.the("Last name employee").located(By.id("lastName"));
	public static final Target LOCATION_LIST = Target.the("Location employee").located(By.id("location_inputfileddiv"));
	public static final Target LOCATION = Target.the("Location employee").located(By.xpath("//*[@id='location_inputfileddiv']/div/input"));
	public static final Target SAVE_EMPLOYEE = Target.the("Button save employee").located(By.id("systemUserSaveBtn"));
	public static final Target DATE_OF_BIRTH = Target.the("Date of birth of employee").located(By.id("date_of_birth"));
	public static final Target OTHER_ID = Target.the("Other Id of employee").located(By.id("other_id"));
	public static final Target MARITAL_STATUS = Target.the("Marital status of employee").located(By.id("marital_status_inputfileddiv"));
	public static final Target GENDER_MALE = Target.the("Radio button gender male").located(By.xpath("//LABEL[@ng-class='{disabled: form.readonly}'][text()='Male']"));
	public static final Target GENDER_FEMALE = Target.the("Radio button gender female").located(By.xpath("//LABEL[@ng-class='{disabled: form.readonly}'][text()='Female']"));
	public static final Target DRIVER_LICENSE = Target.the("Number of driver license").located(By.id("driver_license"));
	public static final Target NATIONALITY = Target.the("Nationality of employee").located(By.id("nationality_inputfileddiv"));
	public static final Target LICENSE_EXPIRY_DATE= Target.the("License expiry date").located(By.id("license_expiry_date"));
	public static final Target NICKNAME= Target.the("Nickname").located(By.id("nickName"));
	public static final Target MILITARY_SERVICE = Target.the("Military service").located(By.id("militaryService"));
	public static final Target SMOKER = Target.the("CheckBox smoker").located(By.xpath("//LABEL[@for='smoker'][text()='Smoker']"));
	public static final Target SAVE_PERSONAL_DETAILS = Target.the("Button of saver personal details").located(By.xpath("//BUTTON[@type='submit'][text()='Save']"));

	
	

}
