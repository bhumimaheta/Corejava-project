package com.utility;

public class ApplicationProperty {

	private static ApplicationProperty application=null;
	
	private ApplicationProperty()
	{
		System.out.println("Private constructor call ");
	}
	
	public static ApplicationProperty getInstance()
	{
		if(application==null)
		{
			new ApplicationProperty();
		}
		return application;
	}
}
