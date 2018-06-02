package pages.automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {
	public static By link_SignIn = By.linkText("Sign in");
	// //a[text()= 'Sign in']
	public static By txtBox_Username = By.id("email");
	
	// //*[@id='email']
	public static By txtBox_Password = By.id("passwd");
	
	public static By btn_SignIn = By.id("SubmitLogin");	
	
}
