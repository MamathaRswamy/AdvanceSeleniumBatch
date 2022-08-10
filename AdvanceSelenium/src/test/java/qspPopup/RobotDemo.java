package qspPopup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotDemo {
public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	driver.get("http://demowebshop.tricentis.com/");
	
	Robot robo=new Robot();
	robo.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	robo.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	robo.keyPress(KeyEvent.VK_TAB);
	robo.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	robo.keyPress(KeyEvent.VK_ENTER);
	
	robo.mouseWheel(300);	
	
}
}
