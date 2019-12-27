package io.CodeBug.App;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//The @SpringBootApplication tells SpringBoot that this class is the starting point of our SpringBoot application
// I used scanBasePackages Attribut to set the name of the package to be scanned in my case I set it to io.CodeBug to scan all my packages

@SpringBootApplication(scanBasePackages = "io.CodeBug")
public class CodeBugMain {

	public static void main(String[] args) {

		//Set and Start th servlet container and host the APP inside it and launchs the app...
		SpringApplication.run(CodeBugMain.class, args);
		System.out.println(LocalDate.now());
	}

}
