package report.parkkyounghun.r0004;

import java.util.Scanner;

public class CalPoint2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int result = 0;
		int[] num = new int[2];
		for(int i=0;i<num.length;i++){
			System.out.println((i+1) + "번째 학생의 점수를 입력해주세요=>:");
			String numStr = scan.nextLine();
			num[i] = Integer.parseInt(numStr);
			result += num[i];
		}
		System.out.println("입력하신 5학생의 점수의 총점 = " + (result));
		System.out.println("입력하신 5학생의 평균 점수 = " + (result/num.length));

		for(int i=0;i<num.length;i++){
			for(int j=i+1;j<num.length;j++){
				if(num[i]<num[j]){
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
			}
		}
		for(int i=0;i<num.length;i++){
			System.out.println(num[i]);
		}
	}
}
