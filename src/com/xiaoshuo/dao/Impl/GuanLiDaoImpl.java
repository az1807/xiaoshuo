package com.xiaoshuo.dao.Impl;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.xml.registry.infomodel.User;


import com.mysql.jdbc.ResultSet;


import com.xiaoshuo.dao.GuanliDao;
import com.xiaoshuo.entity.GuanLi;
import com.xiaoshuo.util.DBManager;

public class GuanLiDaoImpl implements GuanliDao{

	
	public boolean insertGuanLi(String name, String password) {
		int n = DBManager.updateSQL("insert user (username,password)  values ('"
				+ name + "','" + password + "')");
		if (n == 1) {
			return true;
		}
		return false;
	}
	
	public ArrayList<GuanLi> selectGuanLi() {
		ArrayList<GuanLi> gl = new ArrayList<GuanLi>();

		ResultSet rs = DBManager.querySQL("select * from guanliyuan");
		if (rs != null) {
			try {
				while (rs.next()) {
					GuanLi u = new GuanLi();
					u.setId(rs.getInt("id"));
					u.setName(rs.getString("name"));
					u.setPassword(rs.getString("password"));
					gl.add(u);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return gl;
	}
		

	public GuanLi selectGuanLiByName(String name) {
		ResultSet rs = DBManager.querySQL("select * from guanliyuan where name = '" + name + "'");
		if (rs != null) {
			try {
				while (rs.next()) {
					GuanLi u = new GuanLi();
					u.setId(rs.getInt("id"));
					u.setName(rs.getString("name"));
					u.setPassword(rs.getString("password"));
					u.setEmail(rs.getString("email"));
					return  u;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return null;
	}


	}
