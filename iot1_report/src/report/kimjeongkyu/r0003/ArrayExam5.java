package report.kimjeongkyu.r0003;

public class ArrayExam5 {

	public void lotto(){
		int Lotto[] = new int[6];
		System.out.print("Lotto numbers are ");    

		for(int i=0;i<Lotto.length;i++){
			Lotto[i] = (int)(Math.random()*45)+1;
				for(int j=i-1;j>=0;j--){
					if(Lotto[i]==Lotto[j]){
						i--;
	//					break;
	          }
		}
	}

				for(int i=0; i<Lotto.length; i++){
					System.out.println(Lotto[i] + " ");
				}
				System.out.print(".");
	
	}
	
	
	
	public static void main(String[] args) {
		ArrayExam5 ae5 = new ArrayExam5();
		ae5.lotto();
		
	}
}
