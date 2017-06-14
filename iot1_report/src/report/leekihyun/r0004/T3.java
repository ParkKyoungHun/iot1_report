package report.leekihyun.r0004;

public class T3 {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("반복문의 시작값을 입력해주세요>");
		
		String initNumStr = scan.nextLine();
		int initNum = Integer.parseInt(initNumStr);
		System.out.println("반복문의 시작값 ="+initNum);
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("반복문의 종료값을 입력해주세요>");
		
		String lastNumStr = scan.nextLine();
		int lastNum = Integer.parseInt(lastNumStr);
		System.out.println("반복문의 종료값 ="+lastNum);
		
	
		
		for(int i=initNum;i<=lastNum;i++){
	
			if(i%10==(initNum-1)){
				System.out.println(i+"");
			}else{
					System.out.print(i+",");
				
				}
			}
		}
		
	} 
}
