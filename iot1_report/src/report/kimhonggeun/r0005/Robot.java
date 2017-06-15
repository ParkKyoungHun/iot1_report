package report.kimhonggeun.r0005;

public class Robot {
	
	String name;
	int age;
		
	public Robot(String name, int age){
		this.name = name;
		this.age = age;
	}
	void doKick(){
		System.out.println(age + "살 먹은 "+ name + "의 발차기!!!!");
	}
	
	void doRun(){
		System.out.println(age + "살 먹은 " + name + "아 달려!!!");
	}
	
	void doChange(){
		System.out.println(age + "살 먹은 " + name + "... 비여어어어어언시ㅣㅣㅣㅣㅣㅣㅣㅣㅣㄴ!");
	}
	
	public static void main(String[]args){
		Robot r1 = new Robot("훈봇",390);
		r1.doKick();
		r1.doRun();
		r1.doChange();
	}
}
