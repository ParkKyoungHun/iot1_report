package report.kimsangcheol.r0006;

import java.util.ArrayList;														//ArrayList클래스를 사용하기 위해 가져옴.
import java.util.Scanner;														//Scanner클래스를 사용하기 위해 가져옴.

public class CalExam {
	
	public static void main(String[] args){
	int []a = new int[10];
	int sum =0;
	Scanner scan = new Scanner(System.in);										
	for(int i=0; i<a.length;i++){												//배열 변수의 길이 만큼 반복
		System.out.println((i+1)+"번째 학생의 점수를 입력하시오.>");				
		a[i]=Integer.parseInt(scan.nextLine());									//입력받은 값을 반복문이 돌때마다 배열변수에 대입
		sum += a[i];															//입력받은 값을 자기자신과 더해 총합을 구함
	}
	System.out.println("학생들의 총점 = "+sum);									//출력
	System.out.println("학생들의 평균 = "+sum/a.length);
	
		ArrayList<Integer> list = new ArrayList<Integer>();						//ArrayList를 Integer타입으로 변수명 list에 초기화
		for(int i=0;i<a.length;i++){											
		list.add(11-a[i]);														//배열변수 a[]의 모든 값들을 list에 반전시켜 대입
	}
	for(int i=0;i<list.size();i++){												//ArrayList변수의 길이만큼 반복
		System.out.println(list.get(i));										//list에 들어있는 값들을 순차적으로 출력
	}
	}
}
