package report.kimsangcheol.r0002;


public class Test {

	public void printMultipleTable(int initNum, int maxNum){
		int a, b;
		for(a=initNum;a<=maxNum;a++){
			for(b=initNum;b<maxNum;b++){

				System.out.print(a + " X " + b + " = " + (a*b) + ",");

			}
			System.out.println(a + " X " + b + " = " + (a*b));
		}

	}
	public static void main(String[] args){
		//		int a = 1;
		//		int b = 1;
		Test c = new Test();
		c.printMultipleTable(2, 4);

		/*		
		for(a=1;a<=9;a++){
			for(b=1;b<9;b++){

					System.out.print(a + " X " + b + " = " + (a*b) + ",");

			}
			System.out.println(a + " X " + b + " = " + (a*b));
		}
		 */		

	}
}
