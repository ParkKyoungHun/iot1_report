package report.nayoungwoo.r0005;

public class Exam {

	public static void main(String[] args) {

		for (int i = 1, j = 10; i<=10;i++, j--){
			
			Cal c = new Cal(i, j, "+");
			c.printCal();
		}
		
		Cal c = new Cal(10, 2, "+");
		c = new Cal(10, 2, "-");
		c.printCal();
		c = new Cal(10, 2, "*");
		c.printCal();
		c = new Cal(10, 2, "/");
		c.printCal();
			

	}
	
}
