package report.kimhonggeun.r0011;

import java.util.Scanner;

public class ExceptionExam2 {
	//10개의 방을 가지고 있는 int형 배열변수 arrNum를
	//ExceptionExam2의 멤버변수로 선언해주세요
	//for문을 돌며 Scanner 클래스의 nextLine()함수를 사용하여 아무런 값이나 입력해주세요
	//단 for문을 돌며 문자값이 입력됬을때 에러메세지르,ㄹ 나오게 해주세요

	int[] arrNum = new int[3];
	ExceptionExam2(){
		for(int j=0;j<arrNum.length;j++){

			try{
				Scanner scan = new Scanner(System.in);
					System.out.print("숫자만 넣어라 해봐 :");
					arrNum[j] = Integer.parseInt(scan.nextLine());
			}catch(Exception e){
				j--;
				System.out.println("숫자만 넣으라고");
			}
		}
	}
	public static void main(String[]args){
		ExceptionExam2 ee = new ExceptionExam2();
	}
}