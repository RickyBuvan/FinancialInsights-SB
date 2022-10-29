package ideas.financial.insights.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
public class FinancialInsightsController extends AbstractController {

	@GetMapping(value = "/")
	public String applicationStatus() {
		log.info("Financial Insights Application is Up and Running");
		return "Financial Insights Application is Up and Running";
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		return null;
	}
}