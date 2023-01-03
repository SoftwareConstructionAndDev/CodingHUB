package Bussinesslogic;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import DataAccess.DataTransferDatabase;

public class DataTransfer {
	
	static DataTransferDatabase D=new DataTransferDatabase();
	ArrayList<String> xmlFiles=new ArrayList();
	static ArrayList<String> xmlFilesnew=new ArrayList();
	
	
	public void ReadXMLFiles(File file)  {
		
		try {
			  
			DocumentBuilderFactory DoumntFac = DocumentBuilderFactory.newInstance();  
			  
			DocumentBuilder build = DoumntFac.newDocumentBuilder();  
			Document doc = build.parse(file);  
			doc.getDocumentElement().normalize();  
			NodeList nList3 = doc.getElementsByTagName("document");  
			Node arrc = nList3.item(0); 
			
			if (arrc.getNodeType() == Node.ELEMENT_NODE)   
	{  
		     Element data = (Element)arrc;  
		
		
		xmlFiles.add(data.getElementsByTagName("title").item(0).getTextContent());
		xmlFiles.add(data.getElementsByTagName("author").item(0).getTextContent());
		xmlFiles.add(data.getElementsByTagName("section").item(0).getTextContent());
		
	} 
		}
	catch(Exception e) {
		
	}
	}
	
	public void remove_spaces() {
		
		for(int i=0;i<xmlFiles.size();i++) {
			String F;
			F=xmlFiles.get(i);
			F=F.replaceAll("\\s+"," ").trim();
		  xmlFilesnew.add(F);
		  
		  
		
		}
		
		D.Send();
		
	}
	
	public static ArrayList<String> XMl() {
		
		return  xmlFilesnew;
	}
	
	public ArrayList word() {
		return D.Send_Words(2);
		
	}
	
	 static ArrayList<String> Words = new ArrayList<String>();
	 static ArrayList<Integer> Frequency = new ArrayList<Integer>();
	
	public static void removeDuplicates()
    {
		 ArrayList<String> Char = new ArrayList<String>();
		 
		 
		for(int i=0;i<xmlFilesnew.size();i++) {
 			
	 		String P=xmlFilesnew.get(i);
	 		
	 		String st[] = P.split(" ", 0);
	        for (String s: st)
	        	
	            Char.add(s);
	        
	    }
       
        ArrayList<String> newList = new ArrayList<String>();
        ArrayList<String> newList2 = new ArrayList<String>();
  
      
        for (String element : Char) {
  
            
            if (!newList.contains(element)) {
  
                newList.add(element);
            }
                        
        }
  
        for(int i=0;i<newList.size();i++) {
        
        	Words.add( newList.get(i));
        	Frequency.add(Collections.frequency(Char, newList.get(i)));
        
        }
        D.Send_Words(1);
        
    }
	public ArrayList Words() {
		
		return Words;
	}
       public ArrayList Frequency() {
		
		return Frequency;
	}
	
}
