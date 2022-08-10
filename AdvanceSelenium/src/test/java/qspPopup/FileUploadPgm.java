package qspPopup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPgm {
public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://www.actitime.com/contact-support");
	
	WebElement element = driver.findElement(By.id("fileupload"));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].click()", element);
	Thread.sleep(2000);
	Robot robo=new Robot();
	robo.keyPress(KeyEvent.VK_CAPS_LOCK);
	robo.keyPress(KeyEvent.VK_A);
	robo.keyPress(KeyEvent.VK_B);
	robo.keyPress(KeyEvent.VK_C);
}
}
