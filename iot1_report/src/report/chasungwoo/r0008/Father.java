package report.chasungwoo.r0008;

import java.util.Scanner;

public class Father {
	
	Scanner scan;
	String str1, str2;
	int x, y;
	int[] a= new int[10];

	Father(){
		scan = new Scanner(System.in);
		System.out.println("아빠 기본생성자 호출!!");
	}
	Father(int a){
		System.out.println("오버로딩 개념으로 추가된 아빠 생성자 호출!!");
	}
	void inputFromScanner1(){
		str1=scan.nextLine();
		x = Integer.parseInt(str1);
	}
	void inputFormScanner2(){
		str2=scan.nextLine();
		y = Integer.parseInt(str2);
	}
	void compNum(){
		int temp;
		if(y<x){
			temp = x;
			x = y;
			y = temp;
		}
	}
	void funcFor(){
		for(int z = x; z<=y; z++){
			System.out.println(z);
		}
	}
	void studentPoints(){
		for(int i = 0; i < 10; i++ ){
			a[i]=Integer.parseInt(scan.nextLine());
		}
	}
	void printGrade(){
		String grade[] = new String[10];
		for(int j=0; j<10; j++){
			System.out.print((j+1)+"번째 학생의 성적은");
			if(a[j] <= 50){
				grade[j] = "F";
			}else if(a[j]<=69){
				grade[j] = "D";
			}else if(a[j]<=79){
				grade[j] = "C";
			}else if(a[j]<=89){
				grade[j] = "B";
			}else if(a[j]<=100){
				grade[j] = "A";
			}else{
				grade[j] = "SUPER";
			}
			System.out.println(grade[j]);
		}
	}
}
