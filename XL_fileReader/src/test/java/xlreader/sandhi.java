package xlreader;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class sandhi {
	
	String fileapth ;
	String sheetname;
	
    sandhi(String fileapth, String sheetname) {
		super();
		this.fileapth = fileapth;
		this.sheetname = sheetname;
	}


public int rowcount ()  {
	int i = 0 ;
	
	try {
		 XSSFWorkbook workbook = new XSSFWorkbook(fileapth);
		 XSSFSheet worksheet = workbook.getSheet(sheetname);
		 i =   worksheet.getPhysicalNumberOfRows();
	} catch (Exception e) {
		
	
	e.printStackTrace();
	}
	 return i ;
	 
	 }
public int columcount () {
	int i =0 ;
try {
	XSSFWorkbook workbook = new XSSFWorkbook(fileapth);
	XSSFSheet worksheet = workbook.getSheet(sheetname);
	i = worksheet.getRow(0).getPhysicalNumberOfCells();

} catch (Exception e) {


	e.printStackTrace();
}	 
	return i ;
}
public String getdata (int row ,int col) {
	 String data = null;
	
	try {
		 XSSFWorkbook workbook = new XSSFWorkbook(fileapth );
		 XSSFSheet worksheet = workbook.getSheet(sheetname);
		 data = worksheet.getRow(row).getCell(col).getStringCellValue();
	     System.out.println(data);
          
	} catch (Exception e) {
	
  e.printStackTrace();
	}
  return data ;
}  

   
	public static void main(String[] args) {
	sandhi e = new sandhi("C:\\Users\\CONCEPT\\Desktop\\AJIO.xlsx", "LOGIN");	
	int row = e.rowcount();
	System.out.println(" total number of row "+ row );
	int col = e.columcount();
	System.out.println("total number of colum"+ col );
	for (int i=0;i<row;i++)  {
		for (int j=0;j<col;j++) {
			String data = e.getdata(i, j);
			System.out.println(data+" : "+i+" : "+j);
		}
	}
	
	
	
	}	
	
	}
