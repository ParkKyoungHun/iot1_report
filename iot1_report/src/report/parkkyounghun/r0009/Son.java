package report.parkkyounghun.r0009;

public class Son extends Father{

	public String getStr(){
		return "아부지 아들입니다.";
	}
	public static void main(String[] args){
		Father f = new Father();
		Son s = new Son();
		String str = s.getStr();
		String str2 = s.toString();
		
		System.out.println(f.equals(s));
	}
}
