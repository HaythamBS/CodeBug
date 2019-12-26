package io.CodeBug.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//The @SpringBootApplication tells SpringBoot that this class is the starting point of our SpringBoot application

@SpringBootApplication
public class CodeBugMain {

	public static void main(String[] args) {

		//Set and Start th servlet container and host the APP inside it and launchs the app...
		SpringApplication.run(CodeBugMain.class, args);
	}

}
