package com.manu.main.report;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class ExcelReport implements Report
{
	public ExcelReport()
	{
		System.out.println("ExcelReport:constructor");
	}
	public void file() 
	{
		System.out.println("This is ExcelReport");
	}

}
