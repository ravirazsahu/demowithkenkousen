package com.practice.Controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;

public class HelloUnitTestController {
    
    @Test
    public void testhello(){

        HelloWorldController controller=new HelloWorldController();
        Model model=new BindingAwareModelMap();
        String result=controller.getpage("Test", model);

        assertAll(
            ()->assertEquals("Test",model.getAttribute("user")),
            ()->assertEquals("hello",result)

        );
        

    }
}
