package com.codecool.expertSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class Fact {

    private String factId;
    private String description;
    private Map<String, Boolean> evalIdMap;

    public Fact(String factId, String description) {
        this.factId = factId;
        this.description = description;
        this.evalIdMap = new HashMap<>();
    }

    public Set<String> getEvalIdSet() {
        return evalIdMap.keySet();
    } 

    public void setFactValueByEvalId(String evalId, boolean value) {
        evalIdMap.put(evalId, value);
    }
    
    public boolean getValueByEvalId(String evalId) {
        return evalIdMap.get(evalId);
    }

    public String getDescription() {
        return description;
    }
}