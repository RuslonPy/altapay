package uz.altapayocto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class AltapayApplication {

	public static void main(String[] args) {
		SpringApplication.run(AltapayApplication.class, args);
	}

}
