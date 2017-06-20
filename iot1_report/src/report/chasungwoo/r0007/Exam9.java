package report.chasungwoo.r0007;

import java.util.Scanner;

public class Exam9 {
	private int a;
	private int b;
	private int result;
	
	public void scanner(){
		Scanner scan = new Scanner(System.in);
		this.a = Integer.parseInt(scan.nextLine());
		this.b = Integer.parseInt(scan.nextLine());
		scan.close();
	}
	
	public void loop(){
		for(int i = a; i<= b; i++){
			this.result += i; 
		}
	}
	public void printResult(){
		System.out.println(result);
	}
}
