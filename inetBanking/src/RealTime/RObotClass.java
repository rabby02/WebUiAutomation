package RealTime;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RObotClass {
	
	//Robot class consist multiple mrthods like KeyPress(),KeyRelease(),MousePress(),MouseRelease(),MouseMove()
	//robot.keYpress(KeyEvent.VK_Down)
	//robot.KeyRelease(KeyEvent.VK_Down)
	//robot.mousePress(InputEvent.BUTTON1_Down_Mask)//Click on right click of mouse//
	//robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK)
	//robot.mouseMove(point.getX(),point.geY())
	
	
	public static void main(String[]args) throws AWTException, InterruptedException
	{
		
		
		System.setProperty("webdriver.gecko.driver","/Users/shaheenhaider/Downloads/geckodriver");		
	    WebDriver driver=new FirefoxDriver();
	    Robot robot=new Robot();
	    driver.get("https://www.edureka.co/");
	    driver.findElement(By.linkText("Courses")).click();
	    Thread.sleep(4000);
	    
	    robot.keyPress(KeyEvent.VK_DOWN);
	    System.out.println("a");
	    robot.keyPress(KeyEvent.VK_TAB);
	    
	    Thread.sleep(4000);
	    robot.keyPress(KeyEvent.VK_TAB);
	    System.out.println("b");
	    robot.keyPress(KeyEvent.VK_TAB);
	    Thread.sleep(4000);
	    robot.mouseMove(30, 100);
	    
	    System.out.println("c");
	    
	}
	
	

}
