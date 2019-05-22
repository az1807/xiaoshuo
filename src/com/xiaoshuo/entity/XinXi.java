package com.xiaoshuo.entity;

public class XinXi {
	private int id ;
	private String name;
	private String phone;
	private String email;
	private String jieshao;
	private String wenhua;
	private String dizhi;
	private String rexian;
	private String wangzhi;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getJieshao() {
		return jieshao;
	}
	public void setJieshao(String jieshao) {
		this.jieshao = jieshao;
	}
	public String getWenhua() {
		return wenhua;
	}
	public void setWenhua(String wenhua) {
		this.wenhua = wenhua;
	}
	public String getDizhi() {
		return dizhi;
	}
	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}
	public String getRexian() {
		return rexian;
	}
	public void setRexian(String rexian) {
		this.rexian = rexian;
	}
	public String getWangzhi() {
		return wangzhi;
	}
	public void setWangzhi(String wangzhi) {
		this.wangzhi = wangzhi;
	}
	
	public XinXi(int id, String name, String phone, String email,
			String jieshao, String wenhua, String dizhi, String rexian,
			String wangzhi) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.jieshao = jieshao;
		this.wenhua = wenhua;
		this.dizhi = dizhi;
		this.rexian = rexian;
		this.wangzhi = wangzhi;
	}
	
	public XinXi() {
	}
	
	@Override
	public String toString() {
		return "XinXi [id=" + id + ", name=" + name + ", phone=" + phone
				+ ", email=" + email + ", jieshao=" + jieshao + ", wenhua="
				+ wenhua + ", dizhi=" + dizhi + ", rexian=" + rexian
				+ ", wangzhi=" + wangzhi + "]";
	}
	
	
}
