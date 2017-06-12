package report.jjh.r0001;


public class Test2 {
	int a = 0;
	int b = 0;
	int c = 0;
	// 占쏙옙 占쌥븝옙占쏙옙占쏙옙 占쏙옙占쏙옙占싹댐옙 占쌉쇽옙 占쏙옙占쏙옙트占쏙옙占쏙옙, 占쏙옙占쏙옙트占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙 c占쏙옙 占쏙옙占쏙옙占쏙옙占� 占쏙옙占싶곤옙占쏙옙 占쏙옙占� 占쌘듸옙

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
			//占쏙옙占쏙옙 占쌕듸옙 i==b占쏙옙 占십울옙占쌀깍옙占�?
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
