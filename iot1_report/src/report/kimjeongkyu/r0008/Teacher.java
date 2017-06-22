package report.kimjeongkyu.r0008;

import java.util.Scanner;

public class Teacher {

	int[] a = new int [10];
	Scanner scan;
	String str;
	int num;
	int sum =0;
	Teacher() {
		scan = new Scanner(System.in);
		getScores();
	}

	void getScores() {
		for(int i=0; i<a.length; i++){
			System.out.println((i+1) + "번 학생의 점수를 입력해주세요");
			a[i] = Integer.parseInt(scan.nextLine());
		}
	}


	void printResult() {
		for (int i = 0; i < a.length; i++) {
			System.out.println((i+1) +"번 학생의 점수는 --->" + a[i]);
		}
	}
	
	void sum(){
		for(int i=0; i < a.length; i++){
			sum = sum + a[i];
		}
		System.out.println();
		System.out.println("10명 학생의 총 합 ---> " + sum);
	}

}
