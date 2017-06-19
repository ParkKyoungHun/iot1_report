package report.kimhonggeun.r0006;

import java.util.Scanner;

public class Ked {

	int grade(int[] arr, int num){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==num){
				return i;
			}
		}
		return -1;
	}

	public static void main(String[]args){

		int[] b= new int[3];
		int[] d= new int[3];
		int c=0;
		int re=0;


		Scanner s1 = new Scanner(System.in);

		for(int i=0;i<b.length;i++){

			System.out.print((i+1)+"번 학생의 점수 =");
			String n1 = s1.nextLine();

			b[i] = Integer.parseInt(n1);
			d[i] = i+1;
			re+=b[i];
		}

		System.out.print("학생들의 총점 =" + re);
		System.out.println();
		System.out.print("학생들의 평균 =" + re/b.length);
		System.out.println();
	
		for(int i=0;i<b.length;i++){
			for(int j=i+1;j<b.length;j++){
				if(b[i]<b[j]){
					c=b[i];
					b[i]=b[j];
					b[j]=c;
					
					c=d[i];
					d[i]=d[j];
					d[j]=c;
				}
			}
		}

		for (int k = 0; k<b.length ; k++) {
			System.out.print((k+1)+"등 ="+b[k]+", ");
			System.out.println(d[k] + "번째 학생의 점수 = " +b[k]+", ");
		}		
	}
}

