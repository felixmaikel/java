

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@EnableAutoConfiguration
@ComponentScan("es.tour.controllers, es.tour.services, es.tour.dataaccess")
@ImportResource("classpath:es/tour/spring/config/spring-config.xml")
public class Application {

	public static void main(String [] args) {
		SpringApplication.run(Application.class, args);
	}
	
}
