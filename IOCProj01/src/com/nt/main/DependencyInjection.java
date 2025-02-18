package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjection {

	public static void main(String[] args) 
	{
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/ApplicationContext.xml");
		
		WishMessageGenerator generator = ctx.getBean("wmg",WishMessageGenerator.class);
		String result = generator.showWishMessage("Raj");
		System.out.println("Result Is :: " +result);
		ctx.close();
	}

}
