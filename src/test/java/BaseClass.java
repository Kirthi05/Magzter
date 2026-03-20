import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	static WebDriver driver;
	public static void browserlaunch(String browser) {
	
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}

	public static void urlLaunch(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
	}
	public static String title()
	{
		String text= driver.getTitle();
		return text;
		
	}
	public static void SendkeysValue(WebElement data, String value) {
		data.sendKeys(value);
	}
	public static void actionClick(WebElement w)
	{
		Actions a = new Actions(driver);
		a.click(w).perform();
	}
	public static void moveMouse(WebElement w)
	{
		Actions a = new Actions(driver);
		a.moveToElement(w);
	}
	public static void takeScreenshot(String name) throws IOException 
	{
		TakesScreenshot tk = (TakesScreenshot)driver;
		File src= tk.getScreenshotAs(OutputType.FILE);
		File des= new File("C:\\eclipse-java-2025-12-R-win32-x86_64\\Magzter\\src\\test\\resources\\Screenshot"+name+".png");
		FileUtils.copyFile(src,des);
	}
	public static void goTowindow(int window)
	{
		Set<String> windows = driver.getWindowHandles();
		List<String> l = new ArrayList<String>();
		l.addAll(windows);
		driver.switchTo().window(l.get(window-1));
	}
	public static void xpath(String WebElement)
	{
		driver.findElement(By.xpath(WebElement)).click();
	}
}

