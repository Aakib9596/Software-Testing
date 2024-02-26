package xlfile;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class xlfilereader {

	String filepath;
	String sheetname;
	
   public xlfilereader(String filepath, String sheetname) {
		super();
		this.filepath = filepath;
		this.sheetname = sheetname;
	}
public int rowcouunt () throws IOException {
	   int i = 0;
	   XSSFWorkbook workbook = new XSSFWorkbook(filepath);
	   XSSFSheet worksheet = workbook.getSheet(sheetname);
	   return i =worksheet.getPhysicalNumberOfRows();
	   
   }
  public int columcount () throws IOException {
	  int i=0;
	  XSSFWorkbook workbook = new XSSFWorkbook(filepath);
	  XSSFSheet worksheet = workbook.getSheet(sheetname);
	  return i = worksheet.getRow(0).getPhysicalNumberOfCells();
	  
  }
 
  public String getdata (int  row , int col) throws IOException {
   String data =null;
	  XSSFWorkbook workbook = new XSSFWorkbook(filepath);
     XSSFSheet worksheet = workbook.getSheet(sheetname);
     return data = worksheet.getRow(row).getCell(col).getStringCellValue();
  
	
}

   public static void main(String[] args) throws IOException {
	 xlfilereader aa = new xlfilereader("C:\\Users\\CONCEPT\\Desktop\\AJIO.xlsx", "LOGIN");
	 int row = aa.rowcouunt();
	 System.out.println("totalnumber of row"+ row);
	 int col = aa.columcount();
	 System.out.println("total number of columm "+ col);
    for ( int i = 0;i<row;i++) {
        for (int j=0;j<col;j++) {
        	String data = aa.getdata(i, j);
        	System.out.println(data +":"+i+":"+j);
        }
    }
     }   
	 
	 
	 
	 
	 
	 
	 
}








