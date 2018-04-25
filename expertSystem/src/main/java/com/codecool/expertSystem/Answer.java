package com.codecool.expertSystem;
import java.util.List;
import java.util.ArrayList;

import java.util.*;

class Answer {
    
    private List<Value> valueList;

    public Answer() {
        this.valueList =  = new ArrayList<>();
    }
    
    public void addValue(Value value) {
        this.valueList.add(value);
    }
    
    public boolean evaluateAnswerByInput(String userInput) {
        for(Value element : this.valueList) {
            for(String value : element.getInputPattern()) {
                if(userInput.equals(value)) {
                    return element.getSelectionType();
                }
            }
        }
        return false;
    }
}