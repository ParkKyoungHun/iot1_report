package report.kimsangcheol.r0006;

public class Son extends Father{			//Father 를 상속 받음. <다중 상속 불가능>
	int a;
	
	int getAge(){							//상속 받은 함수들은 재정의를 할 수 있음. Overriding
		age =25;
		return age;
	}
	public static void main(String[] args){
		Son s = new Son();
		s.a = 3;
		System.out.println(s.age);
		System.out.println(s.getAge());
		System.out.println(s.age);
	
//		Father f = new Father();
//		System.out.println(f.address);
		
	}
}
