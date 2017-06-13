package report.parkjonghun.r0003;

public class ArrayExam5 {
	
	public static void main(String[] args){
		/*
		int[] a = new int[10]; //배열 변수
		
		for(int i = 1; i <= 10; i++){
			a[i-1] = 11-i;
			System.out.println(a[i-1]);
		}*/
		
		//자리 수가 개인 인트형 배열변수 a를 선언 
		// 총 6번 반복하는 반복문에서
		//아래에서 나오는 랜덤값을 배열변수 a에 0번째 방부터 차례로 입력하시면 됩니다.
		
		int[] a = new int[6];
		
		for(int i = 0; i< 6; i++){
			int random = (int)(Math.random()*45)+1;
			a[i] = random;
			
			for(int j = i+1; j >= 0; j--){
				if(a[j] == a[i]){
					random = (int)(Math.random()*45)+1;
					a[j] = random;
				}
			}
			System.out.println((i+1) + "번째 로또 번호는 :"+ a[i]);				}	
		}
			
			
		
	}
				
			
		



