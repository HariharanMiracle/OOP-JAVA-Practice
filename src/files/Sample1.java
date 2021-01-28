package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sample1 {

	public static void main(String args[]) throws IOException{
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("G:\\Hariharan\\Documents\\docs\\input.pdf");
			out = new FileOutputStream("G:\\Hariharan\\Documents\\docs\\output.pdf");

			int c;
	        while ((c = in.read()) != -1) {
	        	out.write(c);
	        }
	        
	        out.write(32);
	        
	        String b = "Hariharan Vasudvan";
	        for(int i = 0; i < b.length(); i++) {
	        	System.out.println(b.charAt(i));
	        	System.out.println((int) b.charAt(i));
	        	out.write((int) b.charAt(i));
	        }
	        
	        
	        File file = null;
			file = new File("G:\\Hariharan\\Documents\\docs\\tmp");
			String[] paths;
			paths = file.list();
			// for each name in the path array
	         for(String path:paths) {
	            // prints filename and directory name
	            System.out.println(path);
	         }
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if (in != null) {
				in.close();
	        }
	        if (out != null) {
	            out.close();
	        }
		}
	}
	
}
