package pages.automationpractice;

import org.openqa.selenium.By;

public class MyAccount {
	public static By link_Sign_Out = By.linkText("Sign out");
	public static By link_Women = By.linkText("Women");
	public static By chkBx_Top = By.id("layered_category_4");
	public static By chkBx_Size_Small = By.id("layered_id_attribute_group_1");
	public static By drp_Product_Sort_By = By.id("selectProductSort");
	public static By img_Container_Blouse = By
			.xpath("//a[(@class='product-name') and contains (text(),'Faded Short Sleeve T-shirts')]/ancestor::li");
	public static By btn_Add_To_Cart = By.linkText("Add to cart");
	public static By btn_Continue_Shopping = By.xpath("//span[@title='Continue shopping']");

}
