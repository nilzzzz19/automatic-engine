package com.example.actions;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.actions.models.Avatar;

@SpringBootApplication
public class ActionsApplication {

    public static List<Avatar> avatars = new ArrayList<>();
	
	public static void populateAvatars() {
		avatars.add(new Avatar("Superman"));
		avatars.add(new Avatar("Ironman"));
	}
	
	public static void main(String[] args) {
		populateAvatars();
		SpringApplication.run(ActionsApplication.class, args);
	}

}
