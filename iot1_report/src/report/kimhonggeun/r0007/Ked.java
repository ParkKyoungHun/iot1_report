package report.kimhonggeun.r0007;

import java.util.Scanner;

public class Ked {

	//Scanner클래스의 nextLine()함수를 사용하여 초기값과 맥스값을 입력받아라
	//위에서 받은 초기값부터 맥스값 까지 반복하는 반복문을 작성해
	//스트링 배열변수를 선언해
	//해당배열변수의 방의 갯수는 위에서 받아온 초기값과 맥스값으로 계산해야 에러가 나지않아
	//해당반복문에서 Scanner클래스의 nextLine()함수를 사용하여 위에서 선언한
	//스트링 배열변수에 0번째 인덱스부터 마지막 방의 인덱스까지 값을 받아
	//다음 반복문에서 스트링배열변수가 가진 모든방의 값을 출력해


	public static void main(String[]args){

		Scanner s = new Scanner(System.in);
		System.out.print("초기값 = ");
		String s1 = s.nextLine();
		int num1 = Integer.parseInt(s1);

		System.out.print("맥스값 = ");
		String s2 = s.nextLine();
		int num2 = Integer.parseInt(s2);

		int[] a= new int [num1];
		int[] b= new int [num2];

		for(num1=0;num1<num2;num1++){

			System.out.print(num1 + "번째 인덱스값 = ");
			String z1 = s.nextLine();
			b[num1] = Integer.parseInt(z1);	

		}
		for(int i=0;i<num2;i++){
			System.out.println("입력한 "+i+"번째 인덱스값 =" + b[i]);
		}
	}
}