package report.limchanho.r0010;

import java.util.ArrayList;

public class ListExam<T> extends ArrayList {

	public static void main(String[] args) {
		ListExam<MapExam> list = new ListExam<MapExam>();
		MapExam me = new MapExam();
		list.add(me);
		System.out.println(me);
	}
}
