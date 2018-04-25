package com.codecool.expertSystem;
import java.util.*;

import java.util.List;
import java.util.ArrayList;

class SingleValue extends Value {
    private List<String> pattern;

    public SingleValue(String param, boolean selectionType) {
        this.pattern = new ArrayList<>();
        this.pattern.add(param);
        this.setSelectionType(selectionType);
    }

    public List<String> getInputPattern() {
        return pattern;
    }
}