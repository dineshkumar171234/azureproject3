package mavenproject1.testone;

import java.util.concurrent.TimeUnit;

import javax.naming.ldap.ManageReferralControl;
import javax.net.ssl.ManagerFactoryParameters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testonedemo {
WebDriver driver;
	@Test
	public static void demo() {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		System.out.println("windows not maximized");
		driver.get("https://www.rameshsoft.com");
		System.out.println("executed");
		driver.close();
		System.out.println("person1 modified");
		System.out.println("modification for jenkinsgit");
		System.out.println("modification for jenkins git autoexecute");
		
		

	}
}
