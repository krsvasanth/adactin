package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilClass {
	
	public static WebDriver driver;
	
	public WebDriver launchBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;	
	}
	public void maxiWindow() {
		driver.manage().window().maximize();

	}
	public void launchUrl(String url) {
		driver.get(url);
	}
	public void type(WebElement element,String data) {
		element.sendKeys(data);
	}
	public void btnClick(WebElement element) {
		element.click();
	}
	public void clearText(WebElement element) {
		element.clear();
	}
	public String getPageUrl() {
		String url = driver.getCurrentUrl();
		return url;
}
	public void closeAll() {
		driver.quit();
	}
	public void clkDble(WebElement element) {
		Actions a = new Actions((WebDriver) element);
		a.doubleClick(element).perform();
		}
		public void clkHold(WebElement element) {
		Actions a = new Actions((WebDriver) element);
		a.clickAndHold(element).perform();
		}
		public void clkRight(WebElement element) {
			Actions a = new Actions((WebDriver) element);
			a.contextClick(element).perform();
		}
		public void mveTo(WebElement element) {
			Actions a = new Actions((WebDriver)element);
			a.moveToElement(element).perform();
		}
		public void scrnShot() throws IOException {
			TakesScreenshot tk = (TakesScreenshot)driver;
			File src = tk.getScreenshotAs(OutputType.FILE);
			System.out.println(src);
			File f = new File("D:\\Screenshot.jpg");
			FileUtils.copyFile(src, f);
			
		}
		public void enter(WebElement element) throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		public void accAlert() {
	      Alert alert=driver.switchTo().alert();
	      alert.accept();
		}
		public void dismissAlert() {
		      Alert alert=driver.switchTo().alert();
		      alert.dismiss();
			}
		public void getTxtAlert() {
		      Alert alert=driver.switchTo().alert();
		      alert.getText();
			}
		public void parFrame() {
			driver.switchTo().parentFrame();
		}
		public void defFrame() {
			driver.switchTo().defaultContent();
		}
		public boolean chckDisplyed(WebElement element) {
			return element.isDisplayed();
			
		}
		public void chckSelected(WebElement element) {
			element.isSelected();
		}
		public void chckEnabled(WebElement element) {
			element.isEnabled();
		}
		public void jsclick(WebElement element) {
	     JavascriptExecutor js =(JavascriptExecutor)driver;
	     js.executeScript("arguments[0].click())", element);
		}
		
		public void selectbyVisibletext(WebElement element,String text) {
			Select sel = new Select(element);
			sel.selectByVisibleText(text);
		}
		
		public String getText(WebElement element) {
			return element.getText();
		}
		
}


