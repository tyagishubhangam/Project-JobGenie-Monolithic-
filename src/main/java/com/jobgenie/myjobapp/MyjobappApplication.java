package com.jobgenie.myjobapp;

//import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyjobappApplication {

	public static void main(String[] args) {
//		Dotenv dotenv = Dotenv.load();
//
//		// Optional: set as system properties so Spring can access them
//		System.setProperty("DATABASE_URL", dotenv.get("DATABASE_URL"));
//		System.setProperty("DATABASE_USERNAME", dotenv.get("DATABASE_USERNAME"));
//		System.setProperty("DATABASE_PASSWORD", dotenv.get("DATABASE_PASSWORD"));
		System.out.println("Hello World!" + System.getenv("DATABASE_URL"));
		SpringApplication.run(MyjobappApplication.class, args);
	}

}
