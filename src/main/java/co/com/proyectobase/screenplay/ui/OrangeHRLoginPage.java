package co.com.proyectobase.screenplay.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://orangehrm-demo-6x.orangehrmlive.com/")

public class OrangeHRLoginPage extends PageObject
{
	public static final Target BUTTON_LOGIN = Target.the("Button Login").located(By.id("btnLogin"));
	public static final Target BUTTON_MENU_PIM = Target.the("Button menu PIM").located(org.openqa.selenium.By.xpath("//SPAN[@class='left-menu-title'][text()='PIM']"));
	public static final Target BUTTON_ADD_EMPLOYEE = Target.the("Button menu add employee").located(By.xpath("//SPAN[@class='left-menu-title'][text()='Add Employee']"));
}
