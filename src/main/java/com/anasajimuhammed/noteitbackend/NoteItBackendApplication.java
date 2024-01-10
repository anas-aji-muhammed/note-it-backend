package com.anasajimuhammed.noteitbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class NoteItBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoteItBackendApplication.class, args);
	}

}
