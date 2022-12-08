import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver wd;
	
	@BeforeMethod
	public void init() {
		wd = new ChromeDriver();
		wd.navigate().to("https://telranedu.web.app/contacts");

	}
	
	@Test
	public void loginPositiveTest() {
		// open login/reg form
		WebElement loginBtn = wd.findElement(By.xpath("//a[text()='LOGIN']"));
		loginBtn.click();
		
		// fill login/reg form
		WebElement emailInput = wd.findElement(By.xpath("//input[1]"));
		emailInput.click();
		emailInput.clear();
		emailInput.sendKeys("rosh@list.ru");
		
		WebElement passInput = wd.findElement(By.xpath("//input[2]"));
		passInput.click();
		passInput.clear();
		passInput.sendKeys("$ABcdef12345");
		
		
		// click "login" button
		wd.findElement(By.xpath("//button[1]")).click();
		// assert
//		Assert.assertTrue(wd.findElement(By.xpath("//a[@href='/add']"))!=null);

	}
	
	@AfterMethod
	public void tearDown() {
		//wd.quit();
	}
}
