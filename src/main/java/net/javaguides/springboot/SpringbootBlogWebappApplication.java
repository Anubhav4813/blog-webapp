package net.javaguides.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBlogWebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBlogWebappApplication.class, args);
		System.out.println("Hello from spring boot application");
	}

}
