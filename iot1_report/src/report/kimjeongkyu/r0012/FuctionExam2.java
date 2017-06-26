package report.kimjeongkyu.r0012;

public class FuctionExam2 {
	
	public static void main(String[] args){
		FunctionExam fe = new FunctionExam();
		for (int i = 0; i < fe.arrNum.length; i++){
			fe.arrNum[i] = fe.getNumberFromString();
		}
	}
}
