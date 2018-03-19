package test08;

public class Excute {
	public void info(Computer c) {
		c.info();
	}
	
	
	public static void main(String[] agrs) {
		Desktop d = new Desktop();
		d.compName = "데탑";
		d.cpuName = "인텔";
		Excute e = new Excute();
		e.info(d);
	
		
		
		Laptop l = new Laptop();
		l.compName = "노트북";
		l.cpuName = "AMD";
		l.size = "13인치";
		e.info(l);
	
	}

}
