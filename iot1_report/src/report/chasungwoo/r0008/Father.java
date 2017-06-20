package report.chasungwoo.r0008;

public class Father {
	Father(){
		System.out.println("calling my son now");
	}
	public static void main(String[] args){
		Son s = new Son();
		System.out.println(s);
	}

}
