package co.com.proyectobase.screenplay.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.proyectobase.screenplay.questions.TheEmployeeName;
import co.com.proyectobase.screenplay.tasks.GoToMenu;
import co.com.proyectobase.screenplay.tasks.OpenPage;
import co.com.proyectobase.screenplay.tasks.Register;
import co.com.proyectobase.screenplay.tasks.SearchEmployee;
import co.com.proyectobase.screenplay.util.ExcelReader;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class OrangeHRStepDefinitions 
{
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor Juan = Actor.named("Juan");
	

	@Before
	public void InitiaConfiguration()
	{
		Juan.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^Juan needs to create an employee in the OrageHR$")
	public void juanNeedsToCreateAnEmployeeInTheOrageHR()  
	{
		Juan.wasAbleTo(OpenPage.ThePageOrangeHR());
	}

	@When("^access the add employee menu$")
	public void accessTheAddEmployeeMenu() 
	{
		Juan.attemptsTo(GoToMenu.AddEmployee());
	}
	
	@When("^he performs employee registration$")
	public void hePerformsEmployeeRegistration () throws Exception{
		
		String Path = "src\\test\\resources\\datadriven\\Libro1.xlsx";
		String SheetName = "Hoja1";
		ExcelReader.setExcelFile(Path, SheetName);
		Juan.attemptsTo(Register.WithTheFollowingData(1), SearchEmployee.WithTheFollowingData(1));
		ExcelReader.CerrarBook();
	}
	

	@Then("^the visualization of the new employee in the application$")
	public void theVisualizationOfTheNewEmployeeInTheApplication() {
		
		Juan.should(seeThat(TheEmployeeName.isPresent()));

	}
	
}
