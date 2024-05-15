package pagepkg;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Verifypage {
	WebDriver driver;
	@FindBy (xpath="//*[@id=\\\"header\\\"]/div/div/div/div[1]/div/a/img")
	WebElement logo;
	
	
	public Verifypage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void logoverify() {
		String actualtitle=driver.getTitle();
	String exptitle="Automation Exercise";
		if(actualtitle.equals(exptitle)) {
			System.out.println("logo is verified");
		}
		else {
			System.out.println("logo is not verified");

		}
	}
	
	public void signupverify() {
		String expurl="https://automationexercise.com/signup";
		String acturl=driver.getCurrentUrl();
		if (acturl.equals(expurl)) {
			System.out.println("signup page is  verified");
		}
		else {
			System.out.println("signup is not verified");

		}

}
}
