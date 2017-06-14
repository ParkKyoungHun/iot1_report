package report.kimjeongkyu.r0004;

import java.util.Scanner;

public class CalPoint {
	//Array students' scores.
	//Recommend using Scanner method.
	//students =6 and  highest scores to lowest scores.
	public void GetScores(){
		int[] a = new int[3];
		Scanner scaner = new Scanner(System.in);
		
		for(int i=0; i<a.length; i++){
			System.out.println((i+1)+ "번 학생의 점수를 입력 해주세요.");
			String input = scaner.nextLine();
			a[i]= Integer.parseInt(input);
		}		
		
		for(int i =0; i<a.length; i++){
			for(int j=i; j<a.length; j++){
				if(a[i]<a[j]){
					int temp = a[i];
					a[i]= a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int i = 0; i<a.length; i++){
			System.out.println(a[i]);
				
		}
		
}
	
	public static void main(String[] args){
		CalPoint hey = new CalPoint();
		hey.GetScores();
	}
}
