package com.manu.main.report;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SelectReport
{
  
   private Report report;
   
   @Autowired
   public SelectReport(@Qualifier("hello")Report report)
   {
	   this.report=report;
   }
   public void Project()
   {
	   report.file();
	   System.out.println("project completed");
   }
}
