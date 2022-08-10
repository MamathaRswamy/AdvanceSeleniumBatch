package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
public LoginPage(WebDriver Driver) {
	PageFactory.initElements(Driver, this);
}
@FindBy(linkText = "Log in")
private WebElement LoginLink;

@FindBy(id = "Email")
private WebElement EmailTextField;

@FindBy(name = "Password")
private WebElement PasswordTextField;

@FindBy(xpath = "//input[@value='Log in']")
private WebElement LoginButton;

public WebElement getLoginLink() {
	return LoginLink;
}

public WebElement getEmailTextField() {
	return EmailTextField;
}

public WebElement getPasswordTextField() {
	return PasswordTextField;
}

public WebElement getLoginButton() {
	return LoginButton;
}
}
