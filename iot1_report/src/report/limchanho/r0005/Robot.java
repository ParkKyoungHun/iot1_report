package report.limchanho.r0005;

public class Robot {
	String name;
	int age;
	int weight;
	int height;

	public Robot(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void doKick() {
		System.out.println(age + " 살먹은 로봇 " + name + " 이 발차기를 하다.");
	}

	void doRun() {
		System.out.println(age + " 살먹은 로봇 " + name + " 이 달리기를 하다.");

	}

	void doChange() {
		System.out.println(age + " 살먹은 로봇 " + name + " 이 변신을 하다.");

	}

	public static void main(String[] args) {

		Robot rb = new Robot("지로봇", 45);

		rb.doKick();
		rb.doRun();
		rb.doChange();

	}
}
