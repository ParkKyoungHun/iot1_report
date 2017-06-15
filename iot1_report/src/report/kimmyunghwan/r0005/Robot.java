package report.kimmyunghwan.r0005;

public class Robot {

	String name;
	int age;
	int makeYear;
	
	public Robot(){
		//String int 변수 선언하면 아래 name과 age 앞에 this. 이 붙어야 위에 함수를 가르킴
		//String
		//int
		
		name = "로보트";
		age = 3;
	}
	
	void doKick() {
		System.out.println("발차기 하다");
	}

	void doRun() {
		System.out.println("달리기 하다");
	}

	void doChange() {
		System.out.println("변신 하다");
	}

	public static void main(String[] args) {
		Robot r = new Robot();
		r.doKick();
		r.doRun();
		r.doChange();

	}

}
