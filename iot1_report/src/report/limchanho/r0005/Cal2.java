package report.limchanho.r0005;

public class Cal2 {
	// int형변수 2개를 멤버변수로
	// 스트링형 변수 1개 생성
	// num1 2 oper

	// printP M M Division
	// Cal2(int num1,int num2 SO 생성자 선언
	// 가각ㄱ 멤버변수 대입
	int num1, num2;
	String operator;
	
	void printPlus(){
		System.out.println((num1+num2));
	}
	void printMinus(){
		System.out.println((num1-num2));
	}
    void x(){
    	System.out.println((num1*num2));
    }
    void n(){
    	System.out.println((num1/num2));
    }
	Cal2(int num1, int num2, String operator) {
		
		this.num1 = num1;
		this.num2 = num2;
		this.operator = operator;

	}

	Cal2(){}
	public static void main(String[] args) {
		Cal2 c2 = new Cal2(1 , 2 , "+");
		c2.printPlus();
		c2.printMinus();
		c2.x();
		c2.n();

	}

}
