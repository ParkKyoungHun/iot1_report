package report.kimsangcheol.r0008;

public class Son extends Father{
	
	Son(){
		super(1);
		System.out.println("기본 아들 생성자 호출!!!");
		
	}
	Son(int a){
		System.out.println("오버로딩으로 추가한 아들 생성자 호출!!!");		//Son생성자 호출 하기 전에 Father생성자를 먼저 호출
	}
	public static void main(String[]args){
		Son s = new Son();
		System.out.println(s);
	}

}
