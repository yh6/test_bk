package test08;

public class Excute {
	public void info(Computer c) {
		c.info();
	}
	
	
	public static void main(String[] agrs) {
		Desktop d = new Desktop();
		d.compName = "��ž";
		d.cpuName = "����";
		Excute e = new Excute();
		e.info(d);
	
		
		
		Laptop l = new Laptop();
		l.compName = "��Ʈ��";
		l.cpuName = "AMD";
		l.size = "13��ġ";
		e.info(l);
	
	}

}
