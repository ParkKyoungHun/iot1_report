package report.nayoungwoo.r0005;

public class Robot {

	String name;
	int age;
	
	public Robot(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
		
	void dokick() {
		System.out.println(age + "살 먹은 " + name + "이 발차기 하다.");
	}
	
	void doRun() {
		System.out.println(age + "살 먹은 " + name + "이 달리기 하다.");
	}
	
	void doChange() {
		System.out.println(age + "살 먹은 " + name + "이 변신 하다.");
		
	}
	

	public static void main(String[] args) {
		Robot r = new Robot("지로봇",10);
		r.dokick();
		r.doRun();
		r.doChange();		
		
	}
	
}
