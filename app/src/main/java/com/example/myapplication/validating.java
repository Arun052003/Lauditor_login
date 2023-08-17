package com.example.myapplication;
import java.lang.String;

public class validating {


    public boolean validate_password(String password) {
        boolean haswhitespace = false;
        boolean hasuppercase = false;
        boolean hasdigit = false;
        boolean hasempty = false;
        boolean haslenth = false;
        boolean hasspecial_char=false;
        char[] password_character = password.toCharArray();
        for(int i=0;i<password.length();i++)
        {
            if (!password.isEmpty()) {
                hasempty = true;
            }
            if (Character.isUpperCase(password_character[i])) {
                hasuppercase = true;
            }
            if (Character.isDigit(password_character[i])) {
                hasdigit = true;
            }
            if(!Character.isAlphabetic(password_character[i])&&(!Character.isDigit(password_character[i])))
            {
                hasspecial_char=true;
            }
            if (!password.contains(" ")) {
                haswhitespace = true;
            }
            if (password.length() >= 8) {
                haslenth = true;
            }
        }
        if ((hasdigit) && (hasempty) && (haslenth) && (hasdigit) && (haswhitespace) && (hasuppercase)&&(hasspecial_char)) {
            return true;
        }return  false;
    }
    public boolean validate_username(String username)
    {
        boolean haswhitespace = false;
        boolean hasuppercase = false;
        boolean hasempty = false;
        boolean haslength = false;
        boolean hasspecial_char=false;
        char[] password_character = username.toCharArray();
        for(int i=0;i<username.length();i++)
        {
            if (!username.isEmpty()) {
                hasempty = true;
            }
            if (Character.isUpperCase(password_character[i])) {
                hasuppercase = true;
            }
            if(!Character.isDigit(password_character[i]))
            {
                hasspecial_char=true;
            }
            if (!username.contains(" ")) {
                haswhitespace = true;
            }
            if (username.length() >= 8) {
                haslength = true;
            }
        }
        if ((hasempty) && (haslength) && (haswhitespace) && (hasuppercase)&&(hasspecial_char)) {
            return true;
        }return  false;
    }

}
    
    
    

