package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageObject {
	
	WebDriverWait wait = new WebDriverWait(BaseTestScript.driver, 12);
	
	public void click(By by)
	{
		WebElement element = waitForElement(by);
		element.click();
	}
	
	public void sendKey(By by, String value)
	{
		WebElement element = waitForElement(by);
		element.sendKeys(value);
	}
	
	public boolean isDisplay(By by)
	{
		return BaseTestScript.driver.findElement(by).isDisplayed();
	}
	
	public WebElement waitForElement(By by)
	{
		System.out.println("wiating for element");
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
}
