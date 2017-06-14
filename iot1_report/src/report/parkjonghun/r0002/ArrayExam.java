package report.parkjonghun.r0002;

public class ArrayExam {
	// 1번 배열의 방을 만들기. 
	// 2번 배열의 길이를 출력하기.
	// 3번 배열을 사용해서 구구단 함수 만들어서 출력하기.
	
	public void multiple(){
		int[] a = new int[9];
		for(int i = 1; i<=9; i++){
			for(int j = 1; j<=9; j++){
				System.out.println(i + " X " + j + " = " + (i*j));
			}
		}
		
	}
	
	public static void main(String[] args){
		ArrayExam ae = new ArrayExam();
		
		
	ae.multiple();
		
	}

}
