package com.manu.main;
 import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.manu.main.cfg.Appconfig;
import com.manu.main.report.SelectReport;
public class App 
{
    public static void main( String[] args )
    {
         ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
        // SelectReport bean = context.getBean(SelectReport.class);
         //bean.Project();
    }
}


