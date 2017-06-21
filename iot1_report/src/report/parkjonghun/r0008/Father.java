package report.parkjonghun.r0008;

import java.util.Scanner;

public class Father {
	Scanner scan;
	String str1, str2;
	int initNum;
	int maxNum;
	int[] score;
	int num;
	
	
	Father(){
		scan = new Scanner(System.in);
		System.out.println("학생의 인원수를 입력해주세요. => ");
		int studentCnt = Integer.parseInt(scan.nextLine());
		score = new int[studentCnt];
		System.out.println(studentCnt + "명 학생의 점수를 입력하세요.");
		scoreInput();
		scoreLine();
		//System.out.println("아빠 기본 생성자 호출");
//		inputFormScanner1(); //함수를 생성자안에 넣어서 Son 클래스 메인에 단 2줄이면 표현이 가능하게 만듬.!
//		inputFormScanner2();
		//castStringToInt();
	}
	
	void scoreInput(){
		for(int i = 0; i < score.length; i++){
			System.out.print( (i+1) +"번 째 학생의 점수를 입력해주세요.");
			num = Integer.parseInt(scan.nextLine());
			score[i] = num;
		}
	}
	
	void scorePrint(){
		for(int i = 0; i < score.length; i++){
			System.out.println((i+1) + "번 째 학생의 점수는 => " + score[i]);
		}
	}
	void scoreLine(){ // 해당 함수 다시 공부 이해 할때까지.
		for(int i = 0; i < score.length; i++){
			for(int j = i+1; j < score.length; j++){
				if(i<score.length && score[i] < score[j]){
					int temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
		}
	}
	void scorePrintLoop(){
		for(int i = 0; i < score.length; i++){
			System.out.println("입력하신 " + (i+1) + " 번째 학생의 점수 = " + score[i]);
		}
	}
				
				 
				
		
	
	
	
//	 void castStringToInt(){ 강사님은 int로 변경하는 함수로 따로 만들어 주심.
//		 initNum = Integer.parseInt(str1);
//		 maxNum = Integer.parseInt(str2);
//	 }
	
//	void inputFormScanner1(){
//		System.out.print("최소 값을 입력해주세요. => ");
//		str1 = scan.nextLine();
//		initNum = Integer.parseInt(str1);
//	}
//	void inputFormScanner2(){
//		System.out.print("최대 값을 입력해주세요. => ");
//		str2 = scan.nextLine();
//		maxNum = Integer.parseInt(str2);
//	}
//	void printNum(){
//		for(int i = initNum; i<= maxNum; i++){
//			System.out.print(i + ", ");
//		}
//	}
	
	void inputScore(){
		
	}
	
	
//	Father(int a){
//		System.out.println("오버로딩으로 추가한 아빠 생성자 호출!!!");
//	}
	
	

}
