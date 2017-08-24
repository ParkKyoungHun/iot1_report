package factory.exam;

import factory.exam.implement.ExamServiceImpl;

public class ExamFactory {
	private static ExamService es = new ExamServiceImpl();
	
	public static ExamService getExamService(){
		return es;
	}
}
