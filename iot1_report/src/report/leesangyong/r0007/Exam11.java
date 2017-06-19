package report.leesangyong.r0007;

public class Exam11 {
 int a;
 int b;
 //a와 b값을 초기화 하는 Exam11생성자를 만들어주세요
 //a와 b값을 더하기, 빼기, 나누기, 곱하기 하는 함수를 각각 4개 작성해주시고
 //해당연산결과는 printResult()라는 함수를 호출햇을때 나오게 프로그램을 작성해주시면 됩니다.
 //호출은 Exam12라는 클래스를 만들어서 그안에서 해주시기 바랍니다.
 
 int result=0;
 Exam11(int a, int b){
 this.a=a;
 this.b=b;
 
 }
public void operPlus(){
	int sum = a+b;
	System.out.println("더하기 결과="+sum);
}
public void operMinus(){
	int min = a-b;
	System.out.println("빼기 결과="+min);
}
public void operMultiple(){
	int mul = a*b;
	System.out.println("곱하기 결과="+mul);
}
public void operDivision(){
	int div = a/b;
	System.out.println("나누기기 결과="+div);
}

 public void printResult(){
	 operPlus();
	 operMinus();
	 operMultiple();
	 operDivision();
	
 }
}
