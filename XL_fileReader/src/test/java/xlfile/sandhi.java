package xlfile;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class sandhi {
	String filepath;
	public sandhi(String filepath, String sheetname) {
		super();
		this.filepath = filepath;
		this.sheetname = sheetname;
	}
	String sheetname ;
	
    public int rowcont() throws IOException {
    	int i=0;
    	XSSFWorkbook workbook = new XSSFWorkbook(filepath);
        XSSFSheet worksheet= workbook.getSheet(sheetname);
        i = worksheet.getPhysicalNumberOfRows();
       return i; 
    }
    public int columcount () throws IOException {
    	int j=0;
    	XSSFWorkbook workbook = new XSSFWorkbook(filepath);
        XSSFSheet worksheet = workbook.getSheet(sheetname);
        j = worksheet.getRow(0).getPhysicalNumberOfCells();
      return j;
      
    
    }
   public String getdata () {
	    String data = null;
	    XSSFWorkbook woekbook = new XSSFWorkbook();
	    XSSFSheet worksheet = woekbook.getSheet(data);
	    data = worksheet.getRow(0).getCell(0).getStringCellValue();
	    return data;
	    
   }
   public static void main(String[] args) throws IOException {
	sandhi aa = new sandhi("xl file path","saheetname");
	int row = aa.rowcont();
	System.out.println(row);
	int col = aa.columcount();
	System.out.println(col);
	for ( i)
}

}
