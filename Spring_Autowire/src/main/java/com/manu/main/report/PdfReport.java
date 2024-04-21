package com.manu.main.report;

import org.springframework.stereotype.Component;

@Component("hello")
public class PdfReport implements Report
{
	public PdfReport()
	{
		System.out.println("pdf report");
	}
	@Override
	public void file() 
	{
		System.out.println("this is pdf report");
	}

}
