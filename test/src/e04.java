
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
		System.out.println(name + "짖습니다.");
	}
	public void run() {
		System.out.println(name + "달립니다.");
	}
	public String toString() {
		return name + "이고,"  + age + "살이고," + kind + "종 입니다.";
	}
}
