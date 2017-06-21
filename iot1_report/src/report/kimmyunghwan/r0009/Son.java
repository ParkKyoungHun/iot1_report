package report.kimmyunghwan.r0009;

public class Son extends Father{
	public String toString(){
		return "아부지 아들입니다";
	}

	public static void main(String[] args){
		Father f = new Father();
		System.out.println(f);
		Son s = new Son();
		System.out.println(s);
		
//		Father s = new Son(); //앞 Father는 son에 있는 투 스트링
//		System.out.println(s);

	}

}
