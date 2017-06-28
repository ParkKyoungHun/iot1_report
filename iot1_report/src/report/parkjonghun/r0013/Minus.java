package report.parkjonghun.r0013;

public class Minus implements InterfaceExam { //인터페이스를 상속 받을 시에는 implements을 사용한다.
//인터페이스는 다중 상속이 가능하다. 
	
	@Override
	public String getString() {  // @를 어노테이션이라고 함.
	
		return "Exam의 getSring() 함수 호출!!";  // 주석은 코멘트라고도 한다.
	}

	@Override
	public void setString(String str) {
		// TODO Auto-generated method stub
		System.out.println("Exam의 setString() 함수 호출!!" + str);
		
	}

	public int cal(int a, int b){
		return a-b;
	}

	
}
