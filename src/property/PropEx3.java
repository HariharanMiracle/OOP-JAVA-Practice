package property;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import static property.Const.*;

public class PropEx3 {

	public static void main(String args[]) {
		try {
			Properties properties = new Properties();
			properties.setProperty(APP_NAME, "Application-Name");
			properties.store(new FileOutputStream(FILE_NAME1), COMMENT);
			System.out.println("Property created");
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
