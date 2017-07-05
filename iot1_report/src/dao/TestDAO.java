package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import common.DBConn2;

public class TestDAO {
	
	public boolean insertTest(){
		Connection con = null ;
		try{
			String writer = "4";
			con = DBConn2.getCon();
			String sql = "select * from user_info where num=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, writer);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				sql = "INSERT INTO board(TITLE, CONTENT, WRITER, REG_DATE)";
				sql += " values(?,?,?,?)";
				ps = con.prepareStatement(sql);
				ps.setString(1, "게시물4");
				ps.setString(2, "내용4");
				ps.setString(3, writer);
				Date d = new Date();
				SimpleDateFormat sdt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				ps.setString(4,sdt.format(d));
				int result = ps.executeUpdate();
				sql = "update 1board set title='냉무' where num=8";
				ps = con.prepareStatement(sql);
				result = ps.executeUpdate();
				if(result==1){
					con.commit();
					return true;
				}
			}else{
				System.out.println(writer + "번호를 가진 사람이 유저인포테이블에 없어요 자시가!!");
			}
		}catch(Exception e){
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally{
//			try {
//				DBConn2.closeCon();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
		}
		return false;
	}
	
	public List<Map> selectTest(){
		List<Map> testList = new ArrayList<Map>();
		try{
			Connection con = DBConn2.getCon();
			
			String sql = "SELECT T.*, UI.ID, UI.NAME FROM board AS T, USER_INFO AS UI";
			sql += " WHERE T.WRITER = UI.NUM;";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Map hm = new HashMap();
				hm.put("num",rs.getString("num"));
				hm.put("title",rs.getString("title"));
				hm.put("content",rs.getString("content"));
				hm.put("writer",rs.getString("writer"));
				hm.put("reg_date",rs.getString("reg_date"));
				hm.put("id",rs.getString("id"));
				hm.put("name",rs.getString("name"));
				testList.add(hm);
			}
			DBConn2.closeCon();
			return testList;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean updateTest(){
		return true;
	}
	
	public boolean deleteTest(){
		return true;
	}
	
	public static void main(String[] args){
		TestDAO tdao = new TestDAO();
		tdao.insertTest();
//		tdao.insertTest();
//		tdao.insertTest();
		
		List<Map> list = tdao.selectTest();
		for(Map m : list){  
			System.out.println(m);
		}
	}
}
