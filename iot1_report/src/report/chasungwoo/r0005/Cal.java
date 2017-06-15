package report.chasungwoo.r0005;

import java.util.Scanner;

public class Cal {
	int hydeA;
	int hydeB;
	String str;
	
	Cal(){
		
	}
	
	Cal(int a){
		System.out.println(a + "불렀냐");
		this.hydeA=a;

	}

	void receiver(int a, int b){
		this.hydeA = a;
		this.hydeB = b;
	}
	
	void receiver(int a, int b, String str){
		this.hydeA = a;
		this.hydeB = b;
		this.str = str;
	}
	void printPlus(){
		System.out.println(this.hydeA + this.hydeB );
	}

	void printCal(){
		if(str.equals("+")){
			System.out.println(hydeA + hydeB);
		}else if(str.equals("-")){
			System.out.println(hydeA - hydeB);
		}else if(str.equals("*")){
			System.out.println(hydeA * hydeB);
		}else if(str.equals("/")){
			System.out.println(hydeA / hydeB);
		}else{
			System.out.println("wrong operator");
		}
	}


	void calcIn(){
		Scanner scan = new Scanner(System.in);
		this.str = scan.nextLine();
		scan.close();
	}

	public static void main(String[] args){

		Cal cl = new Cal();
		cl.receiver(4,5);
		cl.calcIn();
		cl.printPlus();
		cl.printCal();
	}

}
