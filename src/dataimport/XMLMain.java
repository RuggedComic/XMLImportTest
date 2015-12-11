package dataimport;

import java.io.File;
import java.io.IOException;
import org.xml.sax.SAXException;
import xml.utils.XmlException;

public class XMLMain
	{
    	public static void main (String[] args) throws SAXException, IOException, XmlException
    		{
    			File dataFile = new File ("/data.xml");
    			XMLDataSet dataSet = new XMLDataSet (dataFile);
    			dataSet.display ();
    		}
	}	