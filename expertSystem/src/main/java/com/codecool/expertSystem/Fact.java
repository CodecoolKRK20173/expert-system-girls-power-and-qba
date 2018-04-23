package com.codecool.expertSystem;

import java.util.Set;
import java.util.HashSet;

class Fact {

    private String id;
    private String description;
    private Set<String> idSet;

    Fact(String id, String description) {
        this.id = id;
        this.description = description;
        this.idSet = new HashSet<>();
    }

    public Set<String> getIdSet() {
        return idSet;
    } 

    public void setFactValueById(String id, boolean value) {
        //
    }
    
    public boolean getValueById(String id) {
        //
        return false;
    }

    public String getDescription() {
        return description;
    }
}