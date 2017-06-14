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
			sum += a[i];								//합계
			
			for (int j = i ; j <a.length; j++){			//오름차순 정렬 시작													
				if(a[i] > a[j]){
					tmp =a [i];
					a[i] = a [j];
					a [j] = tmp;
				}
				
			}
		}
		for (int i=0; i<a.length;i++){
			System.out.println((i+1) + "의 점수 : " + a[i]);
		}
		System.out.println("모든 점수의 합 : " + sum);
	}

}
