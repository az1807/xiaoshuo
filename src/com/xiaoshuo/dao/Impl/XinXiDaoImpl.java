package com.xiaoshuo.dao.Impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.xiaoshuo.dao.XinXiDao;
import com.xiaoshuo.entity.XinXi;
import com.xiaoshuo.util.DBManager;






public class XinXiDaoImpl implements XinXiDao {
	public XinXi queryXinXi() {
		XinXi xx= new XinXi();
		
		ResultSet rs = DBManager.querySQL("select * from wzxinxi;");
		try {
			while (rs.next()){
				xx.setId(rs.getInt(1));
				xx.setName(rs.getString(2));
				xx.setPhone(rs.getString(3));
				xx.setEmail(rs.getString(4));
				xx.setJieshao(rs.getString(5));
				xx.setWenhua(rs.getString(6));
                xx.setDizhi(rs.getString(7));
                xx.setRexian(rs.getString(8));
				xx.setWangzhi(rs.getString(9));
				//....
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return xx;
	}
}
