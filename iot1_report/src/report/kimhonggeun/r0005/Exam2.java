package report.kimhonggeun.r0005;

public class Exam2 {

	public static void main(String[]args){
		//0부터 4까지 반복하는 반복문을 작성하여
		//Cal(int a)라고 선언된 생성자를 호출하여 1부터 5까지 출력을 해보시기 바란다
		Cal[] c = new Cal[5];
		
		int i;
		for(i=0;i<=4;i++){
//			Cal d = new Cal(i+1);	
			c[i] = new Cal(i+1);
		}
		for(i=0;i<=4;i++){
		System.out.println(c[i].a);
		}
	}
}
