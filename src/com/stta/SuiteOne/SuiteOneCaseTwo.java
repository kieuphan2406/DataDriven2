package com.stta.SuiteOne;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.stta.utility.Read_XLS;
import com.stta.utility.SuiteUtility;

public class SuiteOneCaseTwo extends SuiteOneBase{
	
	Read_XLS filePath = null;
	String TestCaseName = null;
	
	@BeforeTest
	public void checkCaseToRun(){
		init();
		filePath = TestCaseListExcelOne;
		TestCaseName = this.getClass().getSimpleName();
	}
	
	
	@Test(dataProvider = "data")
	public void SuiteOneCaseTwoTest(String DataCol1, String DataCol2, String DataCol3, String expectedResult, String DataToRun){
		System.out.println("DataCol1 "+DataCol1);
		System.out.println("DataCol2 "+DataCol2);
		System.out.println("DataCol3 "+DataCol3);
		System.out.println("expectedResult " + expectedResult);
		System.out.println("DataToRun "+DataToRun);
	}
	
	
	@DataProvider
	public Object[][] data(){
		return SuiteUtility.GetTestDataUtility(filePath, TestCaseName);
	
}
}