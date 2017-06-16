package report.nayoungwoo.r0006;

public class Exam2 {

	int printFour(int num) {
		
		for(int i=0; i<10;i++) {
			
			if(i == num) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Exam2 e = new Exam2();
		e.printFour(4);
		int str = e.printFour(4);
		System.out.println(str);
	}
}
