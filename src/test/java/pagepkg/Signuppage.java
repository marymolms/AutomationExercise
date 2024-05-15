package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signuppage {
     
	WebDriver driver;
	@FindBy (xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
	WebElement signup;
	@FindBy (xpath="//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")
	WebElement name;
	@FindBy (xpath="//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")
	WebElement email;
	@FindBy (xpath="//*[@id=\"form\"]/div/div/div[3]/div/form/button")
	WebElement signupbutton ;
	
	public Signuppage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	public void signupvalues() {
		signup.click();
		name.sendKeys("nija");
		email.sendKeys("nija@gmail.com");
		signupbutton.click();
	}
}
