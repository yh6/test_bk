package test11;

public class User {
	
	private String name;
	private int age;
	private String depart; //private�� public�� ����� ���� get/set ���� ���� => VO,DTO HashMapŰ�� ����
	//toString �������� ���-�������̵�
	
	
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
