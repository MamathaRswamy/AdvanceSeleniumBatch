package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.LoginPage;

public class usingData {
@Test(dataProvider = "test data" , dataProviderClass = ReadExcel.class)
public void reading(String un, String pwd) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com/");
	LoginPage Login=new LoginPage(driver);
	Login.getLoginLink().click();
	Login.getEmailTextField().sendKeys(un);
	Login.getPasswordTextField().sendKeys(pwd);
	Login.getLoginButton().click();
	
	driver.quit();

}
}
