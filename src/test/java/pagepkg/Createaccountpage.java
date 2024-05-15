package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Createaccountpage {
	 WebDriver driver;
	 
	@FindBy (xpath="//*[@id=\"id_gender2\"]")
     WebElement title;
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement password;
	@FindBy(xpath="//*[@id=\"days\"]")
	WebElement daydetaills;
	@FindBy(xpath="//*[@id=\"months\"]")
	WebElement monthdetails;
	@FindBy(xpath="//*[@id=\"years\"]")
	WebElement yeardetails;
	@FindBy(xpath="//*[@id=\"first_name\"]")
	WebElement firstname;
	@FindBy(xpath="//*[@id=\"last_name\"]")
	WebElement lastname;
	@FindBy(xpath="//*[@id=\"company\"]")
	WebElement company;
	@FindBy(xpath="//*[@id=\"address1\"]")
	WebElement address1;
	@FindBy(xpath="//*[@id=\"address2\"]")
	WebElement address2;
	@FindBy(xpath="//*[@id=\"country\"]")
	WebElement countrydetails;
	@FindBy(xpath="//*[@id=\"state\"]")
	WebElement state;
	@FindBy(xpath="//*[@id=\"city\"]")
	WebElement city;
	@FindBy(xpath="//*[@id=\"zipcode\"]")
	WebElement zipcode;
	@FindBy(xpath="//*[@id=\"mobile_number\"]")
	WebElement mobilenumber;
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div/div[1]/form/button")
	WebElement createaccount;
	
	
	public Createaccountpage(WebDriver driver ) {
          this.driver=driver;
          PageFactory.initElements(driver, this);
	}
	
	public void accountinformation() {
		title.click();
		password.sendKeys("hidear2023");
		Select date=new Select(daydetaills);
		date.selectByValue("22");
		Select month=new Select(monthdetails);
		month.selectByValue("6");
		Select year=new Select(yeardetails);
		year.selectByValue("1988");
	}
	public void addressinformation() {
		firstname.sendKeys("Nija");
		lastname.sendKeys("Vimal");
		company.sendKeys("Psquare");
		address1.sendKeys("puthenveedu, p o anjur");
		address2.sendKeys("vazhapilly,p o mumdur");
		Select country=new Select(countrydetails);
		country.selectByValue("India");
		state.sendKeys("Kerala");
		city.sendKeys("Thrissur");
		zipcode.sendKeys("680541");
		mobilenumber.sendKeys("9876543210");
		createaccount.click();
		
	}
}
