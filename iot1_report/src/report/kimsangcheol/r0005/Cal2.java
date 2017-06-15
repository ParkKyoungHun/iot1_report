package report.kimsangcheol.r0005;

public class Cal2 {
	int num1;
	int num2;
	String operator;
	Cal2(int num1, int num2, String operator){
		this.num1=num1;
		this.num2=num2;
		this.operator=operator;
	}

	void printCal(){
		if(operator.equals("+")){
			System.out.println(num1+num2);
		}else if(operator.equals("-")){
			System.out.println(num1-num2);
		}else if(operator.equals("*")){
			System.out.println(num1*num2);
		}else if(operator.equals("/")){
			System.out.println(num1/num2);
		}else{
			System.out.println("연산자를 확인바람");
		}
	}
	
	public static void main(String[] args){
		Cal2 cl = new Cal2(2,3,"*");
		cl.printCal();
	}

}





//	int형변수 2개를 멤버변수로 (클래스안에서 생성해야된다)
//	스트링형 변수 1개를 생성
//	num1,num2,operator
//	print
//	Cal2(int num1 int num2 String operator) 생성자를 선언하여
//	각각의 멤버변수에 대입
//	그리고 위에 함수를 호출 했을 때 원하는 결과값을 출력해주세요.