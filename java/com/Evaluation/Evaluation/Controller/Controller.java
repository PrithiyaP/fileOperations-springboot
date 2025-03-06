package com.Evaluation.Evaluation.Controller;


import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.json.JSONArray;
import org.json.JSONObject;

@RestController
public class Controller {
    @PostMapping("/uploadFile")
    public ResponseEntity<String> upload(@RequestParam("excel") MultipartFile uploadfile) throws IOException {

            String name = uploadfile.getOriginalFilename();
            String filenameValid = name.substring(name.length() - 7);

            if (filenameValid.endsWith("BB.xlsx")) {         	
                Workbook workbook = new XSSFWorkbook(uploadfile.getInputStream());
                Sheet sheet = workbook.getSheetAt(0);
                JSONArray jsonArray = new JSONArray();
                
               if(sheet.getPhysicalNumberOfRows()>0) {
                for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
                    Row row = sheet.getRow(i);
                    JSONObject jsonObject = new JSONObject();
                    
                    for (int j = 0; j < row.getLastCellNum(); j++) {
                        Cell cell = row.getCell(j);
                        jsonObject.put(sheet.getRow(0).getCell(j).toString(), cell.toString());
                    System.out.println(sheet.getRow(0).getCell(j).toString());
                    System.out.println(cell.toString());
                    }
                    
                    jsonArray.put(jsonObject);
                }                              
                String json = jsonArray.toString(); 
                return new ResponseEntity<>(json, HttpStatus.OK);               
                }               
                else {
                	return new ResponseEntity<>("Content doesn't exists", HttpStatus.BAD_REQUEST);
                }
                
            } else {
                return new ResponseEntity<>("Invalid filename.", HttpStatus.BAD_REQUEST);
            }
       
    }
}

