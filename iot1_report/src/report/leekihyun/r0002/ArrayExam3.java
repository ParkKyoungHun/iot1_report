package report.leekihyun.r0002;

public class ArrayExam3 {

	public int[] getArrayVar(int initNum, int maxNum) {
		// initNum���� �����ؼ� maxNum����Ǵ� �ݺ����� ����Ͽ�
		// �迭���� a���� ����ְ� �迭����a�� ������ֽø� �˴ϴ�.
		// ����� main�Լ����� ������ּ���.

		int[] a = new int[maxNum - initNum];
		for (int i = initNum - initNum; i < maxNum - initNum; i++) {
			a[i] = i + 1;

		}

		return a;

	}

	public void printArrayVar(int[] a) {
		for (int i =  a.length-1; i>=0;  i--) {
			System.out.println("a��" + i + "��° ���� �� =" + a[i]);
		}
	}

	public static void main(String[] args) {
		ArrayExam3 a3 = new ArrayExam3();
		int[] a = a3.getArrayVar(0, 6);
		// a3.printArrayVar(a);

		a3.printArrayVar(a);

	}
}
