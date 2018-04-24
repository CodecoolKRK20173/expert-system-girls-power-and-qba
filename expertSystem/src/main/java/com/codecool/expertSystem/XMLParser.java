package com.codecool.expertSystem;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;

public abstract class XMLParser {
    public abstract void parse();

    public void loadXmlDocument(String xmlPath) {
    	try {
    		Document document = builder.parse(new FileInputStream(xmlPath));
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
