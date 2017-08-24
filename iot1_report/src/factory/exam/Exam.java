package factory.exam;

import java.util.HashMap;
import java.util.List;

public class Exam {

	public static void main(String[] args){
		ExamService es = ExamFactory.getExamService();
		List<HashMap> examList = es.getExamList();
	}
}
