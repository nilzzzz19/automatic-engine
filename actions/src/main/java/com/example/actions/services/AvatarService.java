package com.example.actions.services;

import org.springframework.stereotype.Service;

import com.example.actions.ActionsApplication;
import com.example.actions.models.Avatar;

@Service
public class AvatarService {
	
	public static void getAvatarWithGreet() {
		for(Avatar avatar:ActionsApplication.avatars) {
			System.out.println("Avatar : "+avatar.getName()+" says "+ avatar.greet());
			System.out.println();
		}
		
	}

}
