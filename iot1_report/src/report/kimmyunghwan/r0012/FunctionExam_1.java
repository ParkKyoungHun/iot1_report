package report.kimmyunghwan.r0012;

import java.util.Scanner;

public class FunctionExam_1 {

	int[] arrNum = new int[5];
	Scanner scan = new Scanner(System.in);
	
	int num=0; //FunctionExam2

	int getNumberFromString() {
				
		try {
			// System.out.println("숫자를 입력해주세요");  //FunctionExam_1
			
			System.out.println((num+=1)+"번째 숫자를 입력해주세요"); //FunctionExam2
			
			return Integer.parseInt(scan.nextLine());  //숫자를 입력했을때 리턴 18열로 간다
		} catch (Exception e) {
			 //i--; // 계속 반복, for문으로 -1 하여 만족하여 for문이 실행된다
			
			num--; //FunctionExam2
			 System.out.println("다른 문자를 입력 하셨네요!!!");
			 return getNumberFromString(); //i--와 같은 행동
		}
	}

	public static void main(String[] args) {
		FunctionExam_1 ee2 = new FunctionExam_1();

		for (int i = 0; i < ee2.arrNum.length; i++) {
			
//			System.out.println((i+1) + "번째 숫자를 넣어주세요"); //FunctionExam_1
			
			
			ee2.arrNum[i] = ee2.getNumberFromString();

		}
		for (int i = 0; i < ee2.arrNum.length; i++) {

			System.out.println(ee2.arrNum[i]);
		}
	}
}
