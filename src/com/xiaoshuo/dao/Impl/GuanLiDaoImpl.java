package com.xiaoshuo.dao.Impl;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.xml.registry.infomodel.User;


import com.mysql.jdbc.ResultSet;


import com.xiaoshuo.dao.GuanliDao;
import com.xiaoshuo.entity.GuanLi;
import com.xiaoshuo.util.DBManager;

public class GuanLiDaoImpl implements GuanliDao{


	public boolean insertUser(String name, String password) {
		int n = DBManager.updateSQL("insert guanliyuan (name,password)  values ('"
				+ name + "','" + password + "')");
		if (n == 1) {
			return true;
		}
		return false;
	}

	public ArrayList<User> selectUsers() {
		ArrayList<User> users = new ArrayList<User>();

		ResultSet rs = DBManager.querySQL("select * from guanliyuan");
		if (rs != null) {
			try {
				while (rs.next()) {
					GuanLi u = new GuanLi();
					u.setId(rs.getInt("id"));
					u.setName(rs.getString("name"));
					u.setPassword(rs.getString("password"));
					users.add((User) u);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return users;
	}
		

	public User selectUserByName(String name) {
		ResultSet rs = DBManager.querySQL("select * from guanliyuan where name = '" + name + "'");
		if (rs != null) {
			try {
				while (rs.next()) {
					GuanLi u = new GuanLi();
					u.setId(rs.getInt("id"));
					u.setName(rs.getString("name"));
					u.setPassword(rs.getString("password"));
					u.setEmail(rs.getString("email"));
					return  (User) u;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return null;
	}
	}
