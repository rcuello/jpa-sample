/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecnologico.todoapp;

import com.tecnologico.jsf.utils.SessionUtils;
import java.io.IOException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 *
 * @author rcuello
 */
@Named(value = "loginBean")
@SessionScoped
public class LoginBean implements Serializable {

    private String userName;
    private String password;
 
    public String getUserName() {
        return userName;
    }
 
    public void setUserName(String userName) {
        this.userName = userName;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
 
    public String validateUserLogin() throws IOException {
        String navResult = "";
        boolean isValid=isValid(userName, password);
        
        if (isValid) {
            navResult = "dashboard?faces-redirect=true";
            SessionUtils.addUsername(userName);
            
        } else {
            FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                    "Invalid Login!",
                    "Please Try Again!"));
            
            navResult = "login";
        }
        return navResult;
    }
    
    private boolean isValid(String username, String password){
        boolean isValid = username.equalsIgnoreCase("admin") && password.equals("123");
        return isValid;
    }
    
}
