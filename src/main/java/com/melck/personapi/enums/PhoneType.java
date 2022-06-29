package com.melck.personapi.enums;

public enum PhoneType {

    HOME("Home"),
    MOBILE("Mobile"), 
    COMMERCIAL("Comercial");

        
    private final String description;  

    private PhoneType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    } 
    
}
