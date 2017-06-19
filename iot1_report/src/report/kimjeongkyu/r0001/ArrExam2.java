package report.kimjeongkyu.r0001;

import java.util.Scanner;

public class ArrExam2 {
	//scanner 클래스의 nextLine() 함수를 사용하여 초기값과 맥스값을 입력받아.
	// 위에서 받은 초기값부터 맥스값까지 반복하는 반복문을 작성해주세요.
	//***스트링 배열변수를 선언해주세요
	//해당배열변수의 방의 갯수는 위에서 받아온 초기값과 맥스값으로 계산해야 에러가 나지 않습니다.
	//해당반복문에서 Scanner클래스의 nextLine()함수를 사용하여 인덱스값까지  값을 받아주세요.
	//다음 반복문에서 스트링배열변수가 가진 모든방의 값을 출력해주세요.
	
	
	//*****************************************************
	//*자동입력이 아니라 매번방의 값을내가 입력해주어야함
	
	
	void Calculate(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("초기값을 입력해주세요");
		String input = scanner.nextLine();
		int initNum = Integer.parseInt(input);

		System.out.println("맥스값을 입력해주세요");
		String input2 = scanner.nextLine();
		int maxNum = Integer.parseInt(input2);

		String[] name = new String[maxNum-initNum+1];
		for(int i= 0; i<=maxNum-initNum; i++){
			name[i] = scanner.nextLine();
			System.out.println((i+1) + "번 방의 값은 " + name[i]);
		}
	
		for(int i =0; i<name.length; i++){
			System.out.print(name[i] + ",");
		}
		
				
	}
	
	
	
	public static void main(String[] args){
		ArrExam2 ae2 = new ArrExam2();
		ae2.Calculate();
		
	}
	
	

	
}
