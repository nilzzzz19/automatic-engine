package com.example.actions.models;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class AvatarTest {

	    @Test
	    public void testGreet() {
	        Avatar avatar = new Avatar("TestAvatar");
	        String greeting = avatar.greet();
	        assertTrue(Arrays.asList(Avatar.greetings).contains(greeting), "Greeting should be one of the predefined ones.");
	    }
}
