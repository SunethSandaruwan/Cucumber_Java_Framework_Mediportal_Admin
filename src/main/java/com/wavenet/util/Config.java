package com.wavenet.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {

    private String osVersion;
    private String url;
    private String CompName;
    private String CusEmail;
    private String WNRoleName;
    private String NewRegistryCred;
    private String NewRegistryName;
    private String NewRegistryUname;
    private String NewRegistryPassword;
    private String NewRegistryCertificate;

    private String loginUrl;
    private String composeUrl;
    private String composeUsername;
    private String composePassword;

    private String adminUser;
    private String adminPassword;



    public Config() {
        try {

            InputStream input = new FileInputStream(System.getProperty("user.dir") + "/config.properties");
            Properties prop = new Properties();
            // load a properties file
            prop.load(input);
            // get the property value and print it out

            this.setUrl(prop.getProperty("url"));
            this.setOsVersion(prop.getProperty("osversion"));
            this.setCompName(prop.getProperty("CompanyName"));
            this.setCusEmail(prop.getProperty("CustomerEmail"));
            this.setWNRoleName(prop.getProperty("WNRoleName"));
            this.setNewRegistryCred(prop.getProperty("NewRegistryCred"));
            this.setNewRegistryName(prop.getProperty("NewRegistryName"));
            this.setNewRegistryUname(prop.getProperty("NewRegistryUname"));
            this.setNewRegistryPassword(prop.getProperty("NewRegistryPassword"));
            this.setNewRegistryCertificate(prop.getProperty("NewRegistryCertificate"));


            this.setLoginUrl(prop.getProperty("loginUrl"));
            this.setComposeUrl(prop.getProperty("composeUrl"));
            this.setAdminUser(prop.getProperty("adminUser"));
            this.setAdminPassowrd(prop.getProperty("adminPassword"));
            this.setComposeUsername(prop.getProperty("composeUsername"));
            this.setComposePassword(prop.getProperty("composePassword"));




        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public String getLoginUrl(){
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl){this.loginUrl = loginUrl;
    }
    public String getComposeUrl(){
        return composeUrl;
    }

    public void setComposeUrl(String composeUrl){
        this.composeUrl = composeUrl;
    }

    public String getComposeUsername(){return composeUsername;}
    public void setComposeUsername(String composeUsername){
        this.composeUsername = composeUsername;
    }

    public String getComposePassword(){
        return composePassword;
    }

    public void setComposePassword(String composePassword){
        this.composePassword = composePassword;
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


    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getWNRoleName() {
        return WNRoleName;
    }

    public void setWNRoleName(String WNRoleName) {
        this.WNRoleName = WNRoleName;
    }

    public String getCompName() {
        return CompName;
    }

    public void setCompName(String compName) {
        this.CompName = compName;
    }

    public String getCusEmail() {
        return CusEmail;
    }

    public void setCusEmail(String cusEmail) {
        this.CusEmail = cusEmail;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNewRegistryCred() { return NewRegistryCred; }

    public void setNewRegistryCred(String NewRegistryCred) {this.NewRegistryCred = NewRegistryCred;}

    public String getNewRegistryName() { return NewRegistryName; }

    public void setNewRegistryName(String NewRegistryName) {this.NewRegistryName = NewRegistryName;}

    public String getNewRegistryUname() {return NewRegistryUname;}

    public void setNewRegistryUname(String NewRegistryUname) {this.NewRegistryUname = NewRegistryUname;}

    public String getNewRegistryPassword() {return NewRegistryPassword;}

    public void setNewRegistryPassword(String NewRegistryPassword) {this.NewRegistryPassword = NewRegistryPassword;}

    public String getNewRegistryCertificate() {return NewRegistryCertificate;}

    public void setNewRegistryCertificate(String NewRegistryCertificate) {this.NewRegistryCertificate = NewRegistryCertificate;}

}
