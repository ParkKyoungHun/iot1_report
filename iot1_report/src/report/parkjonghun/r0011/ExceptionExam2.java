package report.parkjonghun.r0011;

import java.util.Scanner;

public class ExceptionExam2 {
	
	// 10개의 방을 가지고 있는 int형 배열변수 arrNum을 
	// ExceptionExam2의 멤버변수로 선언해주세요.
	// for문을 돌며 Scanner 클래스의 nextLine()함수를 사용하여 아무런 값이나 입력해주세요.
	// 단 for문을 돌며 문자값이 입력되었을 때 에러메시지가 나오게 해주세요.
	
	int arrNum[] = new int[5];
	int num;
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		ExceptionExam2 ee2 = new ExceptionExam2();
	
		for(int i=0; i< ee2.arrNum.length; i++){
			try{
				System.out.print("숫자를 입력해주세요. => ");
				ee2.num = Integer.parseInt(scan.nextLine());
				ee2.arrNum[i] = ee2.num;	
			}catch(Exception e){
				System.out.println("숫자를 입력하여야 합니다. 문자 ㄴㄴ");
				i--;
			}
		}
	}
	
}
