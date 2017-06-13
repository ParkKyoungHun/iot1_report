package report.kimmyunghwan.r0003;

public class ArrayExam4_02 {

	// 메인메소드
	// 포문 1부터 10까지
	// 2의 배수가 10개가 찍히게 만들어 주세요.

	// 2,4,6,8,10,,,,,20

	// int 배열변수를 선언해주시고 자리수는 10개짜리로 만들어주세요
	// 포문에서 각각의 index에 2의 배수의 값을 넣어주세요.

	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i = 1; i <= 10; i++) {
			a[i - 1] = i * 2; // a가 가지고 있는 첫번째 방의 값은 인덱스-1 값 0 이고 2의 배수 값을 넣어준다
			//a[11-1] = 10*2 //11-1은 10이고 10이 오른쪽으로 넘겨주면 10*2는 20
			// System.out.print(a[i-1]+",");
			
		}
		for (int i = 1; i <=10; i++) { //i를 0으로 하면 방이10개일때 마지막 키값은 9가 되야하는데 11이므로 i에 1로
			System.out.println(a[i-1]); 
		}
	}

}
