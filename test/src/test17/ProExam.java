package test17;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;


public class ProExam {
	 ProExam() {
		String fileName = "properties";
		InputStream is = getClass().getClassLoader().getResourceAsStream(fileName);
	//	System.out.println(is);
		
		Properties prop = new Properties();
		try {
			prop.load(is);
			Iterator<Object> it = prop.keySet().iterator();
		//	while(it.hasNext()){
		//	String key = (String)it.next();
			System.out.println("name=" + prop.getProperty("name"));
			System.out.println("address=" + prop.getProperty("address"));
			System.out.println("job=" + prop.getProperty("job"));
			
		//	}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public static void main(String[] agrs) {		
		new ProExam();
	}

}
