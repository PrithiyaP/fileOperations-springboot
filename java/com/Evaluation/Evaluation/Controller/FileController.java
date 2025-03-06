package com.Evaluation.Evaluation.Controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileController {

//
//@PostMapping("/uploadFile")
//public String upload(@RequestParam("excel") MultipartFile uploadfile) throws IOException {
//	String name=uploadfile.getOriginalFilename();
//	System.out.println(name);
//	String paths=".\\excelfiles";
//	String path=".\\excelfiles\\"+uploadfile.getOriginalFilename();
//	Files.copy(uploadfile.getInputStream(), Paths.get(paths+File.separator+uploadfile.getOriginalFilename()),StandardCopyOption.REPLACE_EXISTING);
//
//	String filenamevalid=name.substring(name.length()-7);
//	System.out.println(name.endsWith("BB.xlsx"));
//	
//     if(filenamevalid.endsWith("BB.xlsx")){ 
//		FileInputStream fi=new FileInputStream(path);
//		XSSFWorkbook workbook=new XSSFWorkbook(fi);
//		XSSFSheet sheet=workbook.getSheetAt(0);
//		if(sheet.getPhysicalNumberOfRows()>0) {		
//			Iterator iterator=sheet.iterator();		
//			while (iterator.hasNext()) {
//				XSSFRow row=(XSSFRow) iterator.next();
//				Iterator celliterator=row.cellIterator();
//				while(celliterator.hasNext()) {
//					XSSFCell cell=(XSSFCell) celliterator.next();
//					switch (cell.getCellType()) {
//					case STRING:return cell.getStringCellValue();
//					case NUMERIC:System.out.print(cell.getNumericCellValue());break;	
//					case BOOLEAN :System.out.print(cell.getBooleanCellValue());break;
//					}
//					System.out.print("  ");
//				}
//				System.out.println();
//			}
//			return "content";
//		}
//		else {
//			return "Doesn't exists";
//		}
//	}
//	return "Invalid name";
//
//}
//}
	
	
	
	
//	@Value("${file.upload-dir}")
//	String FILE_DIRECTORY;
//	@PostMapping("/uploadFile")
//	public ResponseEntity<Object> fileUpload(@RequestParam("File") MultipartFile file ) throws IOException{
//		File myFile=new File(FILE_DIRECTORY+file.getOriginalFilename());
//		FileOutputStream fos=new FileOutputStream(myFile);
//		fos.write(file.getBytes());
//		fos.close();
//		return new ResponseEntity<Object>("The File uploaded",HttpStatus.OK);
//	}


	

//@PostMapping("/postfile")
//public static String postFile() throws IOException {
//
//	File file=new File(path);
//	String filename=file.getName();
//	String filenamevalid=filename.substring(filename.length()-7);
//
//	if(filenamevalid.equals("BB.xlsx")){
//		FileInputStream fi=new FileInputStream(path);
//		XSSFWorkbook book=new XSSFWorkbook(fi);
//		XSSFSheet sheet=book.getSheetAt(0);
//
//		if(sheet.getPhysicalNumberOfRows()>0) {
//		return "content";
//		}
//		else {
//			return "Doesn't exists";
//		}			
//	}
//	return "Invalid name";
//
//}	


	
	
	
}
	
	 

