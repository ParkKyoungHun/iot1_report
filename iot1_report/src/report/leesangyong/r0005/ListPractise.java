package report.leesangyong.r0005;

import java.util.ArrayList;

public class ListPractise {
	public static void main(String[] args) {
		Cal2 ca = new Cal2();
		ArrayList list = new ArrayList();
		list.add(ca.num1);
		int num = list.get(1);
		System.out.println(num);
	}
}
