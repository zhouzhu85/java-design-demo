package com.bridge.demo1;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class ReadXML {
    public static Object getObject(String args){
        try {
            DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document;
            document=documentBuilder.parse(new File("bridge-demo/src/config.xml"));
            NodeList className = document.getElementsByTagName("className");
            Node classNode=null;
            if (args.equals("color")){
                classNode=className.item(0).getFirstChild();
            }else if (args.equals("bag")){
                classNode=className.item(1).getFirstChild();
            }
            String cName="com.bridge.demo1."+classNode.getNodeValue();
            Class<?> c = Class.forName(cName);
            Object obj = c.newInstance();
            return obj;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
