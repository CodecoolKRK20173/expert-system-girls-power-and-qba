package com.codecool.expertSystem;
import java.util.*;

class SingleValue extends Value {
    String param;
    

    public SingleValue(String param, boolean selectionType) {
        this.setSelectionType(selectionType);
        this.param = param;
        
    }

    public List<String> getInputPattern() {
        List<String> paramList = new ArrayList<>();
        paramList.add(param);
        return paramList;
    }
}