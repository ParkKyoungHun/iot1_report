package report.kimmyunghwan.r0007;

import java.util.Scanner;

public class Exam9 {

	private int a;
	private int b;
	private int result;

	Scanner scan;

	public Exam9() {
		scan = new Scanner(System.in);
	}

	public void inputA() {
		System.out.println("초기값을 입력하세요 => ");
		this.a = Integer.parseInt(scan.nextLine());
	}

	public void inputB() {
		System.out.println("맥스값을 입력하세요 => ");
		this.b = Integer.parseInt(scan.nextLine());
	}

	public void doLoop(){
		for (int i = a; i <= b; i++) {
			result += i;
		}
		
	//public void getResult(){
		System.out.println();
		}
	}
//}

// Scanner scan = new Scanner(System.in);
//
// System.out.println("시작값을 입력하세요");
// String input1 = scan.nextLine();
// int a = Integer.parseInt(input1);
//
// System.out.println("종료값을 입력하세요");
// String input2 = scan.nextLine();
// int b = Integer.parseInt(input2);
//
// for (int i = a; i <= b; i++) {
// result += i;
// }
// System.out.println(a +"부터"+ b+"까지 더한 결과값은 =" + result);
