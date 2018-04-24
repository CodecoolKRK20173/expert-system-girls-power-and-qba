package com.codecool.expertSystem;

import java.util.List;
import java.util.ArrayList;

class MultipleValue {

    private List<String> pattern;
    private boolean selectionType;

    public void multipleValue(List<String> params, boolean selectionType) {
        this.pattern.addAll(params);
        this.selectionType = selectionType;
    }

    public List<String> gestInputPattern() {
        return pattern;
    }

    public boolean getSelectionType() {
        return selectionType;
    }
}