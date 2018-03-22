package test14;

import java.util.ArrayList;
import java.util.List;

class UserInfo {
	private int age;
	private String name;
	private String id;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "UserInfo [age=" + age + ", name=" + name + ", id=" + id + "]";
	}

	

}
public class ListExam {
	static void printList(List<UserInfo> uiList) {
		for (int i = 0; i < uiList.size(); i++) {
			System.out.println(uiList.get(0));
		}
	}

	public static void main(String[] agrs) {
		ArrayList<UserInfo> uiList = new ArrayList<UserInfo>();

		for (int i = 0; i <= 4; i++) {
			UserInfo ui = new UserInfo();
			
			ui.setAge(3);
			ui.setName("ÂÐÂÐÀÌ");
			ui.setAge(5);
			ui.toString();
		//	System.out.println("ÀÌ¸§" + (i + 1));
			uiList.add(ui);
		}
		//System.out.println(uiList);
		printList(uiList);
	}
}
