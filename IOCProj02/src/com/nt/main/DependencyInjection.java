package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.CurrentSeasonFinder;

public class DependencyInjection {

	public static void main(String[] args) 
	{
		//Create IOC COntainer
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/ApplicationContext.xml");
		
		CurrentSeasonFinder find = ctx.getBean("csf",CurrentSeasonFinder.class);
		
		String result = find.showSeasonGenerator();
		System.out.println(result);
		
		//Container Close
		ctx.close();
		
	}

}
