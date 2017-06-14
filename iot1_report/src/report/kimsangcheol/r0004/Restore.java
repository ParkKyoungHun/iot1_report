package report.kimsangcheol.r0004;

import java.util.Scanner;

public class Restore {

	public static void main(String[] args){
		Scanner scr = new Scanner(System.in);
		int[]a = new int[5];
		int tmp=0;
		int sum=0;
		for(int i=0; i<a.length;i++){
			System.out.println((i+1)+"번째 점수를 입력하시오.>");
			String num = scr.nextLine();
			a[i] = Integer.parseInt(num);
			sum += a[i];

		}
		System.out.println("모든 점수의 합 : " + sum);
	}

}
