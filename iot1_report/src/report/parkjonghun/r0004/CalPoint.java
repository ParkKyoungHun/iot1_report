package report.parkjonghun.r0004;

import java.util.Scanner;

public class CalPoint {
	
	// Scanner 클래스를 사용하여 6명의 학생의 점수를 직접 입력 받아주세요.
	// 6명의 학생의 총점을 출력해주세요.
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("1번 학생의 점수를 입력해주세요. > ");
		int student1 = Integer.parseInt(scanner.nextLine());
		
		System.out.print("2번 학생의 점수를 입력해주세요. > ");
		int student2 = Integer.parseInt(scanner.nextLine());
		
		System.out.print("3번 학생의 점수를 입력해주세요. > ");
		int student3 = Integer.parseInt(scanner.nextLine());
		
		System.out.print("4번 학생의 점수를 입력해주세요. > ");
		int student4 = Integer.parseInt(scanner.nextLine());
		
		System.out.print("5번 학생의 점수를 입력해주세요. > ");
		int student5 = Integer.parseInt(scanner.nextLine());
		
		System.out.print("6번 학생의 점수를 입력해주세요. > ");
		int student6 = Integer.parseInt(scanner.nextLine());
		
		int allStudentScore = student1 + student2 + student3 + student4 + student5 + student6;
		System.out.print("모든 학생의 점수의 총 합은 " + allStudentScore + " 입니다.");

		
	}
	
	
}
