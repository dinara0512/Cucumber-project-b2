package com.loop.utilities.utilities;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class ExcelUtils {
    private Sheet workSheet;
    private Workbook workBook;
    private String path;

    private static final Logger LOG = LogManager.getLogger();
    public ExcelUtils (String path,String sheetName ){
        this.path = path;
        try {
            // Open Excel file
            FileInputStream ExcelFile = new FileInputStream(path);
            // Access the required test data sheet
            workBook = WorkbookFactory.create(ExcelFile);
            workSheet = (Sheet) workBook.getSheet(sheetName);
        } catch (Exception e){
            LOG.error(e.getMessage());
            throw new RuntimeException();
        }
    }

    public String getCellData(int rowNum, int colNum) {
        Cell cell;
        try {
            cell = workSheet.getRow(rowNum).getCell(colNum);
            String cellData = cell.toString();
            return cellData;
        } catch (Exception e) {
            LOG.error(e.getMessage());
            throw new RuntimeException();
        }


//        public List<Map<String, String>> getDataListV2 () {
//            List<Map<String, String>> data = new ArrayList<>();
//            List<String> columns = getColumnsNames();
//
//            for (int i = 1; i <= rowCount(); i++) {
//                Row row = workSheet.getRow(i);
//                if (row == null) continue; // Skip empty rows
//
//                Map<String, String> rowMap = new HashMap<>();
//                for (int j = 0; j < columnCount(); j++) {
//                    Cell cell = row.getCell(j);
//                    String cellValue = "";
//
//                    if (cell != null) {
//                        switch (cell.getCellType()) {
//                            case STRING:
//                                cellValue = cell.getStringCellValue();
//                                break;
//                            case NUMERIC:
//                                if (DateUtil.isCellDateFormatted(cell)) {
//                                    cellValue = cell.getDateCellValue().toString();
//                                } else {
//                                    cellValue = Double.toString(cell.getNumericCellValue());
//                                }
//                                break;
//                            case BOOLEAN:
//                                cellValue = Boolean.toString(cell.getBooleanCellValue());
//                                break;
//                            case FORMULA:
//                                cellValue = cell.getCellFormula();
//                                break;
//                            case BLANK:
//                                cellValue = "";
//                                break;
//                            default:
//                                cellValue = cell.toString();
//                                break;
//                        }
//                    }
//
//                    rowMap.put(columns.get(j), cellValue);
//                }
//                data.add(rowMap);
//            }
//            return data;
//        }


    }
}
