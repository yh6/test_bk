package test17;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class MakeFile {
	
	public static void main(String[] agrs) {
		File file = new File("test.text");
		try {
			OutputStream os= new FileOutputStream(file);
			
		}catch(Exception e){
			
		}
	}

}
