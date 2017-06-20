package report.kimsangcheol.r0008;

import java.util.Scanner;

public class Father {
	int a=3;
	Scanner scan;
	String str1, str2;
	Father(){
		scan = new Scanner(System.in);
		System.out.println("기본 아빠 생성자 호출!!!");
	}
	void inputFromScanner1(){
		str1=scan.nextLine();
	}
	void inputFromScanner2(){
		str2=scan.nextLine();
	}
	void printInput(){
		inputFromScanner1();
		inputFromScanner2();
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		if (num1>num2){
			int temp;
			temp=num1;
			num1=num2;
			num2=temp;
		}else{
		}
		for(int i=num1;i<=num2;i++){
			System.out.println(i);
		}
	}
}