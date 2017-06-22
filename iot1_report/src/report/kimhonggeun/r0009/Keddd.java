package report.kimhonggeun.r0009;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Keddd {

	public static void main(String[]args){
		String[] str1;
		String[] str2;
		String s1,s2,s3;
		int a1,a2;
		Scanner scan = new Scanner(System.in);
		
		ArrayList<HashMap<String, Integer>> arr1 = new ArrayList<HashMap<String, Integer>>();
		ArrayList<HashMap<String, ArrayList<HashMap<String, Integer>>>> arr2 = new ArrayList<HashMap<String, ArrayList<HashMap<String, Integer>>>>();
		HashMap<String, Integer> hm1 = new HashMap<String,Integer>();
		HashMap<String, HashMap<String, Integer>> hm2 = new HashMap<String, HashMap<String, Integer>>();
		
		System.out.print("성별 입력해 :");
		s1 = scan.nextLine();
		
		System.out.print("나이 입력해 :");
		s2 = scan.nextLine();
		a1 = Integer.parseInt(s2);
		hm1.put(s1, a1);
		arr1.add(hm1);
		hm1 = new HashMap<String,Integer>();
		
		System.out.print("이름 입력해 :");
		s3 = scan.nextLine();
		
		hm2.put(s3,hm1);
		hm2 = new HashMap<String, HashMap<String, Integer>>();
		
	}
}
