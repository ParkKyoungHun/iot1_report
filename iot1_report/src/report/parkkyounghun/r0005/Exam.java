package report.parkkyounghun.r0005;

public class Exam {
	public static void main(String[] args){
//		Cal c = new Cal(10, 1, "+");
//		c.printCal();
//		c = new Cal(9, 2, "+");
//		c.printCal();
//		c = new Cal(8, 3, "+");
//		c.printCal();
//		c = new Cal(7, 4, "+");
//		c.printCal();
		Cal c ;
		for(int i=1;i<=10;i++){
			c = new Cal(i, (11-i), "+");
			c.printCal();
//			System.out.println(i +"," + (11-i));
		}
	}
}
