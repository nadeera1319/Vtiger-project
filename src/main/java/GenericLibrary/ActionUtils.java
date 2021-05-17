package GenericLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionUtils {
	public void moveOnElement(WebDriver driver,WebElement element) {
		Actions action=new Actions(driver);
		action.moveToElement(element);
	}
	public void moveOnElemnt(WebDriver driver,WebElement element,int x,int y) {
		Actions actions=new Actions(driver);
		actions.moveToElement(element, x, y);
		 
	}
	public void moveOnElement(WebDriver driver,int x,int y) {
		Actions action=new Actions(driver);
		action.moveByOffset(x, y);
	}
	public void dragElementAndDrop(WebDriver driver,WebElement source,WebElement dest) {
		Actions action=new Actions(driver);
		action.dragAndDrop(source, dest);
	}
	public void dragElementAndDrop(WebDriver driver,WebElement source,int x,int y) {
		Actions action=new Actions(driver);
		action.dragAndDropBy(source, x, y);
	}
	public void clickAndHoldElement(WebDriver driver,WebElement element) {
		Actions action=new Actions(driver);
		action.clickAndHold(element);
	}
	
	

}
