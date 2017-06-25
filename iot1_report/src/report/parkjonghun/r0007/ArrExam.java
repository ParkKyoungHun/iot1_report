package report.parkjonghun.r0007;

import java.util.Scanner;

public class ArrExam {
	// Scanner 클래스의 nextLine() 함수를 사용하여 초기값과 맥스값을 입력받아주세요.
		// 위에서 받은 초기 값부터 맥스 값까지 반복하는 반복문을 작성해주세요.
		// 스트링 배열변수를 선언해주세요.
		// 해당 배열변수의 방의 갯수는 위에서 받아온 초기값과 맥스값으로 계산해야 에러가 나지 않습니다.
		// 해당 반복문에서 Scanner 클래스의 nextLine() 함수를 사용하여 위에서 선언한
		// 스트링 배열변수에 0번째 인덱스부터 마지막 방의 인덱스까지 값을 받아주세요.
		// 다음 반복문에서 스트링 배열변수가 가진 모든 방의 값을 출력해주세요.
		
		public static void main(String[] args){
			Scanner scan = new Scanner(System.in);
		
			System.out.print("초기 값을 입력해주세요. => ");
			int initNum = Integer.parseInt(scan.nextLine());
			System.out.print("맥스 값을 입력해주세요. => ");
			int lastNum = Integer.parseInt(scan.nextLine());
			
			String[] str = new String[lastNum - (initNum-1)];
			//String[] str = new String[(lastNum - initNum)+1];  강사님이 하신 답.
			
			for(int i = initNum; i <= lastNum; i++){
				str[i-initNum] = scan.nextLine();
			}
			
			for(int i = initNum; i <= lastNum; i++){
				System.out.println(str[i-initNum]);
			}
			
			
		}

}
