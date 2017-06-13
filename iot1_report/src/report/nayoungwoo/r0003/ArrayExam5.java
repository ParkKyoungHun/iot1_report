package report.nayoungwoo.r0003;

public class ArrayExam5 {

//	public static int[] checkDupArray(int[] a, int checkNum) {
//		
//		for(int i =0; i< a.length; i++) {
//			if(a[i] == checkNum) {
//				a[i] = (int) (Math.random() * 45);
//				checkDupArray(a,(int) (Math.random() * 45));
//			}
//		}
//		return a;
//	}

	public static void main(String args[]) {

		int[] a = new int[6];
		
		for (int i = 0; i <6; i++) {

			int random = (int) (Math.random() * 45) + 1;
			a[i] = random;
	
			System.out.println((i + 1) + "번째 로또번호 = " + a[i]);
			
			for (int j= i+1; j >=0;j--) {
				if(j<7 && a[j] == a[i] && i!=j){
					j=0;
					i--;
				}
			}
		}

	}

}

// d
// aj 와 ai 가 같다며언언언언언언어ㅓ어어어어어                    
//      noi no no no no no no no no no no no no non o
