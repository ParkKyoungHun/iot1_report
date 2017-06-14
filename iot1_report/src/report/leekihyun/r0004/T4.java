package report.leekihyun.r0004;

public class T4 {

	//강사님은 Array Exam7에 만드심
	public int checkNum(int[] a){
		int random = (int)(Math.random()*45)+1;
		for(int i=0;i<a.length;i++){
		if(a[i]==random){
			
			random = (int)
			
			for(int j = i+1;j>=0;j--){
				if(j<20 && a[j]==a[i]&& i!=j){
					j=0;
					i--;
					
				}
			}
		}
		for(int i=0;i<20;i++){
			System.out.println((i+1)+"번째 로또번호는 :" + a[i]);
		}
	}
}

}
