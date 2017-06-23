package report.kimmyunghwan.r0011;

import java.util.Scanner;


public class ExceptionExam3 {
	
	final int initNum;
	int[] arrNum;
	
	ExceptionExam3(int initNum){
		this.initNum = initNum;
	}


	public static void main(String[] args) {
		ExceptionExam3 ex2 = new ExceptionExam3(3);
		ex2.arrNum = new int[ex2.initNum];
		Scanner scan = new Scanner(System.in);
				
		for (int i = 0; i < ex2.arrNum.length; i++) {
			
			try {
				
				ex2.arrNum[i] = Integer.parseInt(scan.nextLine());
							
			} catch (Exception e) {
				i--;
				System.out.println("다른 문자를 입력 하셨네요!!!");
			} 

		}

	}
}
