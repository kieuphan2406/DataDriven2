package com.stta.SuiteTwo;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.stta.utility.Read_XLS;
import com.stta.utility.SuiteUtility;

public class SuiteTwoCaseTwo extends SuiteTwoBase{


	Read_XLS filePath = null;
	String TestCaseName = null;
	
	@BeforeTest
	public void checkCaseToRun(){
		init();
		filePath = TestCaseListExcelTwo;
		System.out.print("FilePath is: "+filePath);
		TestCaseName = this.getClass().getSimpleName();
		
		
		System.out.print("Test Case Name is: "+TestCaseName);
	}
	
	
	@Test(dataProvider = "SuiteOneCaseOneData")
	public void SuiteOneCaseOneTest(String DataCol1, String DataCol2, String expectedResult, String DataToRun){
		System.out.println("DataCol1 "+DataCol1);
		System.out.println("DataCol2 "+DataCol2);
		System.out.println("expectedResult " + expectedResult);
		System.out.println("DataToRun "+DataToRun);
	}
	
	
	@DataProvider
	public Object[][] SuiteOneCaseOneData(){
		return SuiteUtility.GetTestDataUtility(filePath, TestCaseName);
	}
	
}
