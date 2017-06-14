package report.kimhonggeun.r0002;

//import java.util.Scanner;

public class Test {

	
	public void printMultipleTable(int initNum, int maxNum){
		
		int i =0;
		int j=0;
		for(i=initNum;i<=maxNum;i++){

			for(j=initNum;j<maxNum;j++){

				
				System.out.print(i + " X " + j +" = " + (i*j) + " , ");
			}
			System.out.println(i + " X " + j +" = " + (i*j));
		}
			
	}
	public static void main(String[]args){
		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("원하는 단 수 = ");
//		String num = scan.nextLine();
//		int k = Integer.parseInt(num);
		
//		a=k;
		
		Test t1 = new Test();
		t1.printMultipleTable(1, 5);
		
		
		
//		for(i=1;i<=9;i++){

//			for(j=1;j<=9;j++){

				
//				System.out.print(i + " X " + j +" = " + (i*j) + " , ");
//			}
//			System.out.println(i + " X " + j +" = " + (i*j));
//		}
	}
}
