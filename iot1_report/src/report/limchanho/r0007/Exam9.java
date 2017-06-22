package report.limchanho.r0007;

import java.util.Scanner;

public class Exam9 {

	// Exam90dp private int ab resul 선언//
	// e9생성자에서 a값과 b값을 scanner클래스의 nextLine함수를 사용하여 대입
	// i가 a부터 b까지 도는 반복문 작성
	// result i를 반복문만큼 더하는 함수 작성
	// 리절트값을 출력하는 함수를 작성 e10에서 출력해주시기 바랍니다.

	private int a;//
	private int b;//
	private int result;//
	Scanner scan;//

	public Exam9() {
		Scanner scan = new Scanner(System.in);//
	
	}

	public void inputA() {
		System.out.println("초기값을 입력해주세요");//
		this.a = Integer.parseInt(scan.nextLine());//

	}

	public void inputB(){
		System.out.println("맥스값을 입력해주세요");//
		this.b = Integer.parseInt(scan.nextLine());//

	}

	public void doLoop() {//
		for (int i = a; i <= b; i++) {//
			this.result += i;//
		}
	}

	public int getResult() {
		return result;
	}

	public void getResultPrint() {
		System.out.println(result);

	}
}
