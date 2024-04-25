package com.tka.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User1 {
	@Id
private int uid;
private String uname;
private String upassword;
private int uage;
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getUpassword() {
	return upassword;
}
public void setUpassword(String upassword) {
	this.upassword = upassword;
}
public int getUage() {
	return uage;
}
public void setUage(int uage) {
	this.uage = uage;
}
public User1() {
	super();
	// TODO Auto-generated constructor stub
}
public User1(int uid, String uname, String upassword, int uage) {
	super();
	this.uid = uid;
	this.uname = uname;
	this.upassword = upassword;
	this.uage = uage;
}
@Override
public String toString() {
	return "User1 [uid=" + uid + ", uname=" + uname + ", upassword=" + upassword + ", uage=" + uage + "]";
}


}
