package jp.study.sb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

import jp.study.sb.example.consumingrest.Quote;

@SpringBootApplication
@EnableScheduling
public class SpringBootStudyApplication {
    
    private static final Logger log = LoggerFactory.getLogger(SpringBootStudyApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStudyApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
	    return builder.build();
	}
	
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
	    return args -> {
	        Quote quote = restTemplate.getForObject(
	                "https://quoters.apps.pcfone.io/api/random",
	                Quote.class);
	        log.info(quote.toString());
	    };
	}

}
