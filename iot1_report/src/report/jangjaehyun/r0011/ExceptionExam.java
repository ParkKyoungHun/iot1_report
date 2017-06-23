package report.jangjaehyun.r0011;

import java.util.Scanner;

public class ExceptionExam {

	public static void main(String[] args){
	try(
		Scanner scan = new Scanner(System.in);
		System.out.println(" 값을 넣으세요. ");
		String str = scan.nextLine();
		int a = Integer.parseInt(str);
		
		Ststem.out.println(" 숫자만 넣으셨군요 " + a);
	}catch(NumberFormatException e){
		System.out.println(" 숫자가 아닌 다른 문자가 감지되었습니다. ");
	}
}
