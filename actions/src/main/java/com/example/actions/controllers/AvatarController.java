package com.example.actions.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.actions.services.AvatarService;

@RestController
@RequestMapping("/api/v1")
public class AvatarController {

	AvatarService avatarService;
	
	@Autowired
	public AvatarController(AvatarService avatarService) {
		this.avatarService=avatarService;
	}

	@PostMapping("/avatar")
	public boolean populateAvatars(@RequestParam String name) {
		avatarService.saveAvatar(name);
		return true;
	}

	@GetMapping("/displayall")
	public String getAvatars() {
		return avatarService.getAvatarWithGreet();
	}

}
