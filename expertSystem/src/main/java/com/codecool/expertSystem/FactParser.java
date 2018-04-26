package com.codecool.expertSystem;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

class FactParser extends XMLParser {

    private FactRepository factRepository;

    public FactParser() {
        super.loadXmlDocument("src/main/java/com/codecool/expertSystem/Fact.xml");
        this.factRepository = new FactRepository();    
        parse();
    }

    public FactRepository getFactRepository() {
        return this.factRepository;
    }

    public void parse() {

        List<Boolean> evalListBoolean = new ArrayList<>();
        NodeList factList = getDoc().getElementsByTagName("Fact");
        NodeList descriptionList = getDoc().getElementsByTagName("Description");
        Node factNode;
        Node descriptionNode;
        Element factElement;
        Element descriptionElemet;
        NodeList evalList;
        String factID;
        String descriptionID;
        Fact fact;
        
        for (int i = 0; i < factList.getLength(); i++) {

            factNode = factList.item(i);
            descriptionNode = descriptionList.item(i);
            factElement = (Element) factNode;
            descriptionElemet = (Element) descriptionNode;
            evalList = factElement.getElementsByTagName("Eval");
            factID = factElement.getAttribute("id");
            descriptionID = descriptionElemet.getAttribute("value");
            fact = new Fact(factID, descriptionID);
            Node evalNode;
            Element evalElement;

            for (int x = 0; x < evalList.getLength(); x++) {
                evalNode = evalList.item(x);
                evalElement = (Element) evalNode;
                fact.setFactValueByEvalId(evalElement.getAttribute("id"),
                            Boolean.valueOf(evalElement.getTextContent()));
            }
            factRepository.addFact(fact);
        }
    }
}
