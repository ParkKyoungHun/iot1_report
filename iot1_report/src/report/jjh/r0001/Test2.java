package report.jjh.r0001;


public class Test2 {
	int a = 0;
	int b = 0;
	int c = 0;
	// �� �ݺ����� �����ϴ� �Լ� ����Ʈ����, ����Ʈ�������������� c�� ������� ���Ͱ��� ��� �ڵ�

	public void printLoop() {
		int count = 0;
		for (int i = a; i <= b; i++) {
			count += 1;
			if (count % c == 0 || i == b) {
				System.out.println(i);
			} else {
				System.out.print(i + ",");
			}
		}
	}

	public void printLoopReverse() {
		int count = 0;
		for (int i = a; i >= b; i--) {
			count += 1;
			//���� �ٵ� i==b�� �ʿ��ұ��?
			if (count % c == 0 || i == b) {
				System.out.println(i);
			} else {
				System.out.print(i + ",");
			}
		}
	}

	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.c = 7;
		t2.a = 1;
		t2.b = 100;
		t2.printLoop();

		t2.a = 100;
		t2.b = 1;
		t2.printLoopReverse();
	}

}
