package test13;

public class Test {

	String text;
	
	public void print(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] agrs) {
		Test t = new Test();
		t.text = "�� t����";
		System.out.println(t.text); //t.�޸��ּҸ� �����վ -�޸��ּ� ����
		
		Test[] tArr = new Test[3]; //��3���� ������� ���濡 null���� ����
		//System.out.println(tArr[0].text); //null exception���� - (���ȣ�� ȣ���ؾ��� null����)
		tArr[0] = new Test();
		System.out.println(tArr[0].text);
		Test t1 = tArr[0]; //������Ÿ���� ���⶧���� ����
	}
}
