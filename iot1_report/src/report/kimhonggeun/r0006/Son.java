package report.kimhonggeun.r0006;

public class Son extends Father{
	
	int a;
	
//	int getAge(){
//		age = 25;
//		return age;
//		
//		//오버라이딩
//	}
	public static void main(String[]args){
		Son s1 = new Son();
		s1.a=3;
		System.out.println(s1.age);
		System.out.println(s1.getAge());
		System.out.println(s1.age);
		System.out.println(s1.name);
		System.out.println(s1.getAddress());
		s1.setName("박경훈");
		System.out.println(s1.getName());
		System.out.println(s1.name);
		
//		System.out.println(s1.address);
//		System.out.println(s1.getAge());
//		Father f1 = new Father();
//		System.out.println(f1.address);
//		f1.address 는 프라이빗떔시안됨
		
		
		
	}

}
