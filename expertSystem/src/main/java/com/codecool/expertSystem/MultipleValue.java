package com.codecool.expertSystem;

import java.util.List;

class MultipleValue extends Value {
    List<String> params;

    public MultipleValue(List<String> params, boolean selectionType) {
        this.setSelectionType(selectionType);
        this.params = params;
        
    }

    public List<String> getInputPattern() {
        return params;
    }
}