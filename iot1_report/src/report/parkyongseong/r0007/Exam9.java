package report.parkyongseong.r0007;

import java.util.Scanner;

public class Exam9 
{
	/*		Exam9에 private int a,b,result 를 선언해주세요
	 * 		Exam9생성자에서 a값과 b값을 Scanner 클래스의 nextLine()함수를 사용하여 대입해주세요
	 * 		i가 a부터 b까지 도는 반복문을 작성한뒤
	 * 		result의 i를 반복문 만큼 더하는 함수를 작성해주세요
	 * 		result의 값을 출력하는 함수를 작성해서 Exam10에서 출력해 주시기 바랍니다.
	 */
	
	private int a = 0;
	private int b = 0;
	private int result = 0;
	Scanner scanner = new Scanner(System.in);
	
	Exam9()
	{
		System.out.print("초기값을 입력해주세요 : ");
		String input1 = this.scanner.nextLine();
		this.a = Integer.parseInt(input1);
		System.out.print("맥스값을 입력해주세요 : ");
		String input2 =  this.scanner.nextLine();
		this.b = Integer.parseInt(input2);
	}
	
	void doLoop()
	{
		for(int i = a; i <= b; i++)
		{
			result += i;
		}
	}
	
	int getResult()
	{
		return result;
	}
}
