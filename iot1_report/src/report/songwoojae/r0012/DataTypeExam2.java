package report.songwoojae.r0012;

import java.util.HashMap;

public class DataTypeExam2 {
	public static void main(String[] args) {
		int[] arrNum = new int[2];
		arrNum[0] = 1;
		arrNum[1] = 2;
		String[] arrStr1 = new String[2];
		arrStr1[0] = "가";
		arrStr1[1] = "나";
		String[] arrStr2 = new String[2];
		arrStr2[0] = "a";
		arrStr2[1] = "b";
		
		HashMap hm = new HashMap();
		hm.put(arrNum[0], arrNum);
		System.out.println(hm);
	}

}
