package report.kimjeongkyu.r0011;

import java.util.Scanner;

public class ExceptionExam3 {
	final int initNum;
	int[] arrNum;
	ExceptionExam3(int initNum){
		//final 선언하면 아래 새로 선언해야함!!
		this.initNum = initNum;
	}
	
	public static void main(String[] args){
		ExceptionExam3 ee2 = new ExceptionExam3(3);
		ee2.arrNum = new int[ee2.initNum];
		Scanner scan = new Scanner(System.in);
		for (int i =0; i<ee2.arrNum.length; i++){
			try{
				System.out.println((i+1)+"번 방의 값을 입력해주세요.");
				ee2.arrNum[i] = Integer.parseInt(scan.nextLine());
			} catch(Exception e){
				i--;
				System.out.println("WARNING! ONLY INTEGER PLEASE");
			}
		}
	}	
}
