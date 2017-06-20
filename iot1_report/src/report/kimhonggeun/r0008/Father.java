package report.kimhonggeun.r0008;

import java.util.Scanner;

public class Father {
	int a = 3;
	Scanner scan;
	String str1, str2;
	int s1, s2;
	int[] z1= new int[10];
	String x1,x2;
	int c1,c2,c3;
	int[] z2= new int[10];
	Father(){
		scan = new Scanner(System.in);
		System.out.println("아빠 기본생성자 호출!!");
	}
	void inputFormScanner1(){
		System.out.print("처음값");
		str1 = scan.nextLine();
		s1=Integer.parseInt(str1);

	}
	void inputFormScanner2(){
		System.out.print("마지막값");
		str2 = scan.nextLine();
		s2=Integer.parseInt(str2);
	}
	void doLoop(){
		for(int i=s1;i<=s2;i++){
			System.out.println(i);	
		}
	}
	void arr(){
		for(int i=0;i<z1.length;i++){
			System.out.print((i+1)+"번째 학생 점수 =");
			x1 = scan.nextLine();
			c1 = Integer.parseInt(x1);
			z1[i]=c1;
			c2 +=c1;
		}
		for(int i=0;i<z1.length;i++){
			for(int j=i+1;j<z1.length;j++){
				if(z1[i]<z1[j]){
					c3=z1[j];
					z1[j]=z1[i];
					z1[i]=c3;
				}
			}
		}
		for(int i=0;i<z1.length;i++){
			System.out.println("입력한 "+(i+1)+"번째 학생의 점수 =" +z1[i]);	
		}
		System.out.println("학생들 점수 총합 =" +c2);
		System.out.println("학생점수 평균 =" + (c2/z1.length));
		for(int j=0;j<z1.length;j++){
			System.out.print(z1[j]+", ");
		}

	}
}
//아빠 클래스에서 값을 str1, str2를 scanner클래스의 nextLine()함수를 사용하여 값을 입력받아 주세요.
//숫자값을 입력받아 정수를 변환해주시고
//첫번째 값은 반복분의 초기값 두번째값은 반복문의 맥스값
//반복문만큼 i를 값을 출력하는 함수를 아빠 클래스에 선언해주시고
//아들클래스에서 호출하여 결과값을 나타내주세요.