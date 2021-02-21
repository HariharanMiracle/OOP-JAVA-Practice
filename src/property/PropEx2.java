package property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropEx2 {
	
	public static final String APP_NAME = "app.name";
	public static final String SERVER_USERNAME = "tomcat.manager.username";
	public static final String SERVER_PASSWORD = "tomcat.manager.password";
	public static final String FILE_NAME = "property\\test.properties";
	public static final String FILE_PATH = "src\\property\\test.properties";
	
	public static void main(String args[]) {
		Properties properties = new Properties();
		try {
			properties.load(PropEx2.class.getClassLoader().getResourceAsStream(FILE_NAME));
			System.out.println(properties.getProperty(APP_NAME));
			System.out.println(properties.getProperty(SERVER_USERNAME));
			System.out.println(properties.getProperty(SERVER_PASSWORD));
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
