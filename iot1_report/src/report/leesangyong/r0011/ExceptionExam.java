package report.leesangyong.r0011;

import report.leesangyong.r0010.MapExam2;

public class ExceptionExam {
	MapExam2 me2; 
	int a = 1;
	ExceptionExam(){
		System.out.println("기본 생성자 호출햇네?");
	}
	public static void main(String[]args){
				ExceptionExam ee = new ExceptionExam();
				ee.me2 = new MapExam2();
				ee.me2.put("test",123);
//				)catch(NullPointerException e){
//					System.out.println("넘마 me2널인거 같은데");
				}
				
	}

