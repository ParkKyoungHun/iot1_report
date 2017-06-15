package report.kimmyunghwan.r0005;

public class Cal2_01 {
	// 강사님 코드
	

	int num1;
	int num2;
	String operator;
	

	Cal2_01(int num1, int num2, String operator) {
		this.num1 = num1;
		this.num2 = num2;
		this.operator = operator;

	}

	void pritnPlus() {
		
		System.out.println(num1+num2);
	}

	void pritnMinus() {
		
		System.out.println(num1 - num2);
	}

	void pritnMultiple() {
	
		System.out.println(num1 * num2);
	}

	void pritnDivision() {
		
		System.out.println(num1 / num2);
	}

	

	public static void main(String[] args) {
		Cal2_01 c2 = new Cal2_01(20, 4, "");
		
		 c2.pritnPlus();
		 c2.pritnMinus();
		 c2.pritnMultiple();
		 c2.pritnDivision();
	}

}
