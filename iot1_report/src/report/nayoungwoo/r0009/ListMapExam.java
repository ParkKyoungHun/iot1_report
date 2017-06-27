package report.nayoungwoo.r0009;
// 스트링, 인티저로 구성된 hashmap 변수를 선언 --

// hashmap 변수ㅁㅇ은 pointHm이라고 해주세요 --
// pointHm에 학생의 이름키값과 점수 벨류값을 10개 넣어주세요
// 학생이름은 a군, b군,c군 으로 입력해주세요
// 해당 pointHm을 ArrayList에 추가해주세요.
// 반복문을 사용하여 ArrayList에 추가된 pointHm을 출력해주세요

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ListMapExam {

	public static void main(String[] args) {
		ArrayList<HashMap<String, Object>> arrList = new ArrayList<HashMap<String, Object>>();
		HashMap<String, Object> pointHm = new HashMap<String, Object>();
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		String name = scan.nextLine();
		System.out.println("나이를 입력해주세요");
		String age = scan.nextLine();
		System.out.println("성별을 입력해주세요");
		String gender = scan.nextLine();

		pointHm.put("name", name);
		pointHm.put("age", Integer.parseInt(age));
		pointHm.put("gender", gender);
		arrList.add(pointHm);

		for (HashMap<String, Object> hm : arrList) {
			System.out.println(hm);
		}
	}
}
