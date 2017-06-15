package report.kimsangcheol.r0005;

public class Exam {
	
	public static void main(String[] args){
		Robot rb = new Robot("R3",18);
		Cal c = new Cal(10,2);

		rb.doKick();
		rb.doRun();
		rb.doTransform();

		c.printCal("+");
		c.printCal("-");
		c.printCal("*");
		c.printCal("/");
		
	}
}
