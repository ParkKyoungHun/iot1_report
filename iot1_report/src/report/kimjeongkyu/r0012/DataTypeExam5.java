package report.kimjeongkyu.r0012;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class DataTypeExam5 {
	Scanner scan = new Scanner(System.in);
	public HashMap getHashMap(){
		HashMap hm  = new HashMap();
			System.out.println("Input a level of class");
			hm.put("Class", scan.nextLine());
			System.out.println("Input a name.");
			hm.put("Name", scan.nextLine());
			System.out.println("Input Ages.");
			hm.put("Age", scan.nextLine());
			System.out.println("Input gender.");
			hm.put("Gender", scan.nextLine());

		return hm;
		}

	public static void main(String[] args) {
		ArrayList<HashMap> List = new ArrayList<HashMap>();
		DataTypeExam5 data5 = new DataTypeExam5();
		for (int i = 0; i < 2; i++) {
			HashMap hm = data5.getHashMap();
			List.add(hm);
		}
		

		for (HashMap hm1 : List) {
			System.out.print(hm1.get("Class") + ", ");
			System.out.print(hm1.get("Name") + ", ");
			System.out.print(hm1.get("Age") + ", ");
			System.out.println(hm1.get("Gender") + ",");
		}
	}
}
