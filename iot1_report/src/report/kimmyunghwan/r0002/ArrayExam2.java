package report.kimmyunghwan.r0002;

public class ArrayExam2 {

	
	
	
	public static void main(String[] args) {
	
		int[] a = new int[5]; //a가 5개 가지고있는데 마지막 값은 1 2 3 4 5 
		for(int i=0; i<a.length; i++){ // for(int i=0; i<5; i++)
			a[i] = (i+1); //a[i]  -> a방의  i번째 값은?
		}
		
		
		System.out.println("a의 첫번째값:"+a[0]);
		System.out.println("a의 마지막 값:"+a[a.length-1]); // "a의 마지막값:"+a[4] == "a의 마지막값:"+a[a.length-1]
		
		
	}

}
