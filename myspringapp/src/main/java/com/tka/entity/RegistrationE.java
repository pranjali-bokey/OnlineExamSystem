package com.tka.entity;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RegistrationE {
	@Id
 private int ID;
 private String FirstName;
 private String LastName;
 private Date Dob;
 private Double Salary;
 private String Gender;
 private Boolean IsEligible;
 private String Username;
 private String Departmant;

 
public RegistrationE() {
	super();
	// TODO Auto-generated constructor stub
}
public RegistrationE(int iD, String firstName, String lastName, Date dob, Double salary, String gender,
		Boolean isEligible, String username, String departmant) {
	super();
	ID = iD;
	FirstName = firstName;
	LastName = lastName;
	Dob = dob;
	Salary = salary;
	Gender = gender;
	IsEligible = isEligible;
	Username = username;
	Departmant = departmant;
}
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public Date getDob() {
	return Dob;
}
public void setDob(Date dob) {
	Dob = dob;
}
public Double getSalary() {
	return Salary;
}
public void setSalary(Double salary) {
	Salary = salary;
}
public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	Gender = gender;
}
public Boolean getIsEligible() {
	return IsEligible;
}
public void setIsEligible(Boolean isEligible) {
	IsEligible = isEligible;
}
public String getUsername() {
	return Username;
}
public void setUsername(String username) {
	Username = username;
}
public String getDepartmant() {
	return Departmant;
}
public void setDepartmant(String departmant) {
	Departmant = departmant;
}
@Override
public String toString() {
	return "RegistrationE [ID=" + ID + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Dob=" + Dob
			+ ", Salary=" + Salary + ", Gender=" + Gender + ", IsEligible=" + IsEligible + ", Username=" + Username
			+ ", Departmant=" + Departmant + "]";
}
 
 
}
