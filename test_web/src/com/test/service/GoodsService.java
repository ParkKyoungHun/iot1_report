package com.test.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.test.common.DBConn;
import com.test.dto.Goods;
import com.test.dto.UserInfo;

public class GoodsService {

	public List<Goods> selectGoods(Goods pGoods){
		Connection con = null;
		PreparedStatement ps = null;
		try {
			String sql = "select gi.ginum, gi.giname, gi.gidesc, vi.vinum, vi.viname "
					+ " from goods_info as gi, vendor_info as vi "
					+ " where gi.vinum=vi.vinum"
					+ " order by gi.ginum";
			con = DBConn.getCon();
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<Goods> goodsList = new ArrayList<Goods>();
			while(rs.next()){
				Goods goods = new Goods();
				goodsList.add(goods);
			}
			return goodsList;
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				ps.close();
				DBConn.closeCon();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}
