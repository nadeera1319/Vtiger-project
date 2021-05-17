package GenericLibrary;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectUtils {

	WebElement element;

	public void selectBy( WebElement listBox,String input) throws InterruptedException {

		Select select=new Select(listBox);
		if(input=="0") {
			select.selectByIndex(0);
		}
		List<WebElement> options = select.getOptions();
		 for(WebElement option:options) {
		 String optionText=option.getText();
		 String optionValue=option.getAttribute("value");
		 try {
			 
		 
		 if(input.equals(optionText)) { 
			 select.selectByVisibleText(input);;
		 
		  } else if(input.equals(optionValue)) {
		  select.selectByValue(input);
		  } 
		 }
		 catch(Exception e) {
		    
			  int index=Integer.parseInt(input);
		   select.selectByIndex(index); 
		   } 
		 
		 }
		










	}

}
