package PomRepository;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLibrary.ExcelLib;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(name="user_name")
	private WebElement usernameTextField;
	@FindBy(name="user_password")
	private WebElement passwordTextField;
	@FindBy(id="submitButton")
	private WebElement loginButton;
	public WebElement getUsernameTextField() {
		return usernameTextField;
	}
	public WebElement getPasswordTextField() {
		return passwordTextField;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public void login(WebDriver driver,File abspath) throws EncryptedDocumentException, IOException {
		//File abspath=new File("./Resources/VTigerlogin.xlsx");
		ExcelLib read=new ExcelLib();
		driver.get(	read.stringCellValue(abspath,"Sheet1", 0, 0));
		System.out.println("Login page is displayed");
	//Login to application
		LoginPage login=new LoginPage(driver);
        login.getUsernameTextField().sendKeys(read.stringCellValue(abspath, "Sheet1", 0, 1));
		System.out.println("username is entered");
		login.getPasswordTextField().sendKeys(read.stringCellValue(abspath,"Sheet1", 0, 2));
		System.out.println("password is entered");
		login.getLoginButton().click();
		
		
		
	}
	

}
