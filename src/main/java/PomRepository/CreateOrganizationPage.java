package PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationPage {
	public WebDriver driver;
	WebElement listbox;
	public CreateOrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(name = "accountname")
	private WebElement orgNameTextfeild;
	@FindBy(xpath = "//input[@value='U']")
	private WebElement userRadioButton;
	@FindBy (xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement submitButton;
	@FindBy (name = "industry")
	private WebElement industryListBox;
	@FindBy (name = "accounttype")
	private WebElement typeListBox;
	
	public WebElement getOrgNameTextfeild() {
		return orgNameTextfeild;
		
	}
	public WebElement getUserRadioButton() {
		return userRadioButton;
	}
	public WebElement getSubmitButton() {
		return submitButton;
	}
	public WebElement getIndustryListBox() {
		return industryListBox;
	}
	public WebElement getTypeListBox() {
		return typeListBox;
	}

		
		
	}
	
	
	
	


