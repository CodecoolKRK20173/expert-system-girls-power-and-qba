package com.codecool.expertSystem;

import java.util.List;

class MultipleValue extends Value {
    List<String> params;

<<<<<<< HEAD
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
=======
    public MultipleValue(List<String> params, boolean selectionType) {
        this.setSelectionType(selectionType);
        this.params = params;
        
    }

    public List<String> getInputPattern() {
        return params;
>>>>>>> 8348b6a77c2c858e754aa5b565c67b4a12d255d4
    }
}