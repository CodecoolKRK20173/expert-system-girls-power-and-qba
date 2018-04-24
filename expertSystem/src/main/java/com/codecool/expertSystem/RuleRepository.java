package com.codecool.expertSystem;

import java.util.*;

public class RuleRepository {
    private List<Question> ruleRepositoryList = new ArrayList<>();

    public void addQuestion(Question question) {
        ruleRepositoryList.add(question);
    }

}
