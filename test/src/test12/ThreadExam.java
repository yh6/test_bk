package test12;

import java.util.Random;

public class ThreadExam extends Thread { // thread는 비동기(a는 a대로 b는b대로 각각 돌고잇음)-웹서버,채팅,웹소켓등

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
				Thread.sleep(sp); // 대기중 ms
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] agrs) {
		ThreadExam fe1 = new ThreadExam(10, "1번째");
		ThreadExam fe2 = new ThreadExam(10, "2번째");
		fe1.start(); // thread의 함수 - run()함수를 오버라이딩 받아서 실행
		fe2.start();
	}
}
