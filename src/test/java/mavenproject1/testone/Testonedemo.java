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

	@Test
	public static void demo() {
		
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		System.out.println("windows maximize");
		driver.get("https://www.rameshsoft.com");
		System.out.println("executed");
		driver.close();
		System.out.println("person1 modified");
		System.out.println("modification for jenkinsgit");
		System.out.println("modification for jenkins git autoexecute");
		
		

	}
}
