package report.chasungwoo.r0005;

public class Cal2 {

	int num1; 
	int num2;
	String operator;

	Cal2(){}

	void printPlus(){
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
	}
	void printMinus(){
		System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
	}
	void printMultiple(){
		System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
	}
	void printDivision(){
		System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
	}

	Cal2(int num1, int num2, String operator){
		this.num1 = num1;
		this.num2 = num2;
		this.operator = operator;
	}


	public static void main(String[] args){
		Cal2 cl2 = new Cal2(12,9,"/");
		
		if(cl2.operator.equals("+")){
			cl2.printPlus();
		}else if(cl2.operator.equals("-")){
			cl2.printMinus();			
		}else if(cl2.operator.equals("*")){
			cl2.printMultiple();
		}else if(cl2.operator.equals("/")){
			cl2.printDivision();
		}else{
			System.out.println("wrong operator. do it over.");
		}
	}
}
