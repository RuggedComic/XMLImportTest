package dataimport;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import xml.utils.XmlDocument;
import xml.utils.XmlException;
import xml.utils.XmlNode;

public class XMLDataSet
	{	
		private int			  SuiteOrSingle;
		private int			  TestID;

	    private List <String> CustomerData;
	    private List <String> CustomerOptional;
	    private List <String> ExpectedResults;
	    
		private String		  ConfigFile;
		private String		  dB;
		private String		  Table;
		private String		  UID;
		private String		  PWD;
		private String		  SuiteName;
		private String		  TestName;

		public XMLDataSet (File xml) throws XmlException
			{
				CustomerData     		= new ArrayList <String> ();
				CustomerOptional 		= new ArrayList <String> ();
				ExpectedResults  		= new ArrayList <String> ();
				
				loadFromXml (xml);
			}

		private void loadFromXml (File xml) throws XmlException
    		{
        		XmlDocument document	= new XmlDocument ();
        		XmlNode root 			= document.parse (xml);

        		SuiteOrSingle			= Integer.parseInt (root.getTagValue ("SuiteOrSingle"));
        		TestID        			= Integer.parseInt (root.getTagValue ("TestID"));
        		
        		ConfigFile    			= root.getTagValue ("ConfigFile");
        		dB            			= root.getTagValue ("dB");
        		Table         			= root.getTagValue ("Table");
        		UID           			= root.getTagValue ("UID");
        		PWD           			= root.getTagValue ("PWD");
        		SuiteName     			= root.getTagValue ("SuiteName");
        		TestName      			= root.getTagValue ("TestName");

                XmlNode CustomerDataLevelNode	 = root.getNodesByTagName ("CustomerData").get (0);
                List <XmlNode> custdat			 = CustomerDataLevelNode.getNodesByTagName ("Title");
                for (XmlNode xmlNode : custdat)
                	{
                		CustomerData.add (xmlNode.getNodeValue ());
                	}
                CustomerDataLevelNode			 = root.getNodesByTagName ("CustomerData").get (0);
                custdat							 = CustomerDataLevelNode.getNodesByTagName ("GivenName");
                for (XmlNode xmlNode : custdat)
                	{
                		CustomerData.add (xmlNode.getNodeValue ());
                	}
                CustomerDataLevelNode			 = root.getNodesByTagName ("CustomerData").get (0);
                custdat							 = CustomerDataLevelNode.getNodesByTagName ("FamilyName");
                for (XmlNode xmlNode : custdat)
                	{
                		CustomerData.add (xmlNode.getNodeValue ());
                	}
                CustomerDataLevelNode			 = root.getNodesByTagName ("CustomerData").get (0);
                custdat							 = CustomerDataLevelNode.getNodesByTagName ("Status");
                for (XmlNode xmlNode : custdat)
                	{
                		CustomerData.add (xmlNode.getNodeValue ());
                	}
                CustomerDataLevelNode			 = root.getNodesByTagName ("CustomerData").get (0);
                custdat							 = CustomerDataLevelNode.getNodesByTagName ("PPSN");
                for (XmlNode xmlNode : custdat)
                	{
                		CustomerData.add (xmlNode.getNodeValue ());
                	}
                CustomerDataLevelNode			 = root.getNodesByTagName ("CustomerData").get (0);
                custdat							 = CustomerDataLevelNode.getNodesByTagName ("Addr1");
                for (XmlNode xmlNode : custdat)
                	{
                		CustomerData.add (xmlNode.getNodeValue ());
                	}
                CustomerDataLevelNode			 = root.getNodesByTagName ("CustomerData").get (0);
                custdat							 = CustomerDataLevelNode.getNodesByTagName ("Addr2");
                for (XmlNode xmlNode : custdat)
                	{
                		CustomerData.add (xmlNode.getNodeValue ());
                	}
                CustomerDataLevelNode			 = root.getNodesByTagName ("CustomerData").get (0);
                custdat							 = CustomerDataLevelNode.getNodesByTagName ("Addr3");
                for (XmlNode xmlNode : custdat)
                	{
                		CustomerData.add (xmlNode.getNodeValue ());
                	}
                CustomerDataLevelNode			 = root.getNodesByTagName ("CustomerData").get (0);
                custdat							 = CustomerDataLevelNode.getNodesByTagName ("Addr4");
                for (XmlNode xmlNode : custdat)
                	{
                		CustomerData.add (xmlNode.getNodeValue ());
                	}
                CustomerDataLevelNode			 = root.getNodesByTagName ("CustomerData").get (0);
                custdat							 = CustomerDataLevelNode.getNodesByTagName ("Age");
                for (XmlNode xmlNode : custdat)
                	{
                		CustomerData.add (xmlNode.getNodeValue ());
                	}
                CustomerDataLevelNode			 = root.getNodesByTagName ("CustomerData").get (0);
                custdat							 = CustomerDataLevelNode.getNodesByTagName ("DOB");
                for (XmlNode xmlNode : custdat)
                	{
                		CustomerData.add (xmlNode.getNodeValue ());
                	}
                CustomerDataLevelNode			 = root.getNodesByTagName ("CustomerData").get (0);
                custdat							 = CustomerDataLevelNode.getNodesByTagName ("Sex");
                for (XmlNode xmlNode : custdat)
                	{
                		CustomerData.add (xmlNode.getNodeValue ());
                	}
                CustomerDataLevelNode			 = root.getNodesByTagName ("CustomerData").get (0);
                custdat							 = CustomerDataLevelNode.getNodesByTagName ("Deceased");
                for (XmlNode xmlNode : custdat)
                	{
                		CustomerData.add (xmlNode.getNodeValue ());
                	}
                CustomerDataLevelNode			 = root.getNodesByTagName ("CustomerData").get (0);
                custdat							 = CustomerDataLevelNode.getNodesByTagName ("SchemeName");
                for (XmlNode xmlNode : custdat)
                	{
                		CustomerData.add (xmlNode.getNodeValue ());
                	}
                CustomerDataLevelNode			 = root.getNodesByTagName ("CustomerData").get (0);
                custdat							 = CustomerDataLevelNode.getNodesByTagName ("Comp1");
                for (XmlNode xmlNode : custdat)
                	{
                		CustomerData.add (xmlNode.getNodeValue ());
                	}
                CustomerDataLevelNode			 = root.getNodesByTagName ("CustomerData").get (0);
                custdat							 = CustomerDataLevelNode.getNodesByTagName ("Comp2");
                for (XmlNode xmlNode : custdat)
                	{
                		CustomerData.add (xmlNode.getNodeValue ());
                	}
                CustomerDataLevelNode			 = root.getNodesByTagName ("CustomerData").get (0);
                custdat							 = CustomerDataLevelNode.getNodesByTagName ("Comp3");
                for (XmlNode xmlNode : custdat)
                	{
                		CustomerData.add (xmlNode.getNodeValue ());
                	}
                CustomerDataLevelNode			 = root.getNodesByTagName ("CustomerData").get (0);
                custdat							 = CustomerDataLevelNode.getNodesByTagName ("Comp4");
                for (XmlNode xmlNode : custdat)
                	{
                		CustomerData.add (xmlNode.getNodeValue ());
                	}
                CustomerDataLevelNode			 = root.getNodesByTagName ("CustomerData").get (0);
                custdat							 = CustomerDataLevelNode.getNodesByTagName ("Freq");
                for (XmlNode xmlNode : custdat)
                	{
                		CustomerData.add (xmlNode.getNodeValue ());
                	}
                
                XmlNode CustomerOptinalLevelNode = root.getNodesByTagName ("CustomerOptinal").get (0);
                List <XmlNode> custopt			 = CustomerOptinalLevelNode.getNodesByTagName ("COTestID");
                for (XmlNode xmlNode : custopt)
                	{
                		CustomerOptional.add (xmlNode.getNodeValue ());
                	}
                CustomerOptinalLevelNode		 = root.getNodesByTagName ("CustomerOptional").get (0);
                custdat							 = CustomerOptinalLevelNode.getNodesByTagName ("BIC");
                for (XmlNode xmlNode : custopt)
                	{
                		CustomerData.add (xmlNode.getNodeValue ());
                	}
                CustomerOptinalLevelNode		 = root.getNodesByTagName ("CustomerOptional").get (0);
                custdat							 = CustomerOptinalLevelNode.getNodesByTagName ("IBAN");
                for (XmlNode xmlNode : custopt)
                	{
                		CustomerOptional.add (xmlNode.getNodeValue ());
                	}
                CustomerOptinalLevelNode		 = root.getNodesByTagName ("CustomerOptional").get (0);
                custdat							 = CustomerOptinalLevelNode.getNodesByTagName ("Location");
                for (XmlNode xmlNode : custopt)
                	{
                		CustomerOptional.add (xmlNode.getNodeValue ());
                	}
                CustomerOptinalLevelNode		 = root.getNodesByTagName ("CustomerOptional").get (0);
                custdat							 = CustomerOptinalLevelNode.getNodesByTagName ("PostalAddr");
                for (XmlNode xmlNode : custopt)
                	{
                		CustomerOptional.add (xmlNode.getNodeValue ());
                	}
                CustomerOptinalLevelNode		 = root.getNodesByTagName ("CustomerOptional").get (0);
                custdat							 = CustomerOptinalLevelNode.getNodesByTagName ("CHQAddr1");
                for (XmlNode xmlNode : custopt)
                	{
                		CustomerOptional.add (xmlNode.getNodeValue ());
                	}
                CustomerDataLevelNode			 = root.getNodesByTagName ("CustomerOptional").get (0);
                custdat							 = CustomerDataLevelNode.getNodesByTagName ("CHQAddr2");
                for (XmlNode xmlNode : custdat)
                	{
                		CustomerOptional.add (xmlNode.getNodeValue ());
                	}
                CustomerOptinalLevelNode		 = root.getNodesByTagName ("CustomerOptional").get (0);
                custdat							 = CustomerOptinalLevelNode.getNodesByTagName ("CHQAddr3");
                for (XmlNode xmlNode : custopt)
                	{
                		CustomerOptional.add (xmlNode.getNodeValue ());
                	}
                CustomerOptinalLevelNode		 = root.getNodesByTagName ("CustomerOptional").get (0);
                custdat							 = CustomerOptinalLevelNode.getNodesByTagName ("CHQAddr4");
                for (XmlNode xmlNode : custopt)
                	{
                		CustomerOptional.add (xmlNode.getNodeValue ());
                	}
                
                XmlNode ExpectedResultsLevelNode = root.getNodesByTagName ("ExpectedResults").get (0);
                List <XmlNode> expres			 = ExpectedResultsLevelNode.getNodesByTagName ("ERTestID");
                for (XmlNode xmlNode : expres)
                	{
                		ExpectedResults.add (xmlNode.getNodeValue ());
                	}
                ExpectedResultsLevelNode		 = root.getNodesByTagName ("ExpectedResults").get (0);
                custdat							 = ExpectedResultsLevelNode.getNodesByTagName ("Value");
                for (XmlNode xmlNode : expres)
                	{
                		ExpectedResults.add (xmlNode.getNodeValue ());
                	}
                ExpectedResultsLevelNode		 = root.getNodesByTagName ("ExpectedResults").get (0);
                custdat							 = ExpectedResultsLevelNode.getNodesByTagName ("Status");
                for (XmlNode xmlNode : expres)
                	{
                		ExpectedResults.add (xmlNode.getNodeValue ());
                	}
    		}

		public void display ()
    		{
				if (SuiteOrSingle == 0)
					{
						System.out.println ("Suite or Single : Complete Suite");
						System.out.println ("Suite Name      : " + SuiteName);
					}
				if (SuiteOrSingle == 1)
					{
						System.out.println ("Suite or Single : Single Test");
						System.out.println ("Test Name       : " + TestName);
						System.out.println ("Test ID         : " + TestID);
					}
				if (ConfigFile != "")
					{
						System.out.println ("Config File     : " + ConfigFile);
					}
    			if (dB != "")
    				{
    					System.out.println ("Database        : " + dB);
    					System.out.println ("Table           : " + Table);
    					System.out.println ("User Name       : " + UID);
    					System.out.println ("Password        : " + PWD);
    				}

    			System.out.println ("------------------");
    	        System.out.println ("Customer Data");    			
    	        for (String custdat : CustomerData)
    	        	{
    	            	System.out.println("\t         : " + custdat);
    	        	}
    			System.out.println ("------------------");
    	        System.out.println ("Customer Optional Data");    			
    	        for (String custopt : CustomerOptional)
    	        	{
    	            	System.out.println("\t         : " + custopt);
    	        	}
    			System.out.println ("------------------");
    	        System.out.println ("Expected Results");    			
    	        for (String expres : ExpectedResults)
    	        	{
    	            	System.out.println ("\t         : " + expres);
    	        	}
    			System.out.println ("------------------");
    		}
	}
