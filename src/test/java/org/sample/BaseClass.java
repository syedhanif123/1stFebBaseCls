package org.sample;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;

	public static void launchChrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	
	}
	public static void launchFire() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		
	}
	public static void launchEdge() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		
	}
	
	public static void loadUrl(String url) {
		driver.get(url);
	}
	

	public static void getHeading() {
		driver.getTitle();
	}
	
	public static void getCurrentUrll(String url) {
		driver.getCurrentUrl();
	}
	public static void exitBwsr() {
		driver.quit();
	}
	
	public static void winMax() {
		driver.manage().window().maximize();
	}
	
	public static void fill(WebElement ele, String val) {
		ele.sendKeys(val);
	}
	public static void btnClk(WebElement ele) {
		ele.click();
	}
	public static void closepage() {
		driver.close();
	}
	public static void printtext(WebElement ele) {
			ele.getText();
		
	}
	public static void printinputtext(WebElement ele, String val) {
		ele.getAttribute(val);
	}
	public static void waitStatic(int a) throws InterruptedException {
			Thread.sleep(a);
	}

	static Actions a = new Actions(driver);

	public static void movetomouse(WebElement ele) {
		a.moveToElement(ele).perform();
	}
	
	public static void drganddrp(WebElement src, WebElement tgt) {
		a.dragAndDrop(src, tgt).perform();
	}
	public static void doubleclk(WebElement ele) {
		a.doubleClick(ele).perform();
	}
	
	public static void rightclk(WebElement ele) {
		a.contextClick(ele).perform();
	}
	
	public static void keyDwnUp(WebElement ele, String val) {
		a.keyDown(Keys.SHIFT).sendKeys(ele,val).keyUp(Keys.SHIFT).build().perform();
	}
	
	public static void enterbtn() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	
	}
	public static void tabbtn() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	
	}
	public static void dwnarrow() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	
	}
	public static void ctrlBtn() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_CONTROL);
	
	}
	public static void shiftBtn() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_SHIFT);
	
	}
	public static void c() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
	
	}
	public static void v() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
	
	}
	public static void x() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_X);
	}
	public static void esc() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
	
	}
	public static void space() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_SPACE);
	
	}
	public static void BckSpace() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);
	
	}
	public static void AltBtn() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_ALT);
	
	}
	public static void Screenshot() {
		TakesScreenshot t = (TakesScreenshot)driver;
	}
	public static void ScrollDown(WebElement ele) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollInvoView(false)", ele);
		
	}
	public static void ScrollUp(WebElement ele) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollInvoView(true)", ele);
		
	}
	

	public static void SimpleAlert(WebElement ele) {
		Alert at = driver.switchTo().alert();
		at.accept();
	}
	public static void CnfrmAlert(WebElement ele) {
		Alert at = driver.switchTo().alert();
		at.dismiss();
	}
	public static void PromptAlert(String val) {
		Alert at = driver.switchTo().alert();
		at.sendKeys(val);
		at.accept();
		
	}

	public static void switchFrameElemet(WebElement ele) {
		driver.switchTo().frame(ele);
	}
	public static void switchFrameString(String val) {
		driver.switchTo().frame(val);
	}
	public static void switchFrameIndexPstn(int a) {
		driver.switchTo().frame(a);
	}
	public static void switchagainparent() {
		driver.switchTo().parentFrame();
	}
	public static void switchagain2main() {
		driver.switchTo().defaultContent();
	}
	
	public static void fillWithJsScirpt(WebElement ele, String val) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value', val)",ele);
		
	}
	public static void getAttributewithJsScript(WebElement ele, String val) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Object o=js.executeScript("return arguments[0].getAttribute('value')",ele);
		String s = (String)o;
		
	}
	public static void ClickWithJsScirpt(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",ele);
		
	}
	public static void HighlightElement(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style,'background:yellow;border:10px solid red'')",ele);
		
	}
	public static void TakeScreenShot() throws IOException {
		TakesScreenshot tk = (TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("");
		FileUtils.copyFile(src, des);
	}
	
	public static void movetoNextWindow() {
			String parentId=driver.getWindowHandle();
			Set<String> allId = driver.getWindowHandles();
			for (String childId : allId) {
				if (!parentId.equals(childId)) {
					driver.switchTo().window(childId);
				}
			}
	
			
			
	}
	public static void movetoselectedWindow() {
		String parentId=driver.getWindowHandle();
		Set<String> allId = driver.getWindowHandles();
		int count = 0;
		for (String childId : allId) {
			if (count==0) {
				driver.switchTo().window(childId);
			}
			count ++;
		}	
		}
		
	
	
	public static void movetoselectedWindowWithList() {
		Set<String> allId = driver.getWindowHandles();
		List<String> li = new ArrayList<String>();
		li.addAll(allId);
		int a = 0;
		String ChildId = li.get(a);
		driver.switchTo().window(ChildId);
	}
	
	public static void dropdownByIndex(WebElement ele, int a) {
		Select s = new Select(ele);
		s.selectByIndex(a);		
	}
	public static void dropdownByValue(WebElement ele, String val) {
		Select s = new Select(ele);
		s.selectByValue(val);
	}
	public static void dropdownByVisibleTxt(WebElement ele,String val) {
		Select s = new Select(ele);
		s.selectByValue(val);
	}
	public static void printAllDropdown(WebElement ele) {
		Select s = new Select(ele);
		List<WebElement> list = s.getOptions();
		for (WebElement each : list) {
			each.getText();
	}
	}
			
		public static void dropdowngetFirst(WebElement ele) {
			Select s = new Select(ele);
			s.getFirstSelectedOption();
		
	}
	public static void deselectByvalue(WebElement ele, String val) {
			Select s = new Select(ele);
			s.deselectByValue(val);
		}	
	public static void deselectByIndex(WebElement ele, int a) {
				Select s = new Select(ele);
				s.deselectByIndex(a);		

			}
	public static void deselectByVisibleTxt(WebElement ele,String val) {
				Select s = new Select(ele);
				s.deselectByVisibleText(val);
			}
	
	
	public static String getData(int rowNum, int cellNum) throws IOException {
		File f = new File ("C:\\Users\\hanif\\eclipse-workspace\\Sample\\target\\TestData\\data.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.getSheet("hanif");
		Row row = s.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		int cellType = cell.getCellType();
		String value = "";
		if (cellType==1) {
			value=cell.getStringCellValue();
		}
		else if (cellType==0) {
				if (DateUtil.isCellDateFormatted(cell)) {
					Date d = cell.getDateCellValue();
					SimpleDateFormat sim = new SimpleDateFormat("dd,MMMM,yyy");
					value = sim.format(d);
					
				}
				else {
					double d = cell.getNumericCellValue();
					long l = (long)d;
					value=String.valueOf(l);
				}
		}
		return value;
	
	}
		
			
		}
	
		
	
	

