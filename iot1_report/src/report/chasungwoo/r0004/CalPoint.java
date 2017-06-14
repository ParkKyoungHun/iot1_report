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

	public void output(int[] input){

		int k = 0;
		for(int i=0; i<input.length; i++){
			k += input[i];
		}
		System.out.println("총점은 : " + k + "점이며 평균 점수는 " + k/input.length + "점 입니다.");
	}

	public static void main(String[] args){

		CalPoint cp = new CalPoint();
		int[] input = cp.getVal();
		cp.output(input);
	}
}
