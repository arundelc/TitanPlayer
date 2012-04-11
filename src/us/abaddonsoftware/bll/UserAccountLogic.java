/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package us.abaddonsoftware.bll;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author abaddon
 */
public class UserAccountLogic 
{
    private boolean loggedIn = false;
    

    public UserAccountLogic()
            {
                
            }
        
    public boolean isValidUsername(String username) {
    String  expression="^[a-zA-Z][a-zA-Z0-9]{2,15}$";  
    CharSequence inputStr = username;  
    Pattern pattern = Pattern.compile(expression,Pattern.CASE_INSENSITIVE);  
    Matcher matcher = pattern.matcher(inputStr);  
    return matcher.matches();  
    }
        
    public boolean isValidEmailAddress(String emailAddress)
    {  
    String  expression="^[\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";  
    CharSequence inputStr = emailAddress;  
    Pattern pattern = Pattern.compile(expression,Pattern.CASE_INSENSITIVE);  
    Matcher matcher = pattern.matcher(inputStr);  
    return matcher.matches();  
    }
        
    public boolean isValidPassword(String password) {
    String  expression="^\\w*(?=\\w*\\d)(?=\\w*[a-z])(?=\\w*[A-Z])\\w{6,11}$";  
    CharSequence inputStr = password;  
    Pattern pattern = Pattern.compile(expression);  
    Matcher matcher = pattern.matcher(inputStr);  
    return matcher.matches();  
    }

    public void setLoggedIn(boolean state) {
        loggedIn = state;
    }

    public boolean getLoggedIn() {
           return loggedIn;
    }
    
}
