package report.kimmyunghwan.r0005;

public class Robot_01 {

	String name;
	int age;

	public Robot_01(String name, int age) {
		// String int 변수 선언안 하면 아래 name과 age 앞에 this. 이 붙어야 위에 함수를 가르킴

		this.name = name;
		this.age = age;
	}

	void doKick() {
		System.out.println(age + "살 먹은 로봇 " + name + "이 발차기 하다");
	}

	void doRun() {
		System.out.println(age + "살 먹은 로봇 " + name + "이 달리기 하다");
	}

	void doChange() {
		System.out.println(age + "살 먹은 로봇 " + name + "이 변신 하다");
	}

	public static void main(String[] args) {

		Robot_01 r = new Robot_01("아이언맨",4);
		r.doKick();
		r.doRun();
		r.doChange();

	}

}
