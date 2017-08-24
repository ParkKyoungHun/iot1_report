package factory.exam.implement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import factory.exam.ExamService;

public class ExamServiceImpl implements ExamService{

	@Override
	public List<HashMap> getExamList() {
		List<HashMap> resultRest = new ArrayList<HashMap>();
		resultRest.add((HashMap) new HashMap().put("1","홍길동"));
		resultRest.add((HashMap) new HashMap().put("2","홍길동"));
		return resultRest;
	}

	@Override
	public HashMap getExam() {
		return (HashMap) new HashMap().put("1","홍길동");
	}

}
