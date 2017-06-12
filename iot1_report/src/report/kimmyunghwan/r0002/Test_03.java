package report.kimmyunghwan.r0002;

import java.util.Scanner;

public class Test_03 {

	public void printMultipleTable(int initNum, int maxNum) {

		for (int i = initNum; i <= maxNum; i++) {
			int a = 1;
			for (a = initNum; a <= maxNum; a++) { // 지금 for문 다 돌아야 위 for 문으로 돌아감 
															// i가 1일때 a는1 
				System.out.print(i + "X" + a + "=" + (i * a) + ",");

			}
			System.out.println(i + "X" + a + "=" + (i * a)); //1*9일때 엔터
		}

	}

	public static void main(String[] args) {

		// System.out.println("1*1="+1);
		// System.out.println(a+ "X" + b + "=" + (a*b));
		Test_03 t02 = new Test_03();

		t02.printMultipleTable(1, 5);

	}

}
