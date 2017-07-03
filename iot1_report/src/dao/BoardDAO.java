package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import common.DBConn2;

public class BoardDAO {
	// board테이블에 update, insert, delete, select 하는 함수를 각각 4개 생성해주세요
	// 모두 단일 작업임으로 한개의 함수마다 commit이 이러우져야 하며
	// 만약 에러날경우 rollback이 되면 됩니다.
	Connection con;
	public void setConnection() throws ClassNotFoundException, SQLException{
		con = DBConn2.getCon();
	}
	
	public boolean insertBoard() {
		String sql = "insert into board(title, content, writer, reg_Date)values('게시판제목3','게시판내용3',5,now())";
		try{
			Statement st = con.createStatement();
			int result = st.executeUpdate(sql);
			if(result==1){
				con.commit();
				st.close();
				st = null;
				return true;
			}
		}catch(Exception e){
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		return false;
	}
	
	public boolean updateBoard(){
		String sql = "update board1 set title='으하하하하' where num='1'";
		try{
			Statement st = con.createStatement();
			int result = st.executeUpdate(sql);
			if(result==1){
				con.commit();
				st.close();
				st = null;
				return true;
			}
		}catch(Exception e){
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		return false;
	}
	
	public static void main(String[] args){
		BoardDAO bdao = new BoardDAO();
		try {
			bdao.setConnection();
			bdao.insertBoard();
			bdao.updateBoard();
			System.out.println("정상동작 했고 저장까지 완료 했수다!!");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
