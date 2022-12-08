import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTestIT {
	WebDriver wd;

	@BeforeMethod
	public void init() {
		wd = new ChromeDriver();
		wd.navigate().to("https://telranedu.web.app/contacts");
	}

	@Test
	public void registrationPositiveTest() {
		System.out.println("Registration Test Started");
		int i = (int) (System.currentTimeMillis() / 1000) % 3600;
		String email = "name" + i + "@mail.com";
		String password ="$Abcdef12345";

		System.out.println("Successfully Registered with Email: " + email + " and Password: " + password);


		//wd.findElement(By.xpath("//"));

	}



	@AfterMethod
	public void tearDown() {
		//wd.close();
		//wd.quit();
	}
}
