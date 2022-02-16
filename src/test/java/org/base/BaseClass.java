package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static TakesScreenshot ts;
	public static JavascriptExecutor js;
	public static Actions a;
	public static Robot r;
	
	public static void browserLaunch() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	public static void firefoxBrowserLaunch() {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

	}
	
	public static void edgeBrowserLaunch() {
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();

	}
	public static void maxWindow() {
		
		driver.manage().window().maximize();

	}
	
	public static void urlLaunch(String url) {
		
		driver.get(url);
	}
	
	public static void closeBrowser() {
		
		driver.close();
	}
	public static  void takeScreenshot(String pathName) throws IOException {
		
		ts = (TakesScreenshot)driver;
		File imgSrc = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(pathName);
		FileUtils.copyFile(imgSrc, des);
	}
	
	/*public static void javaScriptExecutorPassText(String passValue,WebElement targetWebElement) {
		
		js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value',",targetWebElement);

	}
	
	public static  void javaScriptExecutorGetAttribute(WebElement targetWebElement) {
		
		js =(JavascriptExecutor)driver;
		Object text = js.executeScript("return arguments[0].getAttribute('value')",targetWebElement);
		System.out.println(text);
		
	}*/
	
	public static void javaScriptExecutorClickWebElement(WebElement targetWebElement ) {
		
		js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",targetWebElement );
		
	}
	
	public static  void scrollTheWindow(WebElement targetWebElement) {
		
		js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()",targetWebElement);

	}
	
	public static  void passText(WebElement targetWebElement,String passValue) {
		
		targetWebElement.sendKeys(passValue);

	}
	
	public static void getText(WebElement targetWebElement) {
		 
		String text = targetWebElement.getText();
		System.out.println(text);
		
	}
	
	public static  void getAttribute(WebElement element, String targetWebElement) {
		
		String text = element.getAttribute(targetWebElement);
		System.out.println(text);
	}
	
	public static void clickWebElement(WebElement targetWebElement) {
		
		targetWebElement.click();

	}
	
	public static void mouseOverAction(WebElement targetWebElement) {
		
		a = new Actions(driver);
		a.moveToElement(targetWebElement).perform();

	}
	
	public static void dragAndDrop(WebElement src, WebElement desc) {
		
		a = new Actions(driver);
		a.dragAndDrop(src,desc).perform();

	}
	
	public static void doubleClickWebElement(WebElement targetWebElement) {
		
		a = new Actions(driver);
		a.doubleClick(targetWebElement).perform();
	}
	
	public static void pressTapKey() throws AWTException {
		
		r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

	}
	
	public static void selectText() throws AWTException {
		
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		
	}
	
	public static void copyText() throws AWTException {
		
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
		
	}
	
	public static void cutText() throws AWTException {
		
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);
		
	}
	
	
	public static void pasteText() throws AWTException {
		
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
	}
	
	// Multiple Window Handling
	public static void switchWindow(int index) {

		Set<String> allWindowId = driver.getWindowHandles();
		System.out.println("All Window Id = " + allWindowId);
		
		List<String> li = new ArrayList<String>();
		li.addAll(allWindowId);
		
		driver.switchTo().window(li.get(index));
	}
	
	//DropDown
	public static Select s;
	
	public static void dropDown(WebElement targetWebElement, String text) {
		
			s = new Select(targetWebElement);
			s.selectByVisibleText(text);;

	}
	
	//Fluent Wait
	public static  void fluentWait(int waitTime, int pollTime, String locator) {
		
			FluentWait<WebDriver> f = new FluentWait<WebDriver>(driver).withTimeout(waitTime, TimeUnit.SECONDS).pollingEvery(pollTime, TimeUnit.MILLISECONDS).ignoring(Throwable.class);
			f.until(ExpectedConditions.presenceOfElementLocated(By.name(locator)));
			//f.until(ExpectedConditions.elementToBeClickable(By.name(locator)));
	}
	
	//create New Excel File
	public static void createNewExcelFile(String fileName, String creSheet, int creRow, int creCell, String setData ) throws IOException {
		
			// 1. mention excel file path
			File f = new File("C:\\Users\\HP\\eclipse-workspace\\MavenCucumber\\ExcelFiles\\"+fileName+".xlsx");
				
			// 2. create object for corresponding class of format
			Workbook w = new XSSFWorkbook();
				
			// 3. create new sheet
			Sheet s = w.createSheet(creSheet);
				
			//4.create new row in sheet			
			Row r = s.createRow(creRow);
				
			//5. create new cell in row
			Cell c = r.createCell(creCell);
				
			c.setCellValue(setData);
				
			FileOutputStream fos = new FileOutputStream(f);
				
			w.write(fos);
				
			System.out.println("Writed....");
	}
	
	//create New Row
	public static void createNewRowInSheet(String fileName, String getTheSheet, int creRow, int creCell, String setData ) throws IOException {
		
			File f = new File("C:\\Users\\HP\\eclipse-workspace\\MavenTestNG\\MavenCucumber\\"+fileName+".xlsx");
			
			FileInputStream fis = new FileInputStream(f);
								
			Workbook w = new XSSFWorkbook(fis);
								
			Sheet s = w.getSheet(getTheSheet);
								
			Row r = s.createRow(creRow);
								
			Cell c = r.createCell(creCell);
								
			c.setCellValue(setData);
								
			FileOutputStream fos = new FileOutputStream(f);
								
			w.write(fos);
								
			System.out.println("Writed....");
	}
	
	//create New Cell
	public static void createNewCellInRow(String fileName, String getTheSheet, int getTheRow, int creCell, String setData ) throws IOException {
			
			File f = new File("C:\\Users\\HP\\eclipse-workspace\\MavenCucumber\\ExcelFiles\\"+fileName+".xlsx");
			
			FileInputStream fis = new FileInputStream(f);
								
			Workbook w = new XSSFWorkbook(fis);
								
			Sheet s = w.getSheet(getTheSheet);
								
			Row r = s.getRow(getTheRow);
								
			Cell c = r.createCell(creCell);
								
			c.setCellValue(setData);
								
			FileOutputStream fos = new FileOutputStream(f);
								
			w.write(fos);
								
			System.out.println("Writed....");
	}
	
	// Read datas from excel file
	public static String excelRead(String fileName,String getTheSheet,int getTheRow, int getTheCell) throws IOException{
		
			// 1. mention the excel file path
			File f = new File("C:\\Users\\HP\\eclipse-workspace\\MavenCucumber\\ExcelFiles\\"+fileName+".xlsx");
		
			// 2. to read the excel file
			FileInputStream fis = new FileInputStream(f);
		
			// 3. to read exact file format
			Workbook w = new XSSFWorkbook(fis);
		
			// 4. get sheet from workbook
			Sheet s = w.getSheet(getTheSheet);
		
			// 5. get Particular Row and cell Number
			Row r = s.getRow(getTheRow);
			
			Cell c = r.getCell(getTheCell);
			
			int cellType = c.getCellType();
			
			//if cellType is 1 ------> String cell
			//if cellType is other than 1 -----> Date cell/ Numeric cell
			
			String value;
			
			if (cellType == 1) {
				
			    value = c.getStringCellValue();
			}
			else if (DateUtil.isCellDateFormatted(c)) {
				
				Date dd = c.getDateCellValue();
				SimpleDateFormat sd = new SimpleDateFormat("dd//mm/yyyy");
			    value = sd.format(dd);
			}
			else {
				
				double d = c.getNumericCellValue();  //1.23456
				long l = (long)d;  //123456
				value = String.valueOf(l);
			}
			
			return value;
		
	}
	
	// Upadte data in excel sheet
	public static  void excelUpdate(String fileName,String getTheSheet,int geTheRow, int getTheCell, String actualValue, String updateValue) throws IOException {
		
		File f = new File("C:\\Users\\HP\\eclipse-workspace\\MavenCucumber\\ExcelFiles\\"+fileName+".xlsx");
		
		FileInputStream fis = new FileInputStream(f);
							
		Workbook w = new XSSFWorkbook(fis);
							
		Sheet s = w.getSheet(getTheSheet);
							
		Row r = s.getRow(geTheRow);
							
		Cell c = r.getCell(getTheCell);
		
		String strValue = c.getStringCellValue();
		
		if (strValue.equals(actualValue)) {
			
			c.setCellValue(updateValue);
		}
		
		FileOutputStream fos = new FileOutputStream(f);
		
		w.write(fos);
		
		System.out.println("Updated...");
	}
	
}
