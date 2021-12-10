

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.BookResultPage;
import pages.LoginPage;
import wrappers.ProjectSpecificWrappers;


	public class TestCase3 extends ProjectSpecificWrappers{
	
	@BeforeClass
	public void setData() {
		testCaseName="TestCase3";
		testDescription="Book search for Designing Evolvable Web APIs with ASP.NET";
		browserName="chrome";
		dataSheetName="TC003";
		category="Smoke";
		authors="Sarwar";
	}
	
	@Test(dataProvider="fetchData")
	public void testCase3(String UN,String PW,String searchText) throws InterruptedException{
		new LoginPage(driver, test)
		.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickBookStore()
		.enterSearchText(searchText)
		.clickSearchResult(searchText)
		.getTitle();
		new BookResultPage(driver,test).clickLogOut();
		
	}

	
}