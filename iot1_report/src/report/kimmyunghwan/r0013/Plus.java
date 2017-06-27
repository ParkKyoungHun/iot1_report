package report.kimmyunghwan.r0013;

public class Plus implements InterfaceExam{

	
		
	@Override 	//jvm을 위한 주석
	public String getString() {
		
		return "Test의 getString() 함수 호출!!";
	}

	@Override
	public void setString(String str) {
		System.out.println("Test의 SetString()함수 호출!!" + str);
		
	}
	
	public int cal(int a, int b){
		return a+b;
	}
	
//	@Override
//	public int getInt() {
//		System.out.println("Test의 getInt()함수 호출!!");
//		return 0;
//	}
//
//	@Override
//	public void setInt(int str) {
//		System.out.println("Test의 getInt()함수 호출!!" + str);
//		
//	}

}//class end
