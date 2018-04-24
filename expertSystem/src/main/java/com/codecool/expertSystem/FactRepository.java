package com.codecool.expertSystem;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

class FactRepository {

    private List<Fact> factList;


    FactRepository() {
        this.factList = new ArrayList<>();
    }

    public void addFact(Fact fact) {
        factList.add(fact);
    }

    public Iterator<Fact> getIterator() {
        //Can be default iterator
        return factList.iterator();
    }
}