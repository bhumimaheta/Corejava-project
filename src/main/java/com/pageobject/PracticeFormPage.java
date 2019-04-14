package com.pageobject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import com.base.BasePageObject;
public class PracticeFormPage extends BasePageObject{

	public void sendFirstName(String firstname)
	{
		sendKey(By.name("firstname"), firstname);
	}
	
	public void sendLastName(String lastname)
	{
		sendKey(By.name("lastname"), lastname);
	}
	
	public void selectSex(String gender)
	{
		click(By.xpath("//input[@name='sex' and@ value='"+gender+"']"));
	}
	
	public void selectExprience(int yearsOfExprience)
	{
		click(By.xpath("//input[@name='exp' and @value='"+yearsOfExprience+"']"));
	}
	
	public void selectProfession(String profession)
	{
		click(By.xpath("//input[starts-with(@value,'"+profession+"')]"));
	}
	
	public void setDate(String date)
	{
		if(date==null)
		{
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date dateobj = new Date();
			System.out.println(dateFormat.format(dateobj));
			date=dateFormat.format(dateobj);
		}
		sendKey(By.xpath("//input[@id='datepicker']"), date);
	}	
		
}
