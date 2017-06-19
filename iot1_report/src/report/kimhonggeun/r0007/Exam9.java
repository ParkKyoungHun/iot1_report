package report.kimhonggeun.r0007;

import java.util.Scanner;

public class Exam9 {

	private int a;
	private int b;
	private int result;
	Scanner scan = new Scanner(System.in);
	
	public void getA(){
		System.out.print("시작숫자 = ");
		this.a = Integer.parseInt(scan.nextLine());
		
		System.out.print("끝숫자 = ");
		this.b = Integer.parseInt(scan.nextLine());
	}
	public void pr(){
		for(int i=a;i<=b;i++){
			this.result+=i;
		}
	}

	public void printResult(){
		System.out.println("시작부터 끝까지 더한값 = " +result);
	}
}


