package report.kimhonggeun.r0006;

public class Father {

	private String address = "서울시 강서구 가양동";
    int age = 65;
	String name = "박철수";
	
	int getAge(){
		return this.age;
	}
	String getAddress(){
		return address;
	}
	String getName(){
		return name;
	}
	
	void setName(String name){
		this.name = name;
	}
}
