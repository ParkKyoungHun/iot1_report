package report.kimhonggeun.r0005;

import java.util.Scanner;
public class Cal {

	int a1;
	int a2;
	int re;
	int a,b;
	String s, n1, n2;
	Scanner s1=new Scanner(System.in);
	
	
	Cal(int a){
		System.out.println(a+"우랴ㅐ랴랴랴랴랴랴");
		this.a=a;
	}
	void str(){
		System.out.print("연산자 선택 =");
		s = s1.nextLine();

		if(s.equals("+")){
			re = a+b;
			System.out.println(n1+s+n2+"="+(re));
		}else if(s.equals("-")){
			re = a-b;
			System.out.println(n1+s+n2+"="+(re));
		}else if(s.equals("*")){
			re = a*b;
			System.out.println(n1+s+n2+"="+(re));
		}else if(s.equals("/")){
			re = a/b;
			System.out.println(n1+s+n2+"="+(re));
		}else{
			System.out.println("뭘친겨");
		}
	}
	public Cal(){
		System.out.print("첫숫자 :");
		n1 = s1.nextLine();
		a = Integer.parseInt(n1);
		System.out.print("둘째숫자 :");
		n2 = s1.nextLine();
		b = Integer.parseInt(n2);

	}
	public Cal(int a1, int a2){
		this.a1=a1;
		this.a2=a2;

	}
	void printPlus(){
		int re= a1+a2;
		System.out.println(re);
	}

	public static void main(String[]args){
		Cal c1 = new Cal(1,2);
		c1.printPlus();

		Cal c2 = new Cal();
		c2.str();

	}
}