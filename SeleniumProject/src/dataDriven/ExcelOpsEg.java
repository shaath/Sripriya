package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import methods.BusinessMethods;

public class ExcelOpsEg {

	public static void main(String[] args) throws IOException, InterruptedException {
		String xlPath = "D:\\SriPriyaRecordings\\Workspace\\SeleniumProject\\src\\inputData\\TestData.xlsx";
		String xlOut = "D:\\SriPriyaRecordings\\Workspace\\SeleniumProject\\src\\results\\TestRes.xlsx";
		FileInputStream fi = new FileInputStream(xlPath);

		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("EmpReg");
//		XSSFRow r = ws.getRow(4);
//		XSSFCell c = r.getCell(0);
		
//		String f = c.getStringCellValue();
//		System.out.println(f);
		
		int lastRowNum = ws.getLastRowNum();
		System.out.println(lastRowNum);
		
		BusinessMethods bm = new BusinessMethods();
		bm.OrgLaunch("firefox", "https://orangehrm.qedgetech.com");
		bm.OrgLogin("Admin", "Qedge123!@#");
		
		for (int i = 1; i <= lastRowNum; i++) {
			XSSFRow r = ws.getRow(i);
			
			String f = r.getCell(0).getStringCellValue();
			String l = r.getCell(1).getStringCellValue();
			String eid = r.getCell(2).getStringCellValue();
			
			System.out.println(f+"----"+l+"----"+eid);
			
			String res = bm.OrgEmpReg(f, l, eid);
			
			r.createCell(3).setCellValue(res);
		}
		FileOutputStream fo = new FileOutputStream(xlOut);
		wb.write(fo);
		wb.close();
		
		bm.OrgLogout();
		bm.OrgClose();
	}
		

}
