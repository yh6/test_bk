package test17;

import java.io.InputStream;

public abstract class AbstractDataBase {
	
	public AbstractDataBase(String fileName) throws Exception {
		InputStream is = getClass().getClassLoader().getResourceAsStream(fileName);
		if(is==null) {
			throw new Exception(fileName + "�̶� ������ �����ϴ�.");
		}
		//System.out.println("���� �߻�Ŭ�����Դϴ�.");
	}

/*	public void create() {
		System.out.println("���� �ƺ��� create()");
	}

	public abstract void read(); */
	}
