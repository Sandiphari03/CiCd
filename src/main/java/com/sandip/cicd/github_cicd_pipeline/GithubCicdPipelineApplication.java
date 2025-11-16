package com.sandip.cicd.github_cicd_pipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCicdPipelineApplication {

	@GetMapping("/welcome")
	public String getWelcome(){
		return "welocme to ci cd ";

	}
	public static void main(String[] args) {
		SpringApplication.run(GithubCicdPipelineApplication.class, args);
	}

}
