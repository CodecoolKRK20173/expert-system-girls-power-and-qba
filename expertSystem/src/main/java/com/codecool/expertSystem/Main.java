package com.codecool.expertSystem;

import java.io.IOException;

class Main {

    public static void main(String[] args) {
        try {
        FactParser factParser = new FactParser();
        RuleParser ruleParser = new RuleParser();
        ESProvider esProvider = new ESProvider(factParser, ruleParser);

        esProvider.collectAnswers();
        System.out.println(esProvider.evaluate());
        } catch(IOException e) {
            System.err.println("Wrong input !!");
        }
    }
}