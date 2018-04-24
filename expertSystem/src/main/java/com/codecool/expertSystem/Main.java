package com.codecool.expertSystem;

class Main {

    public static void main(String[] args) {
        XMLParser parser = new RuleParser("src/main/java/com/codecool/expertSystem/Question.xml");
        parser.parse();
    }
}