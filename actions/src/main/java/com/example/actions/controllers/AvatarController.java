package com.example.actions.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.actions.ActionsApplication;
import com.example.actions.services.AvatarService;

@RestController
@RequestMapping("/api/v1")
public class AvatarController {


	public void populateAvatars() {
		ActionsApplication.populateAvatars();
	}

	@GetMapping("/displayall")
	public void getAvatars() {
        populateAvatars();
		AvatarService.getAvatarWithGreet();
	}

}
