package report.kimjeongkyu.r0004;

import java.util.Scanner;

public class CalPoint {
	//Calculate students' scores.
	//Recommend using Scanner method.
	//students = 6. need to print out of SUM.

	public void GetScores(){
		int[] a = new int[6];
		Scanner scaner = new Scanner(System.in);
		int total=0;
		
		for(int i=0; i<6; i++){
			System.out.println((i+1)+ "번 학생의 점수를 입력 해주세요.");
			String input = scaner.nextLine();
			a[i]= Integer.parseInt(input);
			total = total + a[i];
			}
		System.out.println("6명 학생의 성적 합은 ==>" + total);

	}
	
	public static void main(String[] args){
		CalPoint hey = new CalPoint();
		hey.GetScores();
	}
}
