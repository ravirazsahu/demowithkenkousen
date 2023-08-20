package com.practice.Controller;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.kenkousen.tutorials.demowithkenkousen.DemowithkenkousenApplication;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@SpringBootTest(classes = HelloWorldController.class)  // Update with the correct class name
// @WebMvcTest
public class HelloWebTestController {

    //I have added below code with @webmvctest annotation ,somwhow it didn't work.This because 
    // of different package of main class(DemowithkenkousenApplication.java) and the controller.
    // @Autowired
    // private MockMvc mvc;

     @Test
    public void testhelloapi(){
        MockMvc mvc = MockMvcBuilders.standaloneSetup(new HelloWorldController()).build();

        try {
            mvc.perform(get("/hello").accept(MediaType.TEXT_HTML))
            .andExpect(status().isOk())
            .andExpect(view().name("hello"))
            .andExpect(model().attribute("user", "world"));

            
        } catch (Exception e) {
        
            e.printStackTrace();
        }

        
        

    }

}
