package com.codecool.expertSystem;

import java.util.*;

public class ESProvider {
    private FactParser factParser;
    private RuleParser ruleParser;
    private Map<String, Answer> questionAnswer;

    public ESProvider(FactParser factParser, RuleParser ruleParser) {
        this.factParser = factParser;
        this.ruleParser = ruleParser;
    }

    public void collectAnswers() {
        Iterator<Question> questionIterator = ruleParser.getRuleRepository().getIterator();
        questionAnswer = new HashMap<>();
        Question question;

        while(questionIterator.hasNext()) {
            question = questionIterator.next();
            questionAnswer.put(question.getId(), question.getAnswer());
        }

    }

    public boolean getAnswerByQuestion(String questionId) {
        return questionAnswer.get(questionId);
    }

    public String evaluate() {
        return null;
    }
}

