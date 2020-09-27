package com.vti.demo.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.vti.demo.entity.Department;
import com.vti.demo.validation.OnUpdate;
import com.vti.demo.validation.Oncreate;


public class DepartmentDTO {
	
	@Min(value = 0, groups = Oncreate.class)
	@Min(value = 1, groups = OnUpdate.class)
	private int id;
	
	@NotNull(groups = {Oncreate.class, OnUpdate.class})
	private String name;
	
	public DepartmentDTO() {
	}

	public DepartmentDTO(int id, String name) {
		this.id = id;
		this.name = name;
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
	
	public Department toEntity() {
		return new Department(name);
	}

	@Override
	public String toString() {
		return "DepartmentDTO [id=" + id + ", name=" + name + "]";
	}
}