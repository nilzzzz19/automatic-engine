package com.example.actions;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ActionsApplication {

	/*
	 * public static List<Avatar> avatars = new ArrayList<>();
	 * 
	 * public static void populateAvatars() { avatars.add(new Avatar("Superman"));
	 * avatars.add(new Avatar("Ironman")); }
	 */
	public static void main(String[] args) {
		//populateAvatars();
		SpringApplication.run(ActionsApplication.class, args);
	}

}
