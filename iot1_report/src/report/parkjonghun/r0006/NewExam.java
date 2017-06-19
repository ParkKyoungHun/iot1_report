package report.parkjonghun.r0006;

public class NewExam {
	
	public static void main(String[] args){
		String st1 = "a"; 
		String st2 = "a";
		//System.out.println(st1 == st2);
		//클래스는 ==으로 비교를 하지 않는다. ==은 주소 값을 비교하는 것.
		
		st1 = new String("b");  // new는 새로운 방을 만든거기 때문에 st1의 방과 st2의 주소값이 같을 수가 없기때문에
		st2 = new String("b");  // 해당 코드는 false가 출력되게 됨.(new를 해야만 주소 값이 생성됨.)
		//System.out.println(st1 == st2); 
		//System.out.println(st1.equals(st2)); // equals는 주소값이 아닌 값을 비교하는 함수.
		
		System.out.println("asdf" == "asdf"); //String을 비교할 때는 무조건 .equals() 함수를 사용해라!~!
		
		
		
	}

}
