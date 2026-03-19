import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass{
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@href='/search']")
	private WebElement Search;
	public WebElement getSearch()
	{
		return Search;
	}

}
