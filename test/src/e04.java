
public class e04 {
	
	private String name;
	private int age;
	private String kind;
	
	public e04(String name, int age, String kind) {
		this.name=name;
		this.age=age;
		this.kind=kind;
	}
	
	public void back() {
		System.out.println(name + "¢���ϴ�.");
	}
	public void run() {
		System.out.println(name + "�޸��ϴ�.");
	}
	public String toString() {
		return name + "�̰�,"  + age + "���̰�," + kind + "�� �Դϴ�.";
	}
}
