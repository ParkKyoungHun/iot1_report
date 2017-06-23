package report.kimhonggeun.r0004;


import java.util.Scanner;


public class ked {

	public void Scan(){

		int[] arr = new int[6];
		int result =0;

		Scanner s1 = new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			System.out.print((i+1)+"번 학생 점수 = ");
			String n1 = s1.nextLine();

			arr[i] = Integer.parseInt(n1);

			result = result + arr[i];
//			result += arr[i];

		}
		System.out.println("학생 점수들 합 = " + result);
		System.out.println("학생 점수들 평균 = " + (result/arr.length));
		
		for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j]=t;
                }
            }
        }System.out.print("작은 수부터 출력 : ");
        for (int k = 0; k<arr.length ; k++) {
            System.out.print(arr[k] + " ");
        }	
	}

	public static void main(String[] args) {

		ked k1 = new ked();
		k1.Scan();
	}
}
