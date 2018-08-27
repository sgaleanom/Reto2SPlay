package co.com.proyectobase.screenplay.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class OrangeHRSearchPage extends PageObject{

	public static final Target BUTTON_EMPLOYEE_LIST = Target.the("Button menu employee list").located(By.id("menu_pim_viewEmployeeList"));
	public static final Target EMPLOYEE_NAME = Target.the("field employee name").located(By.id("employee_name_quick_filter_employee_list_value"));
	public static final Target BUTTON_SEARCH = Target.the("Button search").located(By.id("quick_search_icon"));
	public static final Target NAME_SEARCH = Target.the("search result name").located(By.xpath("//*[@id='employeeListTable']/tbody/tr[1]"));
	
}
