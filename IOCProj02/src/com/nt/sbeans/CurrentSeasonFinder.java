package com.nt.sbeans;

import java.time.LocalDate;

public class CurrentSeasonFinder 
{
	private LocalDate date;

	//Setter Method For Setter Injection
	public void setDate(LocalDate date) 
	{
		this.date = date;
	}
	
	//Bussiness Method
	public String showSeasonGenerator()
	{
		int month = date.getMonthValue();
		if(month >=3 && month <= 6)
			return"Summer ::" +month+"::"+date.getMonth()+"::"+date.getYear();
		else if(month >= 7 & month <= 10)
			return "Rainy ::" +month+"::"+date.getMonth()+"::"+date.getYear();
		else
			return "Winter ::" +month+"::"+date.getMonth()+"::"+date.getYear();
	}
}
