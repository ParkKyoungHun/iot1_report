package report.kimjeongkyu.r0008;

public class Student extends Teacher {
	// 10명의 함수
	// int 타입
	Student() {
		System.out.println("10명의 학생들의 점수가 모두 입력되었습니다.");
		System.out.println();
	}

	Student(int a) {
		System.out.println("good bye");
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.printResult();
		s.sum();
	}
}
