package factory.exam;

import java.util.HashMap;
import java.util.List;

public interface ExamService {
	List<HashMap> getExamList();
	
	HashMap getExam();
}
