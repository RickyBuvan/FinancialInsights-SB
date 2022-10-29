package ideas.financial.insights.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ideas.financial.insights.model.PathModel;
import ideas.financial.insights.utils.ApachePOIExcelRead;

@RestController
@RequestMapping("/excel")
@EnableAutoConfiguration
public class ExcelController {

	@Autowired
	ApachePOIExcelRead apachePOIExcelRead;

	@PostMapping(value = "/read", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void applicationStatus(@RequestBody PathModel pathModel) {
		apachePOIExcelRead.readExcel(pathModel.getPath());
	}
}