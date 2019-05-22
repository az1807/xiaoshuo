package com.xiaoshuo.dao;

import java.util.ArrayList;



import com.xiaoshuo.entity.GuanLi;



public interface GuanliDao {
	boolean insertGuanLi(String name,String password);
	ArrayList<GuanLi> selectGuanLi();
	GuanLi selectGuanLiByName(String name);
}
