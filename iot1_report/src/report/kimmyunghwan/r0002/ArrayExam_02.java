package report.kimmyunghwan.r0002;

public class ArrayExam_02 {

	public static void main(String[] args) {

		int[] a = new int[4]; // int 배열 변수
		int[] b = { 1, 2, 3, 4, 5, 7, 10 }; // 방번호 0부터 시작, 0부터~3

		for (int i = 0; i <b.length; i++){// 0부터~3까지 도는 반복문
		//for (int i = 0; i <=b.length; i++){// 에러 남.  i <=b.length에서 = 제거
		//System.out.println(b[i]);  인덱스 0부터 b(7개)까지 출력
			
			
			System.out.println("b의" + (i+1) + "번째 방의 값=" + b[i]);

			//System.out.println("a의길이=" + a.length); // a.lengtgh 함수 아니고 속성값
			//System.out.println("b의길이=" + b.length);
			// System.out.println("b의 첫번째 방의 값="+ b[0]); //첫번째는 0 두번째는1
			}
		}

	}
//키값을 인덱스라 함  b[i]

//