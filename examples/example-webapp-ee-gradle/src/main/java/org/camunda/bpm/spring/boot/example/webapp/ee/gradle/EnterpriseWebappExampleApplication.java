package org.camunda.bpm.spring.boot.example.webapp.ee.gradle;

import org.camunda.bpm.application.ProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ProcessApplication
public class EnterpriseWebappExampleApplication {
  public static void main(String[] args) {
    SpringApplication.run(EnterpriseWebappExampleApplication.class, args);
  }
}
