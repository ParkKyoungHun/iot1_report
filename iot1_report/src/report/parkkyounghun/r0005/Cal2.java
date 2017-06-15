package report.parkkyounghun.r0005;

public class Cal2 {
	int num1, num2;
	String operator;

	void printPlus(){
		System.out.println(num1+num2);
	}
	void printMinus(){
		System.out.println(num1-num2);
	}
	void printMultiple(){
		System.out.println(num1*num2);
	}
	void printDivision(){
		System.out.println(num1/num2);
	}
	Cal2(int num1, int num2, String operator){
		this.num1 = num1;
		this.num2 = num2;
		this.operator = operator;
	}
	public static void main(String[] args){
		Cal2 c2 = new Cal2(1,2,"+");
		c2.printDivision();
		c2.printMinus();
		c2.printMultiple();
		c2.printPlus();
	}
}
