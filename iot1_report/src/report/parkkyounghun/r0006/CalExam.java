package report.parkkyounghun.r0006;

import java.util.Scanner;

public class CalExam {
	
	int getGradeFromArray(int[] arrNum, int num){
		for(int i=0;i<arrNum.length;i++){
			if(arrNum[i]==num){
				return i+1;
			}
		}
		return -1;
	}
	// 반복문을 사용하여 Scanner클래스를 이용해
	// 총 10명의 학생의 점수를 받아주세요.
	// 10명의 학생의 총점과 평균을 구해주세요.
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int result = 0;
		int[] num = new int[10];
		int[] num1 = new int[10];
		for(int i=0;i<10;i++){
			String numStr = scan.nextLine();
			num[i] = Integer.parseInt(numStr);
			num1[i] = Integer.parseInt(numStr);
			result += Integer.parseInt(numStr);
		}
		System.out.println("총점 = " +  result);
		
		System.out.println("평균 = " + (result/3));
		
		for(int i=0;i<3;i++){
			for(int j=i+1;j<3;j++){
				if(j<3 && num[i]<num[j]){
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
					
				}
			}
		}
		// 30, 10, 20
		// 30, 20, 10
		CalExam ce = new CalExam();
		for(int i=0;i<3;i++){
			System.out.print((i+1) + "등 = " +  num[i]);
			System.out.println(", " + ce.getGradeFromArray(num1, num[i])+ "번째 입력한 학생");
		}
	}
}
