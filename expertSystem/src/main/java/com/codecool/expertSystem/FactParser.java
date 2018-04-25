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
        super.loadXmlDocument("Fact.xml");
        this.factRepository = new FactRepository();    
    }

    public FactRepository getFactRepository() {
        return this.factRepository;
    }

    public void parse() {

        List<Boolean> evalListBoolean = new ArrayList<>();
        NodeList factList = getDoc().getElementsByTagName("Fact");
        NodeList descriptionList = getDoc().getElementsByTagName("Description");

        for (int i = 0; i < factList.getLength(); i++) {

            Node factNode = factList.item(i);
            Node descriptionNode = descriptionList.item(i);
            Element factElement = (Element) factNode;
            Element descriptionElemet = (Element) descriptionNode;
            NodeList evalList = factElement.getElementsByTagName("Eval");
    
            String factID = factElement.getAttribute("id");
            String descriptionID = descriptionElemet.getAttribute("value");
            Fact fact = new Fact(factID, descriptionID);
            
            for (int x = 0; x < evalList.getLength(); x++) {
                Node evalNode = evalList.item(x);
                Element evalElement = (Element) evalNode;
                fact.setFactValueByEvalId(evalElement.getAttribute("id"), Boolean.valueOf(evalElement.getTextContent()));
            }
            factRepository.addFact(fact);
        }
    }
}
