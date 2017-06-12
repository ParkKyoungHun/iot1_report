package report.ChaSungwoo.r0002;

import java.util.Scanner;

public class test {
	public void printMultipleTable(int initNum, int maxNum){
		for(int a = initNum; a<=maxNum; a++){
			for(int b = initNum; b<maxNum; b++){
				
					System.out.print(a + "X" + b + "=" + (a*b) + " ");
				}
			System.out.println();
			}
		}
	

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int initNum = Integer.parseInt(scan.nextLine());
		int maxNum = Integer.parseInt(scan.nextLine());
		
		test t = new test();
		t.printMultipleTable(initNum, maxNum);
		
		scan.close();
		
		
	}
	}

