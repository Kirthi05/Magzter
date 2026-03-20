import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class Sample extends BaseClass
{
	@Test
	public void test() throws InterruptedException {
		
		browserlaunch("chrome");
		HomePage h = new HomePage();
		urlLaunch("https://www.magzter.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		h.Usericon().click();
		h.getValue().sendKeys("kiruthikavel98@gmail.com");
		driver.findElement(By.xpath("//button[@id='continue_btn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Kirthi*5");
		driver.findElement(By.xpath("//button[@id='continue_btn']")).click();
		h.getSearch().click();
		driver.findElement(By.xpath("//input[@id='input-field']")).sendKeys("sports");
		
		
		//driver.findElement(By.xpath("(//p[text()='View All '])[3]")).click();
		
		
		
		
		
	}
	
}
