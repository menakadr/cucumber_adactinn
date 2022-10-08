package org.Adatinn_utilityfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Utility_BC {
	public static WebDriver driver;
	public static WebDriver get_Browser (String type)
	{
		if (type.equalsIgnoreCase("chrome")) 
		{	
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
	        driver=new ChromeDriver();		
		} 
		else if(type.equalsIgnoreCase("firefox"))
		{
			
		}     
		else if(type.equalsIgnoreCase("edge"))
		{
			
		}     
		driver.manage().window().maximize();
		return driver;
	}

	//webdriver methods
	public static void get_u(String url)
	{
		driver.get(url);
		
	}

	//webelement method
	public static void sendkeys(WebElement element ,String url_name )
	{
		element.sendKeys(url_name);
	}

	public static void clear_webelement(WebElement element)
	{
		element.clear();
	}
	public static void click_webelement(WebElement element)
	{
		element.click();
	}
	
	public static void rbutton(WebElement element)
	{
		element.click();
	}
	
	public static String getattribute_Webelement(WebElement elementname, String Attributename)
	{
		String a1 = elementname.getAttribute(Attributename);
		return a1;
	}
	public static String getText_webElement(WebElement E)
	{
		String text = E.getText();
		return text;
	}

	public static boolean is_displayed_webelement(WebElement element)
	{
		boolean a= element.isDisplayed();
	    return a;
	}

	public static void select_Dropdownvalue(WebElement e,String v)
	{
		Select  s1=new Select(e);
	    s1.selectByValue(v);
	}
    public static void select_Dropdownindex(WebElement e,int v)
    {
    	Select s2=new Select(e);
    	s2.selectByIndex(v);
    }
    
    public static void select_Dropdownvisibletext(WebElement e,String v)
    {
    	Select s3=new Select(e);
    	s3.selectByVisibleText(v);
    }
 
  
    public static void selectMethod(String s,WebElement e,String v,int i)
      {
	  if(s.equalsIgnoreCase("svalue"))
	  {
		  Select  s1=new Select(e);
		    s1.selectByValue(v);
	  }
	  else if(s.equalsIgnoreCase("sindex"))
	  {
		  Select  s1=new Select(e);
		    s1.selectByIndex(i);
	  }
	  else if (s.equalsIgnoreCase("svisibletext")) {
		  Select  s1=new Select(e);
		    s1.selectByVisibleText(v);
	  }
	  
	  }
    
    
	
    public static void screenShotMethod(String pic) throws Throwable
    {
    	TakesScreenshot js=(TakesScreenshot)driver;	
    	File source = js.getScreenshotAs(OutputType.FILE);
    	File dest = new File("C:\\Users\\user\\OneDrive\\Music\\screenshot\\img.png");
    	FileUtils.copyFile(source, dest);
    }
    public static String particular_data(int s,int row,int cell) throws IOException //particular cell
	{
    	String val = null;
		FileInputStream f=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\SeptemberProject_22\\Testcase_for _adactin.xlsx");
	    XSSFWorkbook wb = new XSSFWorkbook(f);
	    XSSFSheet sh = wb.getSheetAt(s);
	    XSSFRow r = sh.getRow(row);
	    XSSFCell c = r.getCell(cell);
	    CellType type = c.getCellType();
	    if (type.equals(CellType.STRING)) {
	    	val = c.getStringCellValue();
	        }
	    else if (type.equals(CellType.NUMERIC)) {
	    	double d = c.getNumericCellValue();
			int a=(int)d;
			val = String.valueOf(a);
			}
	        wb.close();
	        return val;
	        
	} 
  }
    
    
    
    
  

