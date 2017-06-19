package report.parkjonghun.r0004;

import java.util.Scanner;

public class CalPoint2 {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int result = 0;
		int[] num = new int[5];
		
		for(int i = 0; i < num.length; i++){
			System.out.print((i+1) + "번째 학생의 점수를 입력하세요. > ");
			String numStr = scan.nextLine();
			num[i] = Integer.parseInt(numStr);
			
			result += num[i];
		}
		System.out.println("입력하신 5학생의 점수의 총점 = " + result);
		
		System.out.println("모든 학생들의 평균은 >" +  result / 5);
		for(int i=0; i<num.length; i++){   //이 부분 좀 더 공부
			for(int j = i+1;j<num.length; j++){
				if(num[i]<num[j]){
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}			
			}
			
				
		}
		for(int i = 0; i < num.length; i++){
			System.out.println("입력하신 " + (i+1) + " 번째 학생의 점수 = " + num[i]);
			
		}
	}

}
