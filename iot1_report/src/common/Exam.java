package common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Exam {
	public List<String> getUserIDLists(String name){
		//String result = "";
		List<String> userlist = new ArrayList<String>();
		try {
			Connection con = DBConn2.getCon();			
			String sql = "select ID,PWD,NAME from user";
			if(!name.equals("")){
				sql += " WHERE NAME='" + name + "'";
			}
			PreparedStatement prestmt = con.prepareStatement(sql);
			ResultSet rs = prestmt.executeQuery();
			while (rs.next()) {		
				userlist.add(rs.getString(1) + "," + rs.getString(2) + "," + rs.getString(3));
			}			
			DBConn2.closeCon();
			return userlist;
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean insertUser(){
		try {
			Connection con = DBConn2.getCon();			
			String sql = "insert into user(id, pwd, name, age)values('blue','blue','청길동',40)";
			PreparedStatement prestmt = con.prepareStatement(sql);
			int result = prestmt.executeUpdate();
			DBConn2.closeCon();
			if(result==1){
				return true;
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static void main(String[] args){
		Exam e = new Exam();
		e.insertUser();
		List<String> userList = e.getUserIDLists("");
		for(int i=0;i<userList.size();i++){
			System.out.println(userList.get(i));
		}
	}
}
