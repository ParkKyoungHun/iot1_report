package report.kimsangcheol.r0005;

import java.util.ArrayList;

import report.kimsangcheol.r0002.ArrayExam3;

public class ArrayListExam {
	
	public static void main(String[] args){
		ArrayList<ArrayExam3> aLE3 = new ArrayList<ArrayExam3>();
		ArrayExam3 aE3= new ArrayExam3();
		
		aE3.getArrayVar(0, 6);
		aLE3.add(aE3);
		
		for(int i=0; i>aLE3.size();i++){
			aLE3.get(i);
			
		}
	}

}								//멘탈 조정 필요;;;;
