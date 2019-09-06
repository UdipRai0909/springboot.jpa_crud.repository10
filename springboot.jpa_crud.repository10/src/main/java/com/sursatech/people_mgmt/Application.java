package com.sursatech.people_mgmt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.sursatech.people_mgmt.service.PeopleMgmtService;


@SpringBootApplication
public class Application implements CommandLineRunner{
	
	@Autowired
	private PeopleMgmtService peopleMgmtService;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);}

	@Override
	public void run(String... args) throws Exception {
		int id = 10;
		String newEmail = "testuser3@gmail.com";
		peopleMgmtService.updatePersonEmailById(id, newEmail);
	}
}
