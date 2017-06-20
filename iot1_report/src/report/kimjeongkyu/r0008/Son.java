package report.kimjeongkyu.r0008;

public class Son extends Father{

	//아빠한테 상송받아서 _ extends  그래서 아빠먼저 실행되고 아들 실행됨	
	Son(){
		System.out.println("아들 생성자 호출!!");
	}
	Son(int a){
		System.out.println("오버로딩 개념으로 추가된 생성자 호출!!");
	}
	
	public static void main(String[] args){
		Son s = new Son();
	}
}
