package com.codecool.expertSystem;

import java.util.List;

abstract class Value {
    private boolean selectionType;

    public abstract List<String> getInputPattern();

    public boolean getSelectionType() {
        return selectionType;
    }

    public void setSelectionType(boolean selectionType) {
        this.selectionType = selectionType;
    }
}