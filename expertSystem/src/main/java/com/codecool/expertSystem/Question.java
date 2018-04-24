package com.codecool.expertSystem;

public class Question {
    private String id;
    private String question;
    private Answer answer;
    private boolean evaluatedAnswer;

    public Question(String id, String question, Answer answer) {
        this.id = id;//Rule id
        this.question = question;
        this.answer = answer;

    }

    public String getId() {
        return this.id;
    }

    public String getQuestion() {
        return this.question;
    }

    public Answer getAnswer() {
        return this.answer;
    }

    public boolean getEvaluatedAnswer(String input) {
        this.evaluatedAnswer = this.answer.evaluateAnswerByInput(input);
        return this.evaluatedAnswer;
    }
}
