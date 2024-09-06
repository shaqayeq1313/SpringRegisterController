package ir.freeland.springboot.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class RegistrationApplication {
	

	    public static void main(String[] args) {
	        SpringApplication.run(ir.freeland.springboot.register.RegistrationApplication.class, args);
	    }

	}
