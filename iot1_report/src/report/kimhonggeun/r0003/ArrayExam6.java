package report.kimhonggeun.r0003;

public class ArrayExam6 {

	
	int[]a = new int[10];
	
	public void s1(){
		
		for(int i=1;i<=10;i++){
			a[10-i]=i*2;
		}
	}
	public void s2(){
		
		for(int i=1;i<=10;i++){
			
			if(i==10){
				System.out.print(a[i-1]);
			}else{
				System.out.print(a[i-1] + " , ");
			}
		}
	}	
	
	public static void main(String[]args){
		
		ArrayExam6 ar6 = new ArrayExam6();
		ar6.s1();
		ar6.s2();
		
	}
}
