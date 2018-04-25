package com.codecool.expertSystem;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


class RuleParser extends XMLParser{

    private RuleRepository ruleRepository;
    private String question;
    private String id;
    private Answer answer;
    private List<Value> values;


    public RuleParser() {

        loadXmlDocument("src/main/java/com/codecool/expertSystem/Question.xml");
        this.ruleRepository = new RuleRepository();
        values = new ArrayList<>();
    }


    public RuleRepository getRuleRepository() {
        return ruleRepository;
    }

    public void parse() {
        try {
            getDoc().getDocumentElement().normalize();
            NodeList ruleList = getDoc().getElementsByTagName("Rule");

            for(int i=0; i<ruleList.getLength(); i++) {
                Element ruleElement = (Element) ruleList.item(i);

                NodeList questionList = ruleElement.getElementsByTagName("Question");
                NodeList selectionList = ruleElement.getElementsByTagName("Selection");
                NodeList answerList = ruleElement.getElementsByTagName("SingleValue");
                if(answerList.getLength() == 0) {
                    answerList = ruleElement.getElementsByTagName("MultipleValue");
                }

                Element questionElement = (Element) questionList.item(0);

                question = questionElement.getTextContent();
                id = ruleElement.getAttribute("id");
                answer = new Answer();

                for(int j=0; j<selectionList.getLength(); j++) {
                    Element selectionElement = (Element) selectionList.item(j);
                    Element answerElement = (Element) answerList.item(j);
                    
                    if(answerElement.getAttribute("value").contains(",")) {
                        List<String> params = Arrays.asList(answerElement.getAttribute("value").split(","));
                        boolean selectionType = Boolean.valueOf(selectionElement.getAttribute("value"));
                        values.add(new MultipleValue(params, selectionType));
                    } else {
                        boolean selectionType = Boolean.valueOf(selectionElement.getAttribute("value"));
                        values.add(new SingleValue(answerElement.getAttribute("value"), selectionType));
                    }
                
                }
                for(Value value : values)
                    answer.addValue(value);

                ruleRepository.addQuestion(new Question(id, question, answer));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    


}