package com.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Myproduct {
	@Id
	private String id;
	private String name;
	private Double sal;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Myproduct [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	public Myproduct(String name, Double sal) {
		super();
		this.name = name;
		this.sal = sal;
	}
	
	

}
