package com.codecool.expertSystem;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.util.*;

class Answer {
    
    private List<Value> valueList;

    public Answer() {
        this.valueList = new ArrayList<>();
    }

    
    public void addValue(Value value) {
        this.valueList.add(value);
    }
    
    public boolean evaluateAnswerByInput(String userInput) throws IOException {
        for(Value element : this.valueList) {
            for(String value : element.getInputPattern()) {
                if(userInput.equals(value)) {
                    return element.getSelectionType();
                }
            }
        }
        throw new IOException();
        // return false;
    }
}