package ideas.financial.insights;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.log4j.Log4j2;

@Log4j2
@SpringBootApplication
public class FinancialInsightsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinancialInsightsApplication.class, args);
	}
}