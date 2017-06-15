package report.kimsangcheol.r0005;

public class Exam {
	
	public static void main(String[] args){
		Robot rb = new Robot("R3",18);
		
		rb.doKick();
		rb.doRun();
		rb.doTransform();
		
		Cal c = new Cal(10,2,"+");
		c.printCal();
		c= new Cal(10,2,"-");
		c.printCal();
		c= new Cal(10,2,"*");
		c.printCal();
		c= new Cal(10,2,"/");
		c.printCal();
		
	}
}
