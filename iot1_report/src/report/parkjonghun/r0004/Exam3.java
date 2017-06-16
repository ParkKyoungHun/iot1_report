package report.parkjonghun.r0004;

import java.util.Scanner;

public class Exam3 {
	int a = 0 ;
	public Exam3(){  //생성자 = 클래스명과 동일한 이름이어야 한다. 
		//return 타입이 없기 때문에 void도 쓸 필요가 없음.
		// 파라미터가 들어가면 이름이 같더라도 같은 함수가 아니다.
		//해당 현상을 java에서 오버로딩(over roding)이라고 함.
		//같은 함수명에 같은 파라미터가 들어갈 시 같은 함수가 되기 때문에 사용할 수 없음. (다른 타입에 파라미터일 시에는 정상적으로 작동.)
	 
	}
	public Exam3(int a){ 
	}
	
	
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Exam3 e = new Exam3();
		System.out.println(e.a);
		int a = 4;
		System.out.println(a);
	}

}
