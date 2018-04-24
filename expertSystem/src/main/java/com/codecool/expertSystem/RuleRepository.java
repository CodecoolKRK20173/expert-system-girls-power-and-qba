package com.codecool.expertSystem;

import java.util.*;

public class RuleRepository {
    private Map<String, Question> ruleRepositoryMap = new HashMap<>();

    RuleRepository() {
    }

    public void addQuestion(Question question) {
        ruleRepositoryMap.put(question.getId(), question);
    }

}
