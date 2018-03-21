package test12;

import java.util.Random;

public class ThreadExam extends Thread { // thread�� �񵿱�(a�� a��� b��b��� ���� ��������)-������,ä��,�����ϵ�

	int maxNum = 10;
	String name;

	ThreadExam(int maxNum, String name) {
		this.maxNum = maxNum;
		this.name = name;
	}

	public void run() {
		Random r = new Random();
		for (int i = 0; i < maxNum; i++) {
			System.out.println(this.name + i);
			int sp = r.nextInt(1000) + 500; // 1000-1500
			try {
				Thread.sleep(sp); // ����� ms
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] agrs) {
		ThreadExam fe1 = new ThreadExam(10, "1��°");
		ThreadExam fe2 = new ThreadExam(10, "2��°");
		fe1.start(); // thread�� �Լ� - run()�Լ��� �������̵� �޾Ƽ� ����
		fe2.start();
	}
}
