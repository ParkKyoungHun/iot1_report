package report.parkkyounghun.r0011;

import java.util.Scanner;

public class ExceptionExam3 {
	final int initNum;
	int[] arrNum;
	ExceptionExam3(int initNum){
		this.initNum = initNum;
	}
	
	public static void main(String[] args) {
		ExceptionExam3 ee2 = new ExceptionExam3(3);
		ee2.arrNum = new int[ee2.initNum];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < ee2.arrNum.length; i++) {
			try {
				ee2.arrNum[i] = Integer.parseInt(scan.nextLine());
			} catch (Exception e) {
				i--;
				System.out.println("누가 문자 넣으래!!");
			}
		}
	}
}
