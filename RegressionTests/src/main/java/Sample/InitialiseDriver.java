package Sample;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class InitialiseDriver 
{
	public void initialise()throws IOException
	{
		Properties commonProperty = new Properties();
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\HP\\eclipse-workspace-practise\\RegressionTests\\src\\main\\java\\Sample\\driver.properties");
		commonProperty.load(fileInputStream);
		commonProperty.getProperty("browser");
		
	}
		
	
	
	

}
