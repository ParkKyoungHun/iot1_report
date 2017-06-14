package report.chasungwoo.r0004;

import java.util.Scanner;

public class CalPoint {

	public int[] getVal(){

		int[] x = new int[6];
		Scanner scan = new Scanner(System.in);
		for(int a =0; a < 6; a++){
			String data = scan.nextLine();
			int b = Integer.parseInt(data);
			x[a] = b;
		}
		scan.close();
		return x;
	}

	public void output(int[] input, int[]mtm){

		int k = 0;
		for(int i=0; i<input.length; i++){
			k += input[i];
		}
		System.out.println("총점은 : " + k + "점이며 평균 점수는 " + k/input.length + "점 입니다.");
		System.out.print("오름차순으로 정렬하면 ( " );
		for(int j=0; j<mtm.length; j++){
			System.out.print(" " + mtm[j] +" " );	
		}
		System.out.println(" ) 입니다.");

	}

	public int[] minToMax(int[] input){

		for(int k = 0; k<input.length; k++){
			for(int i=k+1; i<input.length; i++){
				int tmp;
				if(input[k]<input[i]){
					tmp = input[k];
					input[k] = input[i];
					input[i] = tmp;
				}
			}
		}
		return input;
	}
	public static void main(String[] args){

		CalPoint cp = new CalPoint();
		int[] input = cp.getVal();
		int[] mtm = cp.minToMax(input);

		cp.output(input, mtm);
	}
}
