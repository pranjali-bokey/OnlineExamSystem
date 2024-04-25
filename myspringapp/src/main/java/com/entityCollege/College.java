package com.entityCollege;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class College {
	@Id
private int id;
@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + "]";
	}
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
public College() {
		super();
		// TODO Auto-generated constructor stub
	}
public College(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
private String name;
}
