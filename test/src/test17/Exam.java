package test17;

public class Exam extends AbstractDataBase{

	Exam() throws Exception{
		super("dbcon.properties");
	//	System.out.println("�� �Ƶ� ������");
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

