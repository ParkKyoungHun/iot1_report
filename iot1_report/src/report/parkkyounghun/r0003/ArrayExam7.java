package report.parkkyounghun.r0003;

public class ArrayExam7 {
	// 자리수가 6개인 인트형 배열변수 a를 선언
	// 총6번 반복하는 반복문에서 
	// 아래에서 나오는 랜덤값을 배열변수 a에 0번째 방부터 차례로 입력하시면 됩니다.
	
	public int checkNum(int[] a){
		int random = (int)(Math.random()*45)+1;
		for(int i=0;i<a.length;i++){
			if(a[i]==random){
				random = (int)(Math.random()*45)+1;
				i--;
			}
		}
		return random;
	}
	public static void main(String[] args){
		int[] a = new int[10];
		ArrayExam7 ae5 = new ArrayExam7();
		for(int i=0;i<10;i++){
			a[i] = ae5.checkNum(a);
		}
		for(int i=0;i<10;i++){
			System.out.println((i+1) + "번째 로또번호는 : " + a[i]);
		}
	}
}
