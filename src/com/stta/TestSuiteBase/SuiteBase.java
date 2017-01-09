package com.stta.TestSuiteBase;



import org.apache.log4j.Logger;

import com.stta.utility.Read_XLS;

public class SuiteBase {

	public static Read_XLS TestSuiteListExcel = null;
	public static Read_XLS TestCaseListExcelOne = null;
	public static Read_XLS TestCaseListExcelTwo = null;
	public static Logger Add_Log = null;
	
	
	public void init(){
		
		Add_Log = Logger.getLogger("rootLogger");	
		
		TestSuiteListExcel = new  Read_XLS(System.getProperty("user.dir")+"/src/com/stta/ExcelFiles/TestSuiteList.xls");
		TestCaseListExcelOne = new Read_XLS(System.getProperty("user.dir")+"/src/com/stta/ExcelFiles/SuiteOne.xls");
		TestCaseListExcelTwo = new Read_XLS(System.getProperty("user.dir")+"/src/com/stta/ExcelFiles/SuiteTwo.xls");
		
		Add_Log.info("All Excel Files Initialised successfully.");		
	}
}
