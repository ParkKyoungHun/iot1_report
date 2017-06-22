package report.limchanho.r0006;

public class NewExam {

	public static void main(String[] args) { // == 값을 비교하지 않는다.
		String str1 = "a";
		String str2 = "a";
		System.out.println(str1 == str2);
		str1 = new String("b");
		str2 = new String("b");
		str1 = str2;
		String str3 = new String("b");
		System.out.println(str1.equals(str3)); // equals는 함수//스트링에 있는것처럼 슬 수 있는
												// 함수.

		System.out.println("adsf" == "adsf"); // 스트링이나까 ==안쓰고 equals 써야지 ==는 주소값
												// equals 는 값을 비교
	}

}
