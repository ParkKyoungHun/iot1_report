package report.jangjaehyun.r0011;

import java.util.Scanner;

public class ExceptionExam2 {
	int[] arrNum = new int[10];

	public static void main(String[] args){
		ExceptionExam2 ee2 = new ExceptionExam2();
		for(int i = 0;i<ee2.arrNum.length;i++){
			try{
				
				Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();
			ee2.arrNum[i]=Integer.parseInt(input);
		}
		
		 catch(Exception e) {
			System.out.println(" 문자를 입력하세요. ");
			}
		
		}
	}
		
	
}

// 10개의 방을 가지고 있는 int형 배열변수 arrNum을
// ExceptionExam2의 멤버변수로 선언해주세요.
// for문을 돌며 Scanner클래스의 nextLine() 함수를 사용하여 아무런 값이나 입력해주세요.
// 단 for문을 돌며 문자값이 입력됐을 때 에러메세지를 나오게 해주세요.
