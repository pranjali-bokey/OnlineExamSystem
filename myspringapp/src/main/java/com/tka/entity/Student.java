package com.tka.entity;

public class Student {
private int sid;
private String sname;
private int sage;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + "]";
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public int getSage() {
	return sage;
}
public void setSage(int sage) {
	this.sage = sage;
}
}
