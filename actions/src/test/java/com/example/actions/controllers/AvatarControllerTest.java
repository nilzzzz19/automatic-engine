package com.example.actions.controllers;

import com.example.actions.services.AvatarService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest(AvatarController.class)
public class AvatarControllerTest {

    @MockBean
    private AvatarService avatarService;

    @Autowired
    private MockMvc mockMvc; //simulate HTTP requests and assert responses.

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(new AvatarController(avatarService)).build();
    }

    @Test
    public void testPopulateAvatars() throws Exception {
        String avatarName = "Batman";
        mockMvc.perform(post("/api/v1/avatar")
                .param("name", avatarName)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
        
        verify(avatarService).saveAvatar(avatarName);
    }

    @Test
    public void testGetAvatars() throws Exception {
        String expectedResponse = "Some response";
        given(avatarService.getAvatarWithGreet()).willReturn(expectedResponse);
        
        mockMvc.perform(get("/api/v1/displayall")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(expectedResponse));
    }
}

