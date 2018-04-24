package com.codecool.expertSystem;
import java.util.List;
import java.util.ArrayList;

import java.util.*;

class Answer {
    List<Value> valueList = new ArrayList<>();

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