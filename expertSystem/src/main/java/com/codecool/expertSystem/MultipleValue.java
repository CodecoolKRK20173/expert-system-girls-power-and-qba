package com.codecool.expertSystem;

import java.util.*;

class MultipleValue extends Value {
    private List<String> pattern = new ArrayList<>();
    
    public void MultipleValue(List<String> params, boolean selectionType) {
        this.pattern.addAll(params);
        this.setSelectionType(selectionType);
    }

    public List<String> getInputPattern() {
        return pattern;
    }
}