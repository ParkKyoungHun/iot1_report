package report.parkkyounghun.r0004;

import java.util.Scanner;

public class Exam3 {

	public int getPlusExam(int a){
		a+=2;
		a+=1;
		a+=1;
		return a;
	}
	public static void main(String[] args){
		Exam3 a =new Exam3();
		int num = a.getPlusExam(3);
		System.out.println(num);
		Scanner scan = new Scanner(System.in);
		
	}
}
