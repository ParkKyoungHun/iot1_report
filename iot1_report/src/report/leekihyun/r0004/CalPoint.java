package report.leekihyun.r0004;

import java.util.Scanner;

public class CalPoint {

	
	public static void main(String[] args){
		
		//Scanner클래스를 사용하여 6명의 학생의 점수를 직접 입렵 받아주세요.,
		// 6명의 학생의 총점을 출력해주세요
		Scanner scan = new Scanner(System.in);
		System.out.println("1번째 입력바람");
		String a = scan.nextLine();
		System.out.println("1번째 : " + a);
		
		System.out.println("2번째 입력바람");
		String b = scan.nextLine();
		System.out.println("2번째 : " + b);
		
		System.out.println("3번째 입력바람");
		String c = scan.nextLine();
		System.out.println("3번째 : " + c);
		
		System.out.println("4번째 입력바람");
		String d = scan.nextLine();
		System.out.println("4번째 : " + d);
		
		System.out.println("5번째 입력바람");
		String e = scan.nextLine();
		System.out.println("5번째 : " + e);
		
		System.out.println("6번째 입력바람");
		String f = scan.nextLine();
		System.out.println("6번째 : " + f);
		
		System.out.println("입력하신 6명 총점"+a+b+c+d+e+f);
		
		int num1 = Integer.parseInt(a);
		int num2 = Integer.parseInt(b);
		int num3 = Integer.parseInt(c);
		int num4 = Integer.parseInt(d);
		int num5 = Integer.parseInt(e);
		int num6 = Integer.parseInt(f);
		
		
		System.out.println(num1+num2+num3+num4+num5+num6);
	
		
		
		
		
	}
}
