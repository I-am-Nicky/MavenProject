package com.sdet;
import java.util.ResourceBundle;

public class App {
    public int userLogin(String in_user,String in_Password){
        ResourceBundle rb = ResourceBundle.getBundle("config");
        String userName = rb.getString("username");
        String userPassword = rb.getString("password");
        if(userName.equals(in_user) && userPassword.equals(in_Password)){
            return 1;
        }
        return 0;
      }

}
