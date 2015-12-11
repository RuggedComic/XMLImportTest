package dataimport;

import java.io.IOException;
import db.utils.dBConnection;
import dataimport.dBDataSet;
import java.sql.*;

public class dBMain
	{
    	public static void main (String[] args) throws IOException, SQLException
    		{
    			dBConnection dBConn = new dBConnection ();
    			
    			dBDataSet dataset	= new dBDataSet (dBConn);
    		}
    }