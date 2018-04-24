package com.codecool.expertSystem;

import java.util.List;

class MultipleValue extends Value {

    private List<String> pattern;
    private boolean selectionType;

    public void MultipleValue(List<String> params, boolean selectionType) {
        this.pattern.addAll(params);
        this.selectionType = selectionType;
    }

    public List<String> getInputPattern() {
        return pattern;
    }

    public boolean getSelectionType() {
        return selectionType;
    }
}