package report.kimsangcheol.r0008;

public class Father {
	
	Father(){
		this(1);
		System.out.println("기본 아빠 생성자 호출!!!");
	}
	Father(int a){
		System.out.println("오버로딩으로 추가한 아빠 생성자 호출!!!");
	}
}
