package test11;

public class User {
	
	private String name;
	private int age;
	private String depart; //private를 public로 만들기 위해 get/set 으로 만듬 => VO,DTO HashMap키를 감지
	//toString 오브젝를 상속-오버라이딩
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", depart=" + depart + "]";
	}
	
	

}
