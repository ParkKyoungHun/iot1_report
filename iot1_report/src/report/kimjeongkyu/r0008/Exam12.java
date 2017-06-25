package report.kimjeongkyu.r0008;

import report.kimjeongkyu.r0007.Exam11;

public class Exam12 extends Exam11{

	Exam12(int a, int b){
		//super는 기본생성자가 없어도 무조건 불러오게 땡겨오는것.
		super(a,b);
		this.a = a;
		this.b = b;
	}
	public static void main(String[] args){
		
		//protected 된 변수는 바로 불러올수 없다. 그래서 
		//Exam12 함수를 만들고 
		Exam12 e12 =new Exam12(1,2);
		e12.plus();
		System.out.println("Result of +");
		e12.printResult();
		System.out.println();
				
		e12.minus();
		System.out.println("Result of -");
		e12.printResult();
		System.out.println();
		
		e12.multi();
		System.out.println("Result of *");
		e12.printResult();
		System.out.println();
		
		e12.division();
		System.out.println("Result of /");
		e12.printResult();
		
	}
}
