package report.kimhonggeun.r0005;

public class Cal2 {
	//printPlus(), printMinus(),printMultiple(),printDivision()
	//Cal2(int num1, int num2, String operator) 생성자 선언하여
	//각각의 멤버변수에 대입해주세요.
	//그리고 위의 함수를 호출했을때 원하는 결과값 출력.
	int num1,num2;
	String operator;
	void printPlus(){
		if(operator.equals("+")){
		System.out.println(num1+num2);
		}
	}
	void printMinus(){
		if(operator.equals("-")){
		System.out.println(num1-num2);
		}
	}
	void printMultiple(){
		if(operator.equals("*")){
		System.out.println(num1*num2);
		}
	}
	void printDivision(){
		if(operator.equals("/")){
		System.out.println(num1/num2);
		}
	}
	public Cal2(int num1, int num2, String operator){
		this.num1=num1;
		this.num2=num2;
		this.operator=operator;
	}
	public static void main(String[]args){
		Cal2 c8 = new Cal2(1,2,"+");
		c8.printPlus();
		c8.printMinus();
		c8.printMultiple();
		c8.printDivision();
	}
}
