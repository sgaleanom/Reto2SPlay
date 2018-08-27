package co.com.proyectobase.screenplay.interactions;

import java.util.List;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;


public class Select implements Interaction{

	private Target theList;
	private String theOption;
	
	public Select(Target theList, String theOption) {
		this.theList = theList;
		this.theOption = theOption;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		List<WebElement> listObjeto = theList.resolveFor(actor).findElements(By.tagName("li"));
		
		for(int i=0;i<listObjeto.size();i++) {
			if(listObjeto.get(i).getText().contains(theOption)) {
				listObjeto.get(i).click();
				break;
			}
		}
		
	}
	
	public static Select ofTheList(Target theList, String theOption) {
		return new Select(theList, theOption);
	}

}
