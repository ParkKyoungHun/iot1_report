package report.kimmyunghwan.r0006;

public class NewExam {

	public static void main(String[] args) {
		String str1 = "a";
		String str2 = "a";
		System.out.println(str1 == str2); //==은 주소값을 비교

		str1 = new String("b");  //new 는 새로운 방을 만든다는 뜻
		str2 = new String("b");	//new 를 해야지만 새로운 주소값이 생성됨
		System.out.println(str1 == str2);
	}

}