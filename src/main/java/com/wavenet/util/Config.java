package com.wavenet.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {

    private String loginUrl;
    private String adminUser;
    private String adminPassword;
    private String composeUrl;
    private String composeUsername;
    private String composePassword;

    public Config(){
        try {
            InputStream input = new FileInputStream(System.getProperty("user.dir")+"/config.properties");
            Properties prop = new Properties();
            prop.load(input);
            this.setLoginUrl(prop.getProperty("loginUrl"));
            this.setAdminUser(prop.getProperty("adminUser"));
            this.setAdminPassowrd(prop.getProperty("adminPassword"));
            this.setComposeUrl(prop.getProperty("composeUrl"));
            this.setComposeUsername(prop.getProperty("composeUsername"));
            this.setComposePassword(prop.getProperty("composePassword"));

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public String getLoginUrl(){
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl){
        this.loginUrl = loginUrl;
    }

    public String getAdminUser(){
        return adminUser;
    }

    public void setAdminUser(String adminUser){
        this.adminUser = adminUser;
    }

    public String getAdminPassword(){
        return adminPassword;
    }

    public void setAdminPassowrd(String adminPassword){
        this.adminPassword = adminPassword;
    }

    public String getComposeUrl(){
        return composeUrl;
    }

    public void setComposeUrl(String composeUrl){
        this.composeUrl = composeUrl;
    }

    public String getComposeUsername(){
        return composeUsername;
    }

    public void setComposeUsername(String composeUsername){
        this.composeUsername = composeUsername;
    }

    public String getComposePassword(){
        return composePassword;
    }

    public void setComposePassword(String composePassword){
        this.composePassword = composePassword;
    }
}
