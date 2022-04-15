package site.metacoding.pt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class PtApplication {

	public static void main(String[] args) {
		SpringApplication.run(PtApplication.class, args);
	}

}