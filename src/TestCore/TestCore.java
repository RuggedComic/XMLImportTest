package TestCore;

import java.io.IOException;
import dataimport.dBMain;
import dataimport.XMLMain;
import TestCore.TestCoreObj;
import TestCore.TestCoreStart;

public class TestCore
	{
		private int imptype;
		
		public TestCore() throws IOException
		{
			if (imptype == 0)
				{
					dBMain();
				}
			if (imptype == 1)
				{
					XMLMain();
				}
			
			TestCoreObj();
			
			TestCoreStart();
		}
	}

