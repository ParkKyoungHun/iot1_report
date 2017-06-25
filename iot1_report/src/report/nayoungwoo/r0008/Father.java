package report.nayoungwoo.r0008;

import java.util.Scanner;

public class Father {
	Scanner scan;
	int[] arr = new int[10];
	
	Father() {
		System.out.println("학생의 점수를 입력해주세요");
		scan = new Scanner(System.in);
		
	}	

	void inputFormScanner() {

		for (int i = 0; i < arr.length; i++) {
			String input = scan.nextLine();
			arr[i] = Integer.parseInt(input);
			System.out.println((i + 1) + "번째 학생의 값 = " + arr[i]);
		}
		
		for (int i =0; i < arr.length; i++) {
			for (int j = i+1;j<arr.length;j++){
				
				if (j < arr.length && arr[i] < arr[j]) {
					int saveArr = arr[i];
					arr[i] = arr[j];
					arr[j] = saveArr;
					
				}
			}
			System.out.println("\n" + (i+1) + "등 학생의 점수 = " + arr[i]);
		} 
	}
}
