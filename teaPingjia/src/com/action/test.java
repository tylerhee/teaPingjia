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
		String filePath="d:\\ѧ����Ϣ.xls";

		
		FileInputStream fin=new FileInputStream(filePath);
	    HSSFWorkbook workbook=new HSSFWorkbook(fin);//����������
	    HSSFSheet sheet=workbook.getSheetAt(0);//�õ�������
	    HSSFRow row=null;//��Ӧexcel����
	    HSSFCell cell=null;//��Ӧexcel����
	   
	    int totalRow=sheet.getLastRowNum();//�õ�excel���ܼ�¼����
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
