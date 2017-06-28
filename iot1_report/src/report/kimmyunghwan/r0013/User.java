package report.kimmyunghwan.r0013;

public class User {

	
	private InterfaceExam ie;
	User(String operator){
		if(operator.equals("+")){
			ie = new Plus();
		}else if(operator.equals("-")){
			ie = new Minus();
		}else if(operator.equals("*")){
			ie = new Multiple();
		}else if(operator.equals("/")){
			ie = new Division();
		}else{
			System.out.println("연산자 잘못 입력 했습니다");
		}
	}
	
	public InterfaceExam getInterfaceExam(){
		return ie;
	}
	
	public static void main(String[] args) {
		User u = new User("+");
		InterfaceExam ie =u.getInterfaceExam();
		int result = ie.cal(3,4);
		System.out.println(result);
		
		u = new User("-");
		ie =u.getInterfaceExam();
		result = ie.cal(3,4);
		System.out.println(result);
		
		u = new User("*");
		ie =u.getInterfaceExam();
		result = ie.cal(3,4);
		System.out.println(result);
		
		u = new User("/");
		ie =u.getInterfaceExam();
		result = ie.cal(3,4);
		System.out.println(result);
	
	
	
	
	
//	public static void main(String[] args) {
//		InterfaceExam ie = new Minus();		//InterFaceExam 가 Exam보다 상위여서 가능하다  Exam() 생성자~
//		InterfaceExam ie2 = new Plus();
//		
//		/* 상속은 한번에 한클래스만 가리킬수 있지만
//		 * 인터페이스는 여러개~~그리고 각각의 다른 생성자를 사용할수 있다.
//		 */
//		
//		
//		String str = ie.getString();
//		System.out.println(str);
//		
//		String str2 = ie2.getString();
//		System.out.println(str2);
//		
//		InterfaceExam2 ie3 = new Plus();	//데이터타입(InterFaceExam2)에서 명시한것만 사용 가능 아래에서 에러 사라짐
//		int a = ie3.getInt();
//		System.out.println(a);
//		ie3.setInt(a);
//		
//		/* 
//		 */
		
		

	}//main end

}//class end
