package test07;

public class Execute {
	
	public static void printInfo(Animal[] animals) {
		for(int i=0;i<animals.length;i++) {
			animals[i].eat();
		}
	}
	
	
	public static void main(String[] agrs) { //cat�� �ִϸ��� ��ӹް� �ձ�빮�� cat<animal<ojbect	
		
		Animal a = new Cat("��", "������", 5); 
		Animal a1 = new Dog("����","����",2);
		Animal a2 = new Lion("����", "���̿�", 8);
		Animal[] animals = new Animal[4];
		animals[0] = a;
		animals[1] = a1;
		animals[2] = new Animal();
		animals[3] = a2;
		printInfo(animals);
		
	
	}

}
