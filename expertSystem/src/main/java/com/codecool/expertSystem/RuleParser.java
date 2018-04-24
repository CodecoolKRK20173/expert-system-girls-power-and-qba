package com.codecool.expertSystem;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;


class RuleParser extends XMLParser{

    private RuleRepository ruleRepository;
    

    public RuleParser(String fileName) {
        loadXmlDocument(fileName);
        // getDoc();
    }


    public RuleRepository getRuleRepository() {
        return ruleRepository;
    }

    public void parse() {
        try {
        getDoc().getDocumentElement().normalize();
        
            System.out.println("Root element :" + getDoc().getDocumentElement().getNodeName());
                    
            NodeList nList = getDoc().getElementsByTagName("Rule");
                    
            System.out.println("----------------------------");
        
            for (int temp = 0; temp < nList.getLength(); temp++) {
        
                Node nNode = nList.item(temp);
                        
                System.out.println("\nCurrent Element :" + nNode.getNodeName());
                        
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
        
                    Element eElement = (Element) nNode;
        
                    System.out.println("Staff id : " + eElement.getAttribute("id"));
                    System.out.println("First Name : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
                    System.out.println("Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
                    System.out.println("Nick Name : " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
                    System.out.println("Salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());
        
                }
            }
            } catch (Exception e) {
            e.printStackTrace();
            }
          }
    


}