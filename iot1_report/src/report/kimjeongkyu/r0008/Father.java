package report.kimjeongkyu.r0008;

import java.util.Scanner;

public class Father {
	int a = 3;
	Scanner scan;
	String str1, str2;
	int initNum, maxNum;
	
	Father(){
		scan = new Scanner(System.in);
		printFormScanner1();
		inputFormScanner2();
	}
	
	void printFormScanner1(){
		System.out.println("str1의 값을 입력해주세요");
		str1 = scan.nextLine();
		initNum = Integer.parseInt(str1);
	}
	
	void inputFormScanner2(){
		System.out.println("str2의 값을 입력해주세요");
		str2 = scan.nextLine();
		maxNum = Integer.parseInt(str2);
	}
	
	void printIWithLoop(){
		for(int i=initNum; i<=maxNum; i++){
			System.out.println(i);
		}

	}

}