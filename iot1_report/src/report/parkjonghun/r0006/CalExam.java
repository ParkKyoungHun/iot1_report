package report.parkjonghun.r0006;

import java.util.Scanner;

public class CalExam {
	//반복문을 사용하여 Scanner클래스를 이용해
	//총 10명의 학생의 점수를 받아주세요.
	//10명의 학생의 총점과 평균을 구해주세요.
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] result = new int[3];
		int[] result2 = new int[3];
		int score = 0;
		int plusResult = 0;
		
		
		
		
		
		for(int i = 0; i < 3; i++){ // 입력 식.
			System.out.print((i+1) + "번 학생의 점수를 입력해주세요.");
			score = Integer.parseInt(scan.nextLine());
			result[i] = score;
			
			plusResult += result[i];  //총점을 구하는 식.
		}
		System.out.println("학생들의 총점은 => " + plusResult);
		System.out.println("학생 들의 평균은 => " + (plusResult/(result.length))); //평균을 구하는 식.
		
		for(int i = 0; i < 3; i++){		//오름 차순 이해안됨.
			for(int j = i+1; j < 3; j++){
				if(j<3 && result[i]<result[j]){
					int temp = result[i];
					result[i] = result[j];
					result[j] = temp;
				}		
			}
		}
		for(int i = 0; i < 3; i++){ 
			System.out.print((i+1) + "등 몇 점 => "+ result[i]);
			System.out.println(", "+ result[i] + " 몇 번째 학생입니다.");

		}
		
		
	}

}
