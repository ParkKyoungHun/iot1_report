package report.kimhonggeun.r0008;

import report.kimhonggeun.r0008.Father;

public class Son extends Father{




	Son(){
		System.out.println("아들 기본생성자 호출!!");
	}
	Son(int a){
		System.out.println("오버로딩 개념으로 추가된 아들 생성자 호출!!");
	}
	public static void main(String[] args){
		Son s = new Son();
		s.inputFormScanner1();
		s.inputFormScanner2();
		s.doLoop();
		s.arr();
	}
}
