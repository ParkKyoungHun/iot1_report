package report.kimjeongkyu.r0012;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataTypeExam6 extends DataTypeExam5 {
	public static void main(String[] args) {
		ArrayList<HashMap> list = new ArrayList<HashMap>();
		DataTypeExam5 da5 = new DataTypeExam5();
		for (int i = 0; i < 2; i++) {
			list.add(da5.getHashMap());
		}
		for (HashMap hm1 : list) {
			System.out.print(hm1.get("Class") + ", ");
			System.out.print(hm1.get("Name") + ", ");
			System.out.print(hm1.get("Age") + ", ");
			System.out.println(hm1.get("Gender") + ",");
		}
	}
}