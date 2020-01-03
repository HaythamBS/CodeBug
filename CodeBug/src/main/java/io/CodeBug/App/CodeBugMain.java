package io.CodeBug.App;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//The @SpringBootApplication tells SpringBoot that this class is the starting point of our SpringBoot application
// I used scanBasePackages Attribut to set the name of the package to be scanned in my case I set it to io.CodeBug to scan all my packages

@SpringBootApplication(scanBasePackages = "io.CodeBug")
@EnableJpaRepositories("io.CodeBug")
@EntityScan("io.CodeBug")
public class CodeBugMain {

	public static void main(String[] args) {

		//Set and Start th servlet container and host the APP inside it and launchs the app...
		SpringApplication.run(CodeBugMain.class, args);
		
		//We can dot the Thing above otherwise
		// Here we are instantiating The "SpringApplication" class
		//The SpringApplication class lets configure how your app behaves and you have control over "ApplicationContext"
		SpringApplication app = new SpringApplication(CodeBugMain.class);
		app.run(args);
		
		
		//We can Bootstrap our spring application in another manner using the "SpringApplicationBuilder" class
		//The SpringApplicationBuilder class is responsable for instantiating the SpringApplication and ApplicationContext classes
		//Fluent API is used here
		new SpringApplicationBuilder()
		.sources(CodeBugMain.class)
		.run(args);
		
		
		
		
	}

}
