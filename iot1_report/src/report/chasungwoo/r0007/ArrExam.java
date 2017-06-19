package report.chasungwoo.r0007;

import java.util.Scanner;

public class ArrExam {
	
	/* Scanner 클래스의 nextLine()함수를 사용하여 초기값과 맥스값을 입력받아주세요.
	 * 위에서 받은 초기값부터 맥스값까지 반복하는 반복문을 작성해주세요
	 * 스트링 배열변수를 선언해주세요
	 * 해당배열변수의 방의 갯수는 위에서 받아온 초기값과 맥스값으로 계산해야 에러가 나지 않습니다
	 * 해당반복문에서 Scanner클래스의 nextLin()함수를 사용하여 위에서 선언한
	 * 스트링 배열변수에 0번째 인덱스부터 마지막 방의 인덱스까지 값을 받아주세요.
	 * 다음 반복문에서 스트링배열변수가 가진 모든 방의 값을 출력해주세요.*/

	int minVal;
	int maxVal;
	Scanner scan = new Scanner(System.in);
	
	void scanner(){

		this.minVal = Integer.parseInt(scan.nextLine());
		this.maxVal = Integer.parseInt(scan.nextLine());
		
		scan.close();
				
	}
	
	int[] loop(){
		int[] j = new int[(maxVal-minVal)+1];
		for(int i = minVal; i<=maxVal; i++ ){
			j[i-1] = Integer.parseInt(scan.nextLine());
		}
		return j;
	}
	
	void print(int[] m){
		for(int r =0; r<m.length; r++){
			System.out.println(m[r-1]);
		}
	}
		
	public static void main(){
		ArrExam ae2 = new ArrExam();
		ae2.scanner();
		int[] k = ae2.loop();
		ae2.print(k);
			

	}
	
}
