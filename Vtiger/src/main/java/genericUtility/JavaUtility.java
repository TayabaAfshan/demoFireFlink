package genericUtility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	
		/**
		 * This method is used to get random number
		 * @author Afshan
		 * @return
		 */
		public int getRandomNo()
		{
			Random ran = new Random();
			int random = ran.nextInt(500);
			return random;
		}
		
		/**
		 * This method is used to get System date
		 * @author Afshan
		 * @return
		 */
		public String getSystemDate()
		{
			Date d = new Date();
			String date = d.toString();
			return date;
		}
		
		/**
		 * This method is used to get system date in format
		 * @author Afshan
		 * @return
		 */
		public String getSystemDateInFormat()
		{
			SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy hh-mm-ss");
			Date date = new Date();
			String systemDateInFormat = dateformat.format(date);
			return systemDateInFormat;
		}

}
