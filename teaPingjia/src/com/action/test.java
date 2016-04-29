package com.action;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
public class test
{

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		String filePath="d:\\学生信息.xls";

		
		FileInputStream fin=new FileInputStream(filePath);
	    HSSFWorkbook workbook=new HSSFWorkbook(fin);//创建工作薄
	    HSSFSheet sheet=workbook.getSheetAt(0);//得到工作表
	    HSSFRow row=null;//对应excel的行
	    HSSFCell cell=null;//对应excel的列
	   
	    int totalRow=sheet.getLastRowNum();//得到excel的总记录条数
	    for(int i=1;i<=totalRow;i++)
	    {
	        row=sheet.getRow(i);
	        
	        cell=row.getCell(0);
	        String stuRealname=cell.getRichStringCellValue().toString();
	        
	        cell=row.getCell(1);
	        String stuSex=cell.getRichStringCellValue().toString();
	        
	        cell=row.getCell(2);
	        String stuAge=cell.getRichStringCellValue().toString();
	       
	        cell=row.getCell(3);
	        String stuXuehao=cell.getRichStringCellValue().toString();
	        
	        cell=row.getCell(4);
	        String stuZhengzhimianmao=cell.getRichStringCellValue().toString();
	        
	        cell=row.getCell(5);
	        String stuCard=cell.getRichStringCellValue().toString();
	   }
	}

}
