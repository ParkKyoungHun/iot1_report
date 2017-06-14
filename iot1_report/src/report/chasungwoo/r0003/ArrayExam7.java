package report.chasungwoo.r0003;

public class ArrayExam7 {

	public int[] randomInsert(int size){

		int[] a = new int[size];

		for(int i=0; i<size; i++){
			a[i] = (int)(Math.random()*45)+1;
			for(int j = 0; j<i; j++){
				if(a[i] == a[j]){
					i--;
				}
			}
		}
		return a;
	}

	public void print(int[] b){
		for(int k=0; k<b.length; k++){
			System.out.println(b[k] + " ");
		}
	}

	public static void main(String[] args){

		ArrayExam7 ae7 = new ArrayExam7();
		int[] a = ae7.randomInsert(6);
		ae7.print(a);
	}

}
