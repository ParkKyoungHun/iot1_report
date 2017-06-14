package report.kimjeongkyu.r0002;

import java.util.Scanner;

public class Test {

	public void printMultipleTable(int initNum, int maxNum) {
		for (int a = initNum; a<= maxNum; a++) {
			int b=1;
			for (b = initNum; b<maxNum; b++) {
				System.out.print(a + "X" + b + " = " + (a * b) + ", ");
				}
			System.out.println(a + "X" + b + " = " + (a * b));
		}
	}

	public static void main(String[] args) {
		Test t1 = new Test();
		t1.printMultipleTable(1, 5);
		
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("?��?��?�� 값을 ?��?��?��주세?��");
		String intNum = scan.nextLine();
		int geta = Integer.parseInt(intNum);

		System.out.println("?��값을 ?��?��?��주세?��");
		String maxNum = scan.nextLine();
		int getb = Integer.parseInt(maxNum);
		*/
	}
}
