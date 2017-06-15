package report.kimjeongkyu.r0005;
import java.util.Scanner;

public class Cal2 {
	int num1;
	int num2;
	String operator;
	
	Cal2(int num1, int num2, String operator) {
		this.num1 = 3;
		this.num2 = 5;
	}

	void printPlus() {
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}

	void printMinus() {
		int result = num1 - num2;
		System.out.println(num1 +" - "+ num2 +"= " + result);
	}

	void printMultiple() {
		int result = num1 * num2;
		System.out.println(num1 + " * " + num2 + " = " + result);
	}

	void printDivision() {
		int result = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + result);
	}

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력해주세요.");
		String n1= scanner.nextLine();
		int num1  = Integer.parseInt(n1);
		
		System.out.print("원하시는 연산자를 입력해주세요.");
		String operator= scanner.nextLine();
		
		System.out.print("두번째 숫자를 입력해주세요.");
		String n2= scanner.nextLine();
		int num2  = Integer.parseInt(n2);
		
		Cal2 c2 = new Cal2(num1, num2, operator);
	}
}
