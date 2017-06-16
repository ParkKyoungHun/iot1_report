package report.chasungwoo.r0005;

public class Robot {
	String name;
	int age;
	int makeYear;

	public Robot(String name, int age){
		this.name = name;
		this.age = age;
	}

	void doKick(){
		System.out.println(age + " years old "+ name +  " kicking you ***chi!");
	}

	void doRun(){
		System.out.println("shouldn't we walk? Im just "+ age +"years old " + name +"... or just lye down");
	}

	void doChange(){
		System.out.println("do not inturrupt Im "+ age + "years old " + name + " and ******* busy!");
	}

	public static void main(String[] args){
		Robot rob = new Robot("supbotman", 4);
		rob.doKick();
		rob.doRun();
		rob.doChange();
	}
}
