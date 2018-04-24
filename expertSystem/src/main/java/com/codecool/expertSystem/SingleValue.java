package com.codecool.expertSystem;
import java.util.*;

import java.util.List;
import java.util.ArrayList;

class SingleValue extends Value {

    private List<String> pattern;
    private boolean selectionType;

    public void SingleValue(String param, boolean selectionType) {
        this.pattern.add(param);
        this.selectionType = selectionType;
    }

    public List<String> getInputPattern() {
        return pattern;
    }

    public boolean getSelectionType() {
        return selectionType;
    }
}