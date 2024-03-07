package com.example.demo;

import java.util.Date;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Student {
	private Integer age;

	//list annotations
	//https://www.geeksforgeeks.org/hibernate-validator-with-example/
	@NotBlank(message = "Name is mandatory")
	@Size(min = 2, max = 14)
	private String name;

	@NotNull
	private Integer id;

	// @DateTimeFormat(pattern = "yyyy-MM-dd")// funziona solo da wildfly 10.1 in
	// poi
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
