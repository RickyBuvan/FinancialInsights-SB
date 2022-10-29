package ideas.financial.insights.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

@Component
@Log4j2
public class ApachePOIExcelRead {

	public void readExcel(String fileName) {

		try (XSSFWorkbook workbook = new XSSFWorkbook(new File(fileName))) {

			XSSFSheet sheet = workbook.getSheetAt(0);

			for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
				XSSFRow row = sheet.getRow(i);
				for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
					System.out.print(row.getCell(j) + " ");
				}
				System.out.println("");
			}

		} catch (FileNotFoundException e) {
			log.error("FileNotFoundException", e);
		} catch (IOException e) {
			log.error("IOException", e);
		} catch (InvalidFormatException e) {
			log.error("InvalidFormatException", e);
		}
	}
}