package report.parkjonghun.r0008;

import report.parkjonghun.r0007.Exam11;

public class Exam12 extends Exam11{
	
		Exam12(int a, int b){//상속 받은 클래스의 빈생성자를 찾아가는 이유는 오후에 설명.
			
			this.a = a;
			this.b = b;
		}
	

		public static void main(String[] args){
		Exam12 e12 = new Exam12(1,1);
		
		
		e12.plusLoop();
		e12.printResult();
		
//		e12.mainusLoop();
//		e12.printResult();
//		
//		e12.multipleLoop();
//		e12.printResult();
//		
//		e12.divisionLoop();
//		e12.printResult();
	}

}
