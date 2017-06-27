package report.kimjeongkyu.r0012;

import java.util.Scanner;

public class FunctionExam {
	int[] arrNum = new int[5];
	Scanner scan = new Scanner(System.in);
	int an = 0;
	
	int getNumberFromString(){
		try {an++; 
			System.out.println( an + "번째 값을 입력해주세요");
			return Integer.parseInt(scan.nextLine());
			
		} catch (Exception e) {
			an--;
			System.out.println("누가 문자 넣으래!!");
			return getNumberFromString();
		}
	}
		
	public static void main(String[] args){
		FunctionExam ee2 = new FunctionExam();
		for (int i = 0; i < ee2.arrNum.length; i++){
			System.out.println((i+1) + "번째 값을 입력해주세요");
			ee2.arrNum[i] = ee2.getNumberFromString();
		}
		
		for (int i =0; i<ee2.arrNum.length; i++){
			System.out.println(ee2.arrNum[i]);
		}
	}
}
