package report.kimsangcheol.r0004;

import java.util.Scanner;

public class CalPoint {

	public static void main(String[] args){
		Scanner scr = new Scanner(System.in);
		int[]a = new int [6];
		int sum = 0;

		for(int i=0;i<a.length;i++){
			System.out.println((i+1) + "번째 점수를 입력해 주세요.>");	
			a[i] += Integer.parseInt(scr.nextLine());
			sum += a[i];
		}

		System.out.println("총 점수의 합은 : " + sum);
		System.out.println("평균 점수는 : " + sum/6);

	}
}