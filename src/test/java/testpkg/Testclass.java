package testpkg;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Createaccountpage;
import pagepkg.Signuppage;
import pagepkg.Verifypage;

public class Testclass extends  Baseclass{
	@Test(priority = 1)
	public void signuptest() {
		Signuppage ob1=new Signuppage(driver);
		ob1.signupvalues();
	}
	@Test(priority = 2)
	public void verifytest() {
		Verifypage ob2=new Verifypage(driver);
		ob2.logoverify();
		ob2.signupverify();
	}
	@Test(priority = 3)
	public void createaccounttest() {
		Createaccountpage ob3=new Createaccountpage(driver);
		ob3.accountinformation();
		ob3.addressinformation();
	}

}
