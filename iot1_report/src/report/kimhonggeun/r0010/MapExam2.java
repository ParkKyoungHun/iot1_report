package report.kimhonggeun.r0010;

import java.util.ArrayList;
import java.util.HashMap;

public class MapExam2 extends HashMap{
	//HashMap을 상속받아 주세요.
	//키타입은 String, 벨류 타입은 Integer로 선언해주세요
	//키는 아무거나 넣으셔도 되지만 벨류는 반드시 숫자만 입력
	//총10개의 키값을 생성해주세요
	//toString()함수를 오버라이딩 하여서
	//해당 해쉬맵이 가지고 있는 전체숫자를 더한값을 출력해주세요.
	
	public String toString(){
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		String result = "";
		int num=0;
		ArrayList<String> keyList = new ArrayList<String>(keySet());
		for(int i=0;i<keyList.size();i++){
			String key = keyList.get(i);
			Integer value = (Integer)get(key);
			result += "해쉬맵 "+key+", " + value+"!\n";
			num+=value;
		}System.out.println("벨류값을 더한값 ="+num);
		return result;
	}
	
	public static void main(String[]args){
		MapExam2 me = new MapExam2();
		me.put("일호", 1);
		me.put("이호", 2);
		me.put("삼호", 3);
		me.put("사호", 4);
		me.put("오호", 5);
		me.put("육호", 6);
		me.put("칠호", 7);
		me.put("팔호", 8);
		me.put("구호", 9);
		me.put("십호", 10);

		System.out.println(me);

	}
}



//오버로딩서술
//생성자 함수의 차이

//총점 평균 차순

//mysql이란 개인으로 쓰면 무료
//관계형 데이터베이스 시스템
//mysql설치방법 서술
//구글에서 마리아디비 검색- 마리아디비 접속 - 다운로드 - 윈도우64비트용 설치 - next - 비번 -utf 체크-피니쉬

//fsutil file createnew test.txt 1 
//mkdir test
//cd \w