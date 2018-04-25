package com.codecool.expertSystem;

class Main {

    public static void main(String[] args) {
        FactParser factParser = new FactParser();
        RuleParser ruleParser = new RuleParser("jakis plik  ");
        ESProvider esProvider = new ESProvider(factParser, ruleParser);
        esProvider.collectAnswers();
        System.out.println(esProvider.evaluate());
    }
}