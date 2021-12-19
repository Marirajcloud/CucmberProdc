package org.maven;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Xml {
	
	public static void xmlRead() throws ParserConfigurationException, SAXException, IOException {
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\mavenBase\\src\\test\\resources\\xl\\xmlFile.xml");
		DocumentBuilderFactory newinstance = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder =newinstance.newDocumentBuilder();
        Document doc = builder.parse(f);
		System.out.println(doc.getDocumentElement().getNodeName());
		NodeList ns = doc.getElementsByTagName("student");
		for (int i = 0; i < ns.getLength(); i++) {
			Node item = ns.item(i);
			 Element e = (Element)item;
			 System.out.println("FirstNAme : "+e.getElementsByTagName("firstname").item(0).getTextContent());
			 System.out.println("LastName :  "+ e.getElementsByTagName("lastname").item(0).getTextContent());
			 
			
		}
	}
	
public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
	xmlRead();
}
}
