package report.jangjaehyun.r0011;

import report.jangjaehyun.r0010.MapExam2;

public class ExceptionExam1 {
	int num1;
	int num2;
	
	int plus(){
	return num1+num2;
	}
	
	int minus(){
	return num1-num2;
	}
	
	int multiple(){
		return num1*num2;
	}
	
	int division(){
		return num1/num2;
		
	}
	public static void main(String[] args){
		try{
			Scanner scan = new Scanner(System.in);
				ExceptionExam1 ee1 = new ExceptionExam1();
				ee.num1 = Integer.parseInt(scan.nextLine());
				ee.num2 = Integer.parseInt(scan.nextLine());
				
				int result = ee1.plus();
				System.out.println(result);
				
				result = ee1.minus();
				System.out.println(result);
				
				result = ee1.multiple();
				System.out.println(result);
				
				result = ee1.division();
				System.out.println(result);
				
		}catch(Exception e){
			System.out.println(" 숫자를 입력하세요. ");
		}finally{
			System.out.println(" 실행됩니다. ");
			
		}
	}
}
