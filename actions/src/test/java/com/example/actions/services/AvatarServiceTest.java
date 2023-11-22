package com.example.actions.services;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.actions.models.Avatar;

public class AvatarServiceTest {

	private AvatarService avatarService;
    private List<Avatar> avatars;

    @BeforeEach
    void setUp() {
        avatars = new ArrayList<>();
        avatarService = new AvatarService(avatars);
    }

    @Test
    public void testSaveAvatar() {
        String avatarName = "Batman";
        avatarService.saveAvatar(avatarName);

        assertTrue(avatars.stream().anyMatch(avatar -> avatar.getName().equals(avatarName)),
                "Avatar should be added to the list.");
    }

    @Test
    public void testGetAvatarWithGreet() {
        avatars.add(new Avatar("Superman"));
        avatars.add(new Avatar("Ironman"));

        String result = avatarService.getAvatarWithGreet();

        assertTrue(result.contains("Superman"), "Result should contain Superman's greeting.");
        assertTrue(result.contains("Ironman"), "Result should contain Ironman's greeting.");
        // Further assertions can be added based on the expected format of the result
    }
}
