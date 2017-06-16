package report.umwoosung.r0005;

import java.util.ArrayList;
import java.util.List;

public class ExamList {
	public static void main(String[]args){
		ArrayList<Cal> list = new ArrayList<Cal>();
		for(int i=0;i<3;i++){
		Cal c = new Cal(i);
		list.add(c);
		}
		
		for(int i=0;i<3;i++){
			Cal c2 = list.get(i);
			System.out.println(c2.a);
		}
		
	}//get 은 꺼낸다는의미
//add는 넣는다는 의미
}
// 8 list변수를 선언 <Cal>에서만 가져올수있다고 말하고,
// 9 for(선언;조건;변수)
// 10 c는 Cal(0),Cal(1),Cal(2)
// 11. list.add(c)=>함수로 풀어쓰면 c[0],c[1],c[2]
//14for(선언;조건;변수)
//15