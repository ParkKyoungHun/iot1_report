package report.parkjonghun.r0006;

public class Father {
	
	private String address = "서울시 강서구 가양동"; 
	// private는 상속을 막고 오직 자기 자신 클래스에서는 사용 할 수 있음.
	private int age = 65;
	private String name = "박철수";
	
	int getAge(){
		return age;
	}
	
	String getAddress(){ //address가 private되어 있지만 함수로 인해 풀음.
						 // 그래서 Son클래스에서 사용할 수 있음.
		return address;
	}
	
	String getName(){
		return name;
	}
	void setName(String name){
		this.name = name;
		
	}

}
