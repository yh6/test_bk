package test11;

public class ArrayTest {

	public static void main(String[] agrs) {

		String[] strArr = new String[3];
		strArr[0] = "ȫ�浿";
		strArr[1] = "22";
		strArr[2] = "��⵵";
		
		/*strArr[0] = "��浿";
		strArr[1] = "23";
		strArr[2] = "���ֵ�";*/
		for(int i=0;i<strArr.length;i++) {
			System.out.println(strArr[i]);
		}
		System.out.println(strArr.length);
		
		String[][] strs = new String[2][3];
		strs[0][0] = "ȫ�浿";		
		strs[0][1] = "22";
		strs[0][2] = "��⵵";
		strs[1][0] = "��浿";
		strs[1][1] = "23";
		strs[1][2] = "���ֵ�";
		
		for(int i=0;i<strs.length;i++) {
			for(int j=0;j<strs[i].length;j++){
				System.out.println(strs[i][j]);
			}
		}
	}

}
