package report.parkjonghun.r0006;
//형상 변형 툴 그레드, 깃 , svn  찾아서 한번 사용해보기.
public class Son extends Father{ //Son extends Father 파더 클래스에서 상속받아 손클래스에서 사용이 가능하다.
	//상속은 다중 상속이 되지 않는다.
	int a;
	
	//오버 라이딩과 오버로딩의 개념을 확실하게 알기!!(시험) 오버라이딩은 함수의 재정의이며
//	int getAge(){ // 현재 getAge()안에는 65의 아버지 나이가 들어가있지만
//				  // Father 크래스에 getAge 클래스가 있지만 Son클래스에서 함수의 재정의가 되어 25가 출력됨.
//		age = 25; // 해당의 개념을 오버라이딩이라고 함.
//		return age;
//	}
	public static void main(String[] args){
		Son s = new Son();
		s.a = 3;
		
		System.out.println(s.getAge());
		System.out.println(s.getAddress());
		System.out.println(s.getName());
		s.setName("박종훈");
		System.out.println(s.getName());
		
//		System.out.println(s.age); //여기서는 아직 함수의 재정의가 되지 않았기 때문에 65가 출력.
//		System.out.println(s.getAge()); // 함수의 재정의가 됨. (함수에서 age의 값을 정의해서 리턴함.) 
//		System.out.println(s.age); // 재정의가 되어서 25의 값이 출력됨.	
//		System.out.println(s.address);
//		Father f = new Father();
//		System.out.println(f.getAge());
//		System.out.println(f.getAddress());
//		System.out.println(f.getName());
//		System.out.println(f.address);
//		
		
	}
	
}
