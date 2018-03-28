package test17;

public class Exam extends AbstractDataBase{

	Exam() throws Exception{
		super("dbcon.properties");
	//	System.out.println("난 아들 생성자");
	}
	
	public static void main(String[] agrs) {
		try {
			AbstractDataBase adb = new Exam();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//adb.create();
		//adb.read();
	}
}

