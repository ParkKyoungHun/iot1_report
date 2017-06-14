package report.kimhonggeun.r0004;

import java.util.Scanner;

public class CalPoint {

	public static void main(String[]args){
		
		

		int a1,a2,a3,a4,a5,a6=0;
		
		Scanner s1 = new Scanner(System.in);
//		for(int i=1;i<=6;i++){
			
			System.out.print("1번 학생 점수 = ");
			String n1 = s1.nextLine();
			a1 = Integer.parseInt(n1);
			
			System.out.print("2번 학생 점수 = ");
			n1 = s1.nextLine();
			a2 = Integer.parseInt(n1);
			
			System.out.print("3번 학생 점수 = ");
			n1 = s1.nextLine();
			a3 = Integer.parseInt(n1);
			
			System.out.print("4번 학생 점수 = ");
			n1 = s1.nextLine();
			a4 = Integer.parseInt(n1);
			
			System.out.print("5번 학생 점수 = ");
			n1 = s1.nextLine();
			a5 = Integer.parseInt(n1);
			
			System.out.print("6번 학생 점수 = ");
			n1 = s1.nextLine();
			a6 = Integer.parseInt(n1);


			int result = a1+a2+a3+a4+a5+a6;
			System.out.println("학생들의 점수 총합 = " +result);
		
		

		
	}
	
}
