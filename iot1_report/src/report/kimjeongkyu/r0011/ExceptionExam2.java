package report.kimjeongkyu.r0011;

import java.util.Scanner;

public class ExceptionExam2 {
	//10개의 방을 가지고 있는 int형 배열변수 arrNum을
	// ExceptionExam2의 멤버변수로 선언해주세요.
	// for문을돌며 아무런 값이나 입력해주세요.
	// 단 for문을 돌며 문자값이 입력됐을때 에러메시지를 나오게 해주세요.	
	
	int[] arrNum = new int [10];
		
	public static void main(String[] args){
		ExceptionExam2 ee2 = new ExceptionExam2();
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<ee2.arrNum.length; i++){
				try{			
					System.out.println(i + "번 방의 값을 입력해보시오");
					ee2.arrNum[i] = Integer.parseInt(scan.nextLine());
					System.out.println();
				}catch(Exception e){
					System.out.println("Warning!!!!! 값을 다시 입력하세요");
					i--;
				}
				
		}
	}	
}
