package com.example.actions.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.actions.models.Avatar;

@Service
public class AvatarService {

    private final List<Avatar> avatars;

    public AvatarService(List<Avatar> avatars) {
        this.avatars = avatars;
    }
    
    public void saveAvatar(String name) {
    	Avatar avatar = new Avatar(name);
    	avatars.add(avatar);
    }

    public String getAvatarWithGreet() {
    	String res="";
        for (Avatar avatar : avatars) {
            res=res+"Avatar : " + avatar.getName() + " says " + avatar.greet();
            System.out.println();
        }
        return res;
    }
}

