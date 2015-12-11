package db.utils;

import java.sql.*;
import java.util.Properties;

public class dBConnection
	{
		private String URL;
		private String SvrNm;
		private String InstNm;
		private int pnum;
		private String UID;
		private String PWD;
		private int pos;
	
		public Connection getConnection (Connection dBconn) throws SQLException
			{	
				pos							= URL.indexOf ("/");
				SvrNm						= URL.substring (0, pos);
				InstNm						= URL.substring (pos);
				pnum						= 1433;
				Connection conn				= null;
				Properties connectionProps	= new Properties ();
				connectionProps.put ("user", UID);
				connectionProps.put ("password", PWD);
				conn 						= DriverManager.getConnection ("jdbc:"
																		+ "sqlserver"
																		+ "/"
																		+ SvrNm
																		+ "/"
																		+ InstNm
																		+ ":"
																		+ pnum
																		+ ";"
																		, connectionProps);
				System.out.println ("Connected to database");
				return conn;
			}
	
	}