package com.codecool.expertSystem;

import java.util.*;

public class ESProvider {
    private FactParser factParser;
    private RuleParser ruleParser;
    private Map<String, Boolean> questionAnswer;
    private UI ui = new UI();

    public ESProvider(FactParser factParser, RuleParser ruleParser) {
        this.factParser = factParser;
        this.ruleParser = ruleParser;
    }

    public void collectAnswers() {
        Iterator<Question> questionIterator = ruleParser.getRuleRepository().getIterator();
        questionAnswer = new HashMap<>();
        Question question;
        String input;

        while(questionIterator.hasNext()) {
            question = questionIterator.next();
            input = ui.userInput(question.getQuestion());
            questionAnswer.put(question.getId(), question.getEvaluatedAnswer(input));
        }

    }

    public boolean getAnswerByQuestion(String questionId) {
        return questionAnswer.get(questionId);
    }

    public boolean isFactChoosen(Fact fact) {
        for(String evalId : fact.getEvalIdSet()) {
            if (fact.getValueByEvalId(evalId) != this.getAnswerByQuestion(evalId)) {
                return false;
            }
        }
        return true;
    }

    public String evaluate() {
        Iterator<Fact> factIterator = factParser.getFactRepository().getIterator();
        Fact fact;

        while(factIterator.hasNext()) {
            fact = factIterator.next();
            if(isFactChoosen(fact)) {
                return fact.getDescription();
            }
        } 
        return null;    
    }
}

