package com.codecool.expertSystem;

import java.util.Set;
import java.util.HashSet;

public class Fact {

    private String factId;
    private String description;
    private Set<String> evalIdSet;

    public Fact(String factId, String description) {
        this.factId = factId;
        this.description = description;
        this.evalIdSet = new HashSet<>();
    }

    public Set<String> getEvalIdSet() {
        return evalIdSet;
    } 

    public void setFactValueByEvalId(String evalId, boolean value) {
        //
    }
    
    public boolean getValueByEvalId(String evalId) {
        //
        return false;
    }

    public String getDescription() {
        return description;
    }
}