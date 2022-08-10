package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dmeo {
public static void main(String[] args) {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.dev2qa.com/demo/upload/uploadFileTest.html");
	driver.findElement(By.name("uploadFileInputBox")).click();
	
	/*
	 * WebElement ele = driver.findElement(By.name("uploadFileInputBox"));
	 * JavascriptExecutor js=(JavascriptExecutor) driver;
	 * js.executeAsyncScript("arguments[0].value='demo'", ele);
	 */
	 
}
}

