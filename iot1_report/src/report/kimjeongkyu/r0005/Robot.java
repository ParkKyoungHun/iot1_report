package report.kimjeongkyu.r0005;

public class Robot {
	String name;
	int age;
	
	public Robot(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void doKick() {
		System.out.println(age + "살의 로봇, " + name + "가 발차기를 하다.");
	}

	void doRun() {
		System.out.println(age + "살의 로봇, " + name + "가 달리기를 하다.");
	}

	void doChange() {
		System.out.println(age + "살의 로봇, " + name + "가 변신을 하다.");
	}

	public static void main(String[] args){
	Robot rb = new Robot("바보",4);
	rb.doKick();
	rb.doRun(); 
	rb.doChange();
		
	}
}
