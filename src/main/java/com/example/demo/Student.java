package com.example.demo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Student {
	private Integer age;
	private String name;
	private Integer id; 
	
	
	//@DateTimeFormat(pattern = "yyyy-MM-dd")// funziona solo da wildfly 10.1 in poi
	private Date dataAssunzione;

	public Date getDataAssunzione() {
		return dataAssunzione;
	}

	public void setDataAssunzione(Date dataAssunzione) {
		this.dataAssunzione = dataAssunzione;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}
}
