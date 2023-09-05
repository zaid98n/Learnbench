package seleniumpg;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class tagcount {

	private static final String xmlfilepath = "D:\\xmltest.xml";
	 
    public static void main(String argv[]) throws ParserConfigurationException, SAXException, IOException {
 
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
 
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
 
            Document document = documentBuilder.parse(xmlfilepath);
 
            NodeList nodeList = document.getElementsByTagName("book");
 
            System.out.println("Number of elements with tag name book : " + nodeList.getLength());
 
    }
	
}
