import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass{
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//li[@id='user_icon']")
	private WebElement Select;
	
	@FindBy(xpath="//a[@href='/search']")
	private WebElement Search;
	
	@FindBy(xpath="//input[@id='user-email']")
	private WebElement Input;
	
	
	public WebElement getSearch()
	{
		return Search;
	}
	public WebElement getValue()
	{
		return Input;
	}
	
	public WebElement Usericon()
	{
		return Select;
	}
	

}
