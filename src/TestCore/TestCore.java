package TestCore;

import java.io.IOException;
import dataimport.*;

public class TestCore
	{
		private int imptype;
		
		public TestCore() throws IOException
		{
			if (imptype == 0)
				{
					dataimport.dBMain();
				}
			if (imptype == 1)
				{
					dataimport.XMLMain();
				}
			
			TestCore.TestCoreObj();
			
			
		}
	}

