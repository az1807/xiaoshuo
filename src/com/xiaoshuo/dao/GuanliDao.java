package com.xiaoshuo.dao;

import java.util.ArrayList;

import javax.xml.registry.infomodel.User;



public interface GuanliDao {
	boolean insertUser(String name,String password);
	ArrayList<User> selectUsers();
	User selectUserByName(String name);
}
