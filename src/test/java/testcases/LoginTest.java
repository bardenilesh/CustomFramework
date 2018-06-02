package testcases;

import org.testng.annotations.Test;
import org.testng.internal.PropertiesFile;

import pages.automationpractice.HomePage;
import pages.automationpractice.MyAccount;
import util.ExcelUtility;
import util.Global;
import util.SeleniumUtilities;

import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class LoginTest extends SeleniumUtilities{
	ExcelUtility oExcel= new ExcelUtility();
	WebDriver driver;
  @Test (priority=0)
  public void login() throws Exception {
	  	Global.dataFile=Global.workDir+"\\testData\\Data.xls";
		clickOnElement(HomePage.link_SignIn);
		Properties prop = new Properties();
		prop.load(new FileInputStream(Global.workDir+"\\src\\test\\resources\\test.properties"));
		enterText(HomePage.txtBox_Username, prop.getProperty("USERNAME"));
		enterText(HomePage.txtBox_Password, prop.getProperty("PASSWORD"));
		clickOnElement(HomePage.btn_SignIn);
		wait(4000);
		Assert.assertEquals(getTextFromWebElement(MyAccount.link_Sign_Out), "Sign out");
  }
  
  @Test (priority=1, dependsOnMethods="login")
	public void addToCart() throws Exception {
		clickOnElement(MyAccount.link_Women);
		clickOnElement(MyAccount.chkBx_Top);
		clickOnElement(MyAccount.chkBx_Size_Small);
		selectTextFromDropDown(MyAccount.drp_Product_Sort_By, oExcel.get("productsorting"));
		mouseOverOnElement(findElement(MyAccount.img_Container_Blouse));
		clickOnElement(findElement(MyAccount.img_Container_Blouse).findElement(MyAccount.btn_Add_To_Cart));
		wait(4000);

	}
  
  @BeforeClass
  public void beforeClass() {
	  driver= getRunningBrowser();
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
