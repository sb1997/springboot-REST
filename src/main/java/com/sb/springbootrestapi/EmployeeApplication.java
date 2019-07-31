package com.sb.springbootrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



import java.sql.Connection;
import java.sql.DriverManager;

@SpringBootApplication
@ComponentScan({"com.sb.springbootrestapi.*"})
@EnableAutoConfiguration
public class EmployeeApplication {

	public static void main(String[] args) throws Exception{
		SpringApplication.run(EmployeeApplication.class, args);


	}
}
