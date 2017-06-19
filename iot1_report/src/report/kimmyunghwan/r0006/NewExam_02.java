package report.kimmyunghwan.r0006;

public class NewExam_02 {

	public static void main(String[] args) {
		String str1 = "a";
		String str2 = "a";
		System.out.println(str1 == str2);

		str1 = new String("b");
		str2 = str1;
		String str3 = new String("b");

		System.out.println(str1.equals(str3));
	}

}
