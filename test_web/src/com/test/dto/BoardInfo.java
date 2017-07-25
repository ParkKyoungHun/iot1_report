package com.test.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BoardInfo {
	Date date;
	SimpleDateFormat sdf;
	private int boardNum;
	private String boardTitle;
	public int getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	
	
}
