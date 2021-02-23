package property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import static property.Const.*;

public class PropEx1 {
	public static void main(String args[]) {
		FileInputStream fIstream = null;
		Properties propery = new Properties();
		
		try {
			fIstream = new FileInputStream(FILE_PATH);
			propery.load(fIstream);
			System.out.println(propery.getProperty(APP_NAME));
			System.out.println(propery.getProperty(SERVER_USERNAME));
			System.out.println(propery.getProperty(SERVER_PASSWORD));
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			if(fIstream != null) {
				try {
					fIstream.close();
				}
				catch(IOException e){
					e.printStackTrace();
				}
			}
		}
	}
}
