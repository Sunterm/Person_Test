package com.hiernate.persistence;
/**
 * 用户持久化类
 *
 */
public class User {
   private String username;       //登录用户名
   private String pass;            //用户密码
   private String age;           //用户的年龄
   private String gener;        //用户性别
   private String birthday;         //用户出生年月
   private String phone;            //用户电话
   private String zjlx;            //用户证件类型
   private String zjhm;          //用户的证件号码
   private String  address;           //用户地址
   private String remark1;        //备注1
   private String remark2;           //备注2
   private String remark3;           //备注3
   private String remark4;           //备注4
   private String remark5;           //备注5
   private String roleid;           //用户角色
   private String loginstatus;           //登录状态
   private String logindate;           //登录日期
   private String loginnum;           //登录时错误次数
   private String personstatus;           //用户状态
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getGener() {
	return gener;
}
public void setGener(String gener) {
	this.gener = gener;
}
public String getBirthday() {
	return birthday;
}
public void setBirthday(String birthday) {
	this.birthday = birthday;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getZjlx() {
	return zjlx;
}
public void setZjlx(String zjlx) {
	this.zjlx = zjlx;
}
public String getZjhm() {
	return zjhm;
}
public void setZjhm(String zjhm) {
	this.zjhm = zjhm;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getRemark1() {
	return remark1;
}
public void setRemark1(String remark1) {
	this.remark1 = remark1;
}
public String getRemark2() {
	return remark2;
}
public void setRemark2(String remark2) {
	this.remark2 = remark2;
}
public String getRemark3() {
	return remark3;
}
public void setRemark3(String remark3) {
	this.remark3 = remark3;
}
public String getRemark4() {
	return remark4;
}
public void setRemark4(String remark4) {
	this.remark4 = remark4;
}
public String getRemark5() {
	return remark5;
}
public void setRemark5(String remark5) {
	this.remark5 = remark5;
}
public String getRoleid() {
	return roleid;
}
public void setRoleid(String roleid) {
	this.roleid = roleid;
}
public String getLoginstatus() {
	return loginstatus;
}
public void setLoginstatus(String loginstatus) {
	this.loginstatus = loginstatus;
}
public String getLogindate() {
	return logindate;
}
public void setLogindate(String logindate) {
	this.logindate = logindate;
}
public String getLoginnum() {
	return loginnum;
}
public void setLoginnum(String loginnum) {
	this.loginnum = loginnum;
}
public String getPersonstatus() {
	return personstatus;
}
public void setPersonstatus(String personstatus) {
	this.personstatus = personstatus;
}

}