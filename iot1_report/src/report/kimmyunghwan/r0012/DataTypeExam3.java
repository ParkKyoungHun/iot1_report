package report.kimmyunghwan.r0012;

import java.util.ArrayList;
import java.util.HashMap;

public class DataTypeExam3 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		Object[] arrO = new Object[10];

		ArrayList<HashMap> numList = new ArrayList<HashMap>(); // HashMap타입 변수
		HashMap str = new HashMap(); // String으로 안하고 HashMap으로 한건 ArrayList는 키값과
													// 밸류 값을 가져야하는데 안되기 때문에 HashMap으로 해야함
		numList.add(str);

		// String str ="abc"; 14열 주석으로 설명

		// ArrayList<Integer> numList = new ArrayList<Integer>(); // ArrayList는
		// 방 갯수를 선언안해줘도 된다
		// numList.add(1);
		//
		// Integer[] arrNum = new Integer[10]; // 배열은 방갯수를 선언해줘야한다
		// arrNum[0] =1;

	} // main End

} // class End
