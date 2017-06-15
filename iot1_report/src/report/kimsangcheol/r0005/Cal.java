package report.kimsangcheol.r0005;

import java.util.Scanner;

public class Cal {
	int num;
	int num2;
	String a;
	int result;
	Cal( int num,  int num2 , String a){						//생성자님
		this.num=num;
		this.num2=num2;
		this.a=a;
		}
	void printCal(){
		if(a.equals("+")){
			System.out.println(num+num2); 
		}else if(a.equals("-")){
			System.out.println(num-num2);
		}else if(a.equals("*")){
			System.out.println(num*num2);
		}else if(a.equals("/")){
			System.out.println(num/num2);
		}else{
			System.out.println("연산자 확인 필요");
		}
	}
	void printPlus(){
		System.out.println(result);
	}

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Cal c = new Cal(2,3,"+");
		c.printCal();
	}
}
