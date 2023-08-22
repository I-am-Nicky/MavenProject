package com.sdet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AppTest {
    @Test
    public void validUserLogin(){
       App myApp = new App();
        Assertions.assertEquals(1,myApp.userLogin("abc","abc@123"));
    }
    @Test
    public void inValidUserLogin(){
        App myApp = new App();
        Assertions.assertEquals(0,myApp.userLogin("abcd","12345"));
    }
}
