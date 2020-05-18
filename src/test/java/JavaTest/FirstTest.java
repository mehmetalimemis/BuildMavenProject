package JavaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FirstTest {

	@Test
	public void firstTest() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\chrome\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.mekasera.com/#/");
		driver.manage().window().maximize();

		// Login e-mail and password
		WebElement YourMailAdress = driver
				.findElement(By.xpath("//*[@id=\"page-top\"]/div[1]/div[2]/div/div/div[3]/div[1]/input"));
		YourMailAdress.sendKeys("mehmetali.memis@enerama.com");
		WebElement YourPassword = driver
				.findElement(By.xpath("//*[@id=\"page-top\"]/div[1]/div[2]/div/div/div[3]/div[2]/input"));
		YourPassword.sendKeys("messeto1447");

		// Submit e-mail and password
		driver.findElement(By.xpath("//*[@id=\"page-top\"]/div[1]/div[2]/div/div/div[3]/button")).click();

			Thread.sleep(5000);
		
		// Facility Dashboard
//		WebElement FacilityDashboard = driver.findElement(By.xpath("//div[@id='page-wrapper']/div[3]/div/div/div[2]/div/div/table/tbody/tr/td/button/strong"));		
//		FacilityDashboard.click();
		
		driver.findElement(By.xpath("//div[@id='page-wrapper']/div[3]/div/div/div[2]/div/div/table/tbody/tr/td/button/strong")).click();
	
		
		
	}
}
