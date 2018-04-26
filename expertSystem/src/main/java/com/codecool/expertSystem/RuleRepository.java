package com.codecool.expertSystem;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class RuleRepository {

    private List<Question> questionList;

    RuleRepository() {
        this.questionList = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        this.questionList.add(question);
    }

    public Iterator<Question> getIterator() {
        return questionList.iterator();
    }

}
