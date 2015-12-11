package dataimport;

import java.util.ArrayList;
import java.util.List;
import db.utils.dBConnection;
import java.sql.*;

public class dBDataSet
	{

		public dBDataSet (dBConnection dBConn) throws SQLException
			{
				loadFromdB (dBConn);
			}

		private void loadFromdB (dBConnection dBConn) throws SQLException
			{
				Statement stmt			= null;
				String sql				= null;
				ResultSet rs			= null;
				
				String SuiteOrSingle	= "";
				String SuiteName		= "";
				String TestName			= "";
				String TestID			= "";
				String Title			= "";
				String GivenName		= "";
				String FamilyName		= "";
				String Status			= "";
				String PPSN				= "";
				String Addr1			= "";
				String Addr2			= "";
				String Addr3			= "";
				String Addr4			= "";
				String Age				= "";
				String DOB				= "";
				String Sex				= "";
				String Deceased			= "";
				String SchemeName		= "";
				String Comp1			= "";
				String Comp2			= "";
				String Comp3			= "";
				String Comp4			= "";
				String Freq				= "";
				String BIC				= "";
				String IBAN				= "";
				String Location			= "";
				String PostalAddr		= "";
				String CHQAddr1			= "";
				String CHQAddr2			= "";
				String CHQAddr3			= "";
				String CHQAddr4			= "";
				String Value			= "";
				
				stmt	= dBConn.createStatement ();
				sql		= "SELECT * FROM TestDataSet ORDER BY SuiteName ASC, TestID ASC";
				rs		= stmt.executeQuery (sql);

				while(rs.next())
		    		{
						SuiteOrSingle	= rs.getString ("SuiteOrSingle");
						SuiteName		= rs.getString ("SuiteName");
						TestName		= rs.getString ("TestName");
						TestID			= rs.getString ("TestID");
						Title			= rs.getString ("Title");
						GivenName		= rs.getString ("GivenName");
						FamilyName		= rs.getString ("FamilyName");
						Status			= rs.getString ("Status");
						PPSN			= rs.getString ("PPSN");
						Addr1			= rs.getString ("Addr1");
						Addr2			= rs.getString ("Addr2");
						Addr3			= rs.getString ("Addr3");
						Addr4			= rs.getString ("Addr4");
						Age				= rs.getString ("Age");
						DOB				= rs.getString ("DOB");
						Sex				= rs.getString ("Sex");
						Deceased		= rs.getString ("Deceased");
						SchemeName		= rs.getString ("SchemeName");
						Comp1			= rs.getString ("Comp1");
						Comp2			= rs.getString ("Comp2");
						Comp3			= rs.getString ("Comp3");
						Comp4			= rs.getString ("Comp4");
						Freq			= rs.getString ("Freq");
						BIC				= rs.getString ("BIC");
						IBAN			= rs.getString ("IBAN");
						Location		= rs.getString ("Location");
						PostalAddr		= rs.getString ("PostalAddr");
						CHQAddr1		= rs.getString ("CHQAddr1");
						CHQAddr2		= rs.getString ("CHQAddr2");
						CHQAddr3		= rs.getString ("CHQAddr3");
						CHQAddr4		= rs.getString ("CHQAddr4");
						Value			= rs.getString ("Value");

						System.out.print ("Suite Or Single    : " + SuiteOrSingle);
						System.out.print ("Suite Name         : " + SuiteName);
						System.out.print ("Test Name          : " + TestName);
						System.out.print ("Test ID            : " + TestID);
						System.out.print ("Title              : " + Title);
						System.out.print ("Given Name         : " + GivenName);
						System.out.print ("Family Name        : " + FamilyName);
						System.out.print ("Status             : " + Status);
						System.out.print ("PPSN               : " + PPSN);
						System.out.print ("Address Line 1     : " + Addr1);
						System.out.print ("Address Line 2     : " + Addr2);
						System.out.print ("Address Line 3     : " + Addr3);
						System.out.print ("Address Line 4     : " + Addr4);
						System.out.print ("Age                : " + Age);
						System.out.print ("DOB                : " + DOB);
						System.out.print ("Sex                : " + Sex);
						System.out.print ("Deceased           : " + Deceased);
						System.out.print ("Scheme Name        : " + SchemeName);
						System.out.print ("Component 1        : " + Comp1);
						System.out.print ("Component 2        : " + Comp2);
						System.out.print ("Component 3        : " + Comp3);
						System.out.print ("Component 4        : " + Comp4);
						System.out.print ("Freqrency          : " + Freq);
						System.out.print ("BIC                : " + BIC);
						System.out.print ("IBAN               : " + IBAN);
						System.out.print ("EFT Location       : " + Location);
						System.out.print ("Postal Address     : " + PostalAddr);
						System.out.print ("CHQ Address Line 1 : " + CHQAddr1);
						System.out.print ("CHQ Address Line 2 : " + CHQAddr2);
						System.out.print ("CHQ Address Line 3 : " + CHQAddr3);
						System.out.print ("CHQ Address Line 4 : " + CHQAddr4);
						System.out.print ("Value              : " + Value);
		    		}
		    
				rs.close ();
				stmt.close ();
			}
	}