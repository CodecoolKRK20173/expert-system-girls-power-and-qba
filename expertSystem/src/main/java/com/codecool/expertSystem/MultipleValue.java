package com.codecool.expertSystem;

import java.util.*;

class MultipleValue extends Value {
    private List<String> pattern;
    
    public MultipleValue(List<String> params, boolean selectionType) {
        this.pattern = new ArrayList<>();
        this.pattern.addAll(params);
        this.setSelectionType(selectionType);
    }

    public List<String> getInputPattern() {
        return pattern;
    }
}