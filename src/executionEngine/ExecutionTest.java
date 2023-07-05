package executionEngine;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import excelUtility.ReadExcelSheet;
import keywordDriven.Action_keyword;

public class ExecutionTest {

	public static void main(String[] args) throws IOException, Exception, IllegalArgumentException, InvocationTargetException 
	{ 
	ReadExcelSheet rs = new ReadExcelSheet(); 
	rs.DemoFile(4);
		Action_keyword actionKeys = new Action_keyword();
		actionKeys.openBrowser();
		actionKeys.navigate();
		actionKeys.enterUserName();
		actionKeys.enterPassword();
		actionKeys.clickSignIn();
		actionKeys.ClickOnAddToCart();
		actionKeys.clickOnIcon();
		actionKeys.clickOnRemove();
		actionKeys.clickOnMenu();
		actionKeys.logout();
		actionKeys.closeBrowser();
		System.out.println("Test executed successfully");
	}
}