package com.app;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class FoodbidsApplication implements CommandLineRunner{
	

	
	@Autowired 
	private UserRepo userRepo;
	
	public static void main(String[] args) {
		System.out.println("Application Started");
		SpringApplication.run(FoodbidsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
	}

}
