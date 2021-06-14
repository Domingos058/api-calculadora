package witsoftware.desafio.rest.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
@EnableAutoConfiguration

@SpringBootApplication
public class DesafioRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioRestApiApplication.class, args);
	}

}
