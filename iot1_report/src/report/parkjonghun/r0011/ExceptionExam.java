package report.parkjonghun.r0011;

import java.util.Scanner;

public class ExceptionExam {
	
	public static void main(String[] args){
		try{
			Scanner scan = new Scanner(System.in);
			System.out.println("값을 넣어보시오.");
			String str = scan.nextLine();
			int a = Integer.parseInt(str);
			
			System.out.println("숫자만 입력하셨군요."+ a);
		}catch(Exception e){ // (Exception = 예외 처리.)
			System.out.println("숫자를 입력해야합니다.");
		}
		
	}

}
