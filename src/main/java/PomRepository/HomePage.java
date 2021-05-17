package PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLibrary.JavaScritpExectUtils;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(linkText = "Organizations")
	 private WebElement organiztionLink;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	  private WebElement administratorElement;
	@FindBy(xpath = "//a[@href='index.php?module=Home&action=index&parenttab=My Home Page']")
	private WebElement homeButton;
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	  private WebElement signOutButton;

	public WebElement getOrganiztionLink() {
		return organiztionLink;
	}

	public WebElement getAdministratorElement() {
		return administratorElement;
	}
	

	public WebElement getHomeButton() {
		return homeButton;
	}

	public WebElement getSignOutButton() {
		return signOutButton;
	}
	public void logout(WebDriver driver) throws InterruptedException {
		 JavaScritpExectUtils js=new  JavaScritpExectUtils();
		js.jscriptClick(driver, signOutButton);
		
		
	}

}

