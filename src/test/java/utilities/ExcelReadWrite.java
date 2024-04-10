package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWrite {

	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static CellStyle style;
	
	public static FileInputStream fin;
	public static HSSFWorkbook wbook;
	public static HSSFSheet wsheet;
	public static HSSFRow row1;
	public static HSSFCell cell1;
	public static FileOutputStream fou;
	
	public static int getRowCount(String xlfile, String sheetName) throws IOException 
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi); 
		ws=wb.getSheet(sheetName);
		int rowcount=ws.getLastRowNum();
		wb.close();
		fi.close();
		return rowcount;		
	}
	
	public static int getCellCount(String xlfile, String sheetName,int rownum) throws IOException
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(sheetName);
		row=ws.getRow(rownum);
		int cellcount=row.getLastCellNum();
		wb.close();
		fi.close();
		return cellcount;
	}
	
	public static String getCellData(String xlfile,String xlsheet,int rownum,int colnum) throws IOException{
		
		//To read data from excel sheet
		
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rownum);
		cell=row.getCell(colnum);
	
		String data;
		try 
		{
			
			DataFormatter formatter = new DataFormatter();
            data = formatter.formatCellValue(cell);
            return data;
		}
		catch (Exception e) 
		{
			data="";         //Returns empty string value for unavailable cell
		}
		
		wb.close();
		fi.close();
		
		return data;
	}
public static String getCellDataS(String xlfile,String xlsheet,int rownum,int colnum) throws IOException{
		
		//To read data from excel sheet
		
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rownum);
		cell=row.getCell(colnum);
	
		String data;
		try 
		{
			
			data=cell.toString();
            return data;
		}
		catch (Exception e) 
		{
			data="";         //Returns empty string value for unavailable cell
		}
		
		wb.close();
		fi.close();
		
		return data;
	}
	
	

	public static void setCellData(String xlfile,String xlsheet,int rownum,int colnum,String data) throws IOException{
		
		//To write data into excel sheet
		
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rownum);
		if (row == null) {
	        row = ws.createRow(rownum);
	    }
		cell=row.createCell(colnum);
		cell.setCellValue(data);        //Passing new cell data
		fo=new FileOutputStream(xlfile);
		wb.write(fo);		
		wb.close();
		fi.close();
		fo.close();
				
	}
	
	public static void setCellDataXls(String xlfile,String xlsheet,int rownum,int colnum,String data) throws IOException{
		
		//To write data into excel sheet
		
		fin=new FileInputStream(xlfile);
		wbook=new HSSFWorkbook(fin);
		wsheet=wbook.getSheet(xlsheet);
		row1=wsheet.getRow(rownum);
		if (row1 == null) {
	        row1 = wsheet.createRow(rownum);
	    }
		cell1=row1.createCell(colnum);
		cell1.setCellValue(data);        //Passing new cell data
		fou=new FileOutputStream(xlfile);
		wbook.write(fou);		
		wbook.close();
		fin.close();
		fou.close();
				
	}
	
	public static void fillGreenColor(String xlfile,String xlsheet,int rownum,int colnum) throws IOException
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rownum);
		cell=row.getCell(colnum);
		
		style=wb.createCellStyle();
		
		style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND); 
				
		cell.setCellStyle(style);
		fo=new FileOutputStream(xlfile);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
	}
	
	
	public static void fillRedColor(String xlfile,String xlsheet,int rownum,int colnum) throws IOException
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rownum);
		cell=row.getCell(colnum);
		
		style=wb.createCellStyle();
		
		style.setFillForegroundColor(IndexedColors.RED.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);  
		
		cell.setCellStyle(style);		
		fo=new FileOutputStream(xlfile);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
	}
}
